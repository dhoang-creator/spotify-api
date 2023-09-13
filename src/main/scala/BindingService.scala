import org.http4s.ember.server.EmberServerBuilder

object BindingService {

  implicit val loggerFactory: LoggerFactory[IO] = Slf4jFactory.create[IO]

  val services = ???
  val httpApp = ???

  val server = EmberServerBuilder
    .default[IO]
    .withHost(ipv4"0.0.0.0")
    .withPort(port"8080")
    .withHttpApp(httpApp)
    .build
}
