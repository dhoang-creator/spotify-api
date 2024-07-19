package Routes

import cats.effect.IO
import org.http4s.HttpRoutes
import org.http4s.Method.POST
import shapeless.ops.zipper.Root

object Routes {

  val clientCredentials = HttpRoutes.of[IO] {
    case POST -> Root / "token_endpoint_URI" / accessToken =>
      for {
        // You need to put the Curl command in a Seq inside a case class in order to pass it in the below for comprehension
        import Authenticator.
          firstCurl <-
      } yield (resp)
  }

}
