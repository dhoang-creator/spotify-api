package Artist

import cats.effect.IO

/*
  You've broken down the Response data outlined on the Spotify for developers page but we also need to think about whether the Spotify DB mirrors the data we've stated in the below
 */

sealed trait Artist

case class externalUrls(spotify: String) extends Artist
case class url(url: String) extends Artist
case class followers(href: String, total: Int) extends Artist
case class genres(genre: Array[String]) extends Artist
case class popularity(popularityValue: Int) extends Artist
case class artistImage(url: url, height: Int, width: Int) extends Artist
case class artistId(name: String, href: String, artistType: String, uri: String) extends Artist

case class artist(artistId: artistId, genres: genres, followers: followers, popularity: popularity, artistImage: artistImage, externalUrls: externalUrls) extends Artist

object artist {

  /*
    You wanted to separate the functionality between the effectual and the business logic but surely they interact in the below regard
   */
  // we need to think about how we deal with the information after a URL -> whether this is a JSON object or String?
  def getArtist(artistUrl: url): Either[IO, Error] = ???

}
