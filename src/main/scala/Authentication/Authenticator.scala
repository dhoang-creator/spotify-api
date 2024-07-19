package Authentication

import scala.concurrent.duration._

object Authenticator {

  final case class User()

  final case class accessToken(token: String, tokenType: String, expiry: Duration(expiry, "millis"))

  // Note that the first part of the curl is the POST command you write with your own POST Method
  // -> how do you nest a sequence within another sequence
  val clientCurl = Seq("-H", "Content-Type", "application/x-www-form-urlencoded")
}