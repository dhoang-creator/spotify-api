object Routes {

  /*
  Given the size of the API and the variety of endpoints, how should we go about compartmentalising it?

  We need to determine the data model of the API before fleshing out all of the CRUD methods below
  
  The Request Response guidelines on the Spotify for Developers website can walk you through the different response types 
   */

  val service = HttpRoutes.of[IO] {
    case GET -> Root =>

  }

}
