import cats.effect.{ExitCode, IO, IOApp}
import com.twitter.finagle.http.Request
import io.chrisdavenport.log4cats.Logger
import io.chrisdavenport.log4cats.slf4j.Slf4jLogger
import io.github.felixbr.finagle.core.effect.TwitterDurationConversions
import io.github.felixbr.finagle.http.effect.client.FinagleHttpClientBuilder
import org.http4s.ember.server.EmberServerBuilder
import org.slf4j.LoggerFactory.getLogger

import scala.concurrent.duration.DurationInt

/*
  Below is an example app built with the FinagleHttpClientBuilder wrapping a Cats Monad IO
 */
object MainIOApp extends IOApp {
  implicit def log: Logger[IO] = Slf4jLogger.getLogger[IO]

  /*
    Are we not simply replicating the binding server which brings together the internal business logic with all the different servers?
   */
  override def run(args: List[String]): IO[ExitCode] =
    EmberServerBuilder
      .default[IO]
      .withHost(ipv4"0.0.0.0")
      .withHttpApp()
      .build
      .use(_ => IO.never)
      .as(ExitCode.Success)
}
