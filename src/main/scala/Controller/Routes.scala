package Controller

import Model.artist.Artist
import cats.effect.IO
import cats.effect.unsafe.IORuntime
import org.http4s.HttpRoutes
import org.http4s.Method.GET
import org.http4s.Status.Ok


// we're skipping over the OAuth element and acting as if the below GET method fetches the data that we require
object Routes {

  // should we not declare this in the main?
  implicit val runtime: IORuntime = cats.effect.unsafe.IORuntime.global

  //
  def getArtistData(artist: Artist): IO[Artist] = ???

  val artistFetch = HttpRoutes.of[IO] {
    case GET -> Root / "artists" =>
      getArtistData().flatMap(Ok(_))
  }

}
