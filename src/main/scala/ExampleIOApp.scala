import cats.effect.{ExitCode, IO, IOApp}
import com.twitter.finagle.http.Request
import io.chrisdavenport.log4cats.Logger
import io.chrisdavenport.log4cats.slf4j.Slf4jLogger
import io.github.felixbr.finagle.core.effect.TwitterDurationConversions
import io.github.felixbr.finagle.http.effect.client.FinagleHttpClientBuilder
import org.slf4j.LoggerFactory.getLogger
import scala.concurrent.duration.DurationInt

/*
  Below is an example app built with the FinagleHttpClientBuilder wrapping a Cats Monad IO
 */
object ExampleIOApp extends IOApp with TwitterDurationConversions {
  implicit def log: Logger[IO] = Slf4jLogger.getLogger[IO]

  private[this] val queryLogger = getLogger("queries")

  /*
    The below syntax is quite similar to how you build a Http4s client
   */
  override def run(args: List[String]): IO[ExitCode] =
    FinagleHttpClientBuilder[IO]
      .withUpdatedConfig(_.withRequestTimeout(5.seconds))
      .serviceResource("google.com:80")
      .use { googleClient =>
        for {
          _     <- log.info(s"Sending Request")
          res   <- googleClient(Request())
          _     <- log.info(s"Received: ${res.contentString.take(200)}")
          _     <- log.info("Done")
        } yield ExitCode.Success
      }

}
