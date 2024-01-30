import cats.effect.{ExitCode, IO, IOApp}
import org.http4s.ember.server.EmberServerBuilder
import org.http4s.server.Router
import org.typelevel.log4cats.LoggerFactory
import org.typelevel.log4cats.slf4j.Slf4jFactory

object main extends IOApp {

  override def run(args: List[String]): IO[ExitCode] = ???

  implicit val loggerFactory: LoggerFactory[IO] = Slf4jFactory.create[IO]

  val services = ???
  // following the below naming convention, surely you should refactor the Domain and the services to adhere to Http4s conventions
  val httpApp = Router("/" -> artistDataService).orNotFound

  val server = EmberServerBuilder
    .default[IO]
    .withHost(ipv4"0.0.0.0")
    .withPort(port"8080")
    .withHttpApp(httpApp)
    .build
}
