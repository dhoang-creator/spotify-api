package Model

object artist {

  /*
  We need to better understand JSON data structures given that many of the below are nested
   */
  type Spotify = String
  type followersHref = String
  type Total = Option[Int]
  type Genres = List[String]
  type Href = String
  type Id = String
  type Url = Option[String]
  type Height = Int
  type Width = Int

  type Name = List[String]
  type Popularity = Option[Int]
  type Profession = List[String]
  type Uri = String

  /*
    How do we deal with nested JSON responses? Do we nest types and case classes ourselves?
   */
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

