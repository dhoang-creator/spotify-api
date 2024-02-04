package Authentication

import cats.data.{Kleisli, OptionT}
import cats.effect.IO
import org.http4s.Request

/*
  Rather than taking in the username and the password ourselves, we are just taking in a client credential
    - which should be a string
    - do we have to interact with the Spotify Accounts API to validate that the client credentials are correct or just go primitive and bring up an error on our side?
 */
case class accessToken(id: Long, name: String)

object user {
  /*
    What do we want to do in this object?
      - check if the access_token is valid?
      - if the access_token is valid then we ping a request to a http_route which allows for the user to make a request
   */


  // this was taken from the http4s page
  val authUser1: Kleisli[OptionT[IO, ?], Request[IO], accessToken] = Kleisli(_ => OptionT.liftF(IO(???)))
}
