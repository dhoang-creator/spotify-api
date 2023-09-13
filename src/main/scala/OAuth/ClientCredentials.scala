package OAuth

/*
  We're working with a Scala OAuth library because unlike other public API Endpoints, Spotify doesn't issue JWT but ordinary Access Tokens
 */
class ClientCredentials {

  // the below code is courtesy of the 'sttp-oauth2' documentation which you'll have to flesh out yourself

  // Surely these urls are just the services we are running in order to fetch the Tokens and then to validate
  val accessTokenProvider = AccessTokenProvider[IO](tokenUrl, clientId, clientSecret)(backend) // is the backend in this Lambda, just an alias for the service which is being run?
  val tokenIntrospection = TokenIntrospection[IO](tokenIntrospectionUrl, clientId, clientSecret)(backend)
  val scope: Option[Scope] = Some("scope") // some scope is needed but why is this necessary?

  // Cats caching example below
  val delegate = AccessTokenProvider[IO](tokenUrl, clientId, clientSecret)(backend)
  CachingAccessTokenProvider.refCacheInstance[IO](delegate)

  val yieldingActiveResponse = for {
    token <- accessTokenProvider.requestToken(scope) // asking for a token
    response <- tokenIntrospection.introspect(token.accessToken) // check if Token is valid
  } yield response.active // is the token active?
}
