import Model.artist.Artist
import cats.Monad
import cats.effect.{IO, IOApp}
import cats.effect.unsafe.IORuntime
import org.http4s.HttpRoutes
import org.http4s.Method.GET
import org.http4s.Status.Ok
import org.http4s.dsl.Http4sDsl

object routes extends IOApp {
  /*
    Endpoints are just routes that follow CRUD operations:
    - Declare each endpoint and thus the route
    - Type out what the Route should look like
    - Translate the route into a series of methods that return data

    Question: should we create ROUTES for 200, 401, 403, 429 etc

    Note that for the below endpoint, you should just receive all the Response data and not just some of it
   */

  // You need to re-read the Spotify Web API documentation since you're a little bit outside of your comfort zone

  // HTTP Response 200 - Good response
  // GET /artists?SpotifyID=0TnOYISbd1XYRBk9myaseg
  def artistRoutes[F[_]: Monad]: HttpRoutes[F] = {
    val dsl = Http4sDsl[F]
    import dsl._
    HttpRoutes.of[F] {
      case GET -> Root/ "artist" :? // the rest a regex search param of what you would input in the uri
    }
  }

}
