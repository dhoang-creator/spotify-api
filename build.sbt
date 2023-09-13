ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "SpotifyAPI"
  )

/*
  Because we have taken Finch and Finagle out of the equation, we could retropull all the differing library versions
 */

libraryDependencies ++= Seq(

  // Cats
  "org.typelevel"       %% "cats-core"            % "2.9.0",

  // Cats Effect
  "org.typelevel"       %% "cats-effect"          % "3.6-0142603",

  // FS2
  //  "co.fs2"                  %% "fs2-core"               % "3.7.0",

  // Postgres
  "org.postgresql"      % "postgresql"            % "42.6.0",

  // Doobie
  "org.tpolecat"        %% "doobie-core"          % "0.13.4",
  "org.tpolecat"        %% "doobie-postgres"      % "0.13.4",

  // Circe
  "io.circe"            %% "circe-parser"         % "0.14.5",
  "io.circe"            %% "circe-core"           % "0.14.5",
  "io.circe"            %% "circe-generic"        % "0.14.5",

  // Log4s
  "org.log4s"           %% "log4s"               % "1.10.0",
  "org.apache.logging.log4j" % "log4j-core" % "2.20.0",

  // http4s - it looks like http4s has been deprecated after 2021
//  "org.http4s"          %% "http4s-ember-client" % "1.0-234-d1a2b53",
//  "org.http4s"          %% "http4s-ember-server" % "1.0-234-d1a2b53",

  // Softwaremill http4s backend
  "com.softwaremill.sttp.client3" %% "http4s-backend" % "3.8.11",

  // scache
//    "com.evolution"           %% "scache"                 % "4.40",

  // Testing Frameworks
  "org.scalactic"       %% "scalactic"            % "3.2.16"      % Test,
  "org.scalatest"       %% "scalatest"            % "3.2.16"      % Test,
  "com.disneystreaming" %% "weaver-cats"          % "0.8.3"       % Test
)