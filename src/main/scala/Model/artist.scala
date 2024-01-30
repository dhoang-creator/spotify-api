package Model

object artist {

  /*
  We need to better understand JSON data structures given that many of the below are nested
   */
  private type Spotify = String
  private type followersHref = String
  private type Total = Option[Int]
  private type Genres = List[String]
  private type Href = String
  private type Id = String
  private type Url = Option[String]
  private type Height = Int
  private type Width = Int

  private type Name = List[String]
  private type Popularity = Option[Int]
  private type Profession = List[String]
  private type Uri = String


  case class Artist(
                   externalUrl: ExternalUrl,
                   followers: Followers,
                   genres: Genres,
                   href: Href,
                   id: Id,
                   images: List[Images],
                   name: Name,
                   popularity: Popularity,
                   profession: Profession,
                   uri: Uri
                   )

  final case class ExternalUrl(spotify: Spotify)
  final case class Followers(href: followersHref, total: Total)
  final case class Images(url: Url, height: Height, width: Width)
}

