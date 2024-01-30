import Model.artist.Artist
import cats.effect.IO
import cats.effect.unsafe.IORuntime
import org.http4s.HttpRoutes
import org.http4s.Method.GET
import org.http4s.Status.Ok


// we're skipping over the OAuth element and acting as if the below GET method fetches the data that we require
object routes {

  // should we not declare this in the main?
  implicit val runtime: IORuntime = cats.effect.unsafe.IORuntime.global

  /*
  You need to understand what the aim of the routes is? Taking data, deserialising it and storing it in an in-mem DB
  Note that this project is a read only project of the data you are requesting from Spotify
   */
  def getArtistData(artist: Artist): IO[Artist] = ???

  val artistFetch = HttpRoutes.of[IO] {
    case GET -> Root / "artists" =>
      getArtistData().flatMap(Ok(_))
  }

}
