package Artist

/*
  You've broken down the Response data outlined on the Spotify for developers page but we also need to think about whether the Spotify DB mirrors the data we've stated in the below
 */

sealed trait artistIdentifier

case class externalUrls(spotify: String) extends artistIdentifier
case class url(url: String) extends artistIdentifier
case class followers(href: String, total: Int) extends artistIdentifier
case class genres(genre: Array[String]) extends artistIdentifier
case class popularity(popularityValue: Int) extends artistIdentifier
case class artistImage(url: url, height: Int, width: Int) extends artistIdentifier
case class artistId(name: String, href: String, artistType: String, uri: String) extends artistIdentifier

case class artist(artistId: artistId, genres: genres, followers: followers, popularity: popularity, artistImage: artistImage, externalUrls: externalUrls) extends artistIdentifier

/*
  Thinking aside the request response pattern here for the above data, we need to think about the logic held within the below object
  1. We should be able to validate the input type
 */

object artist {

}
