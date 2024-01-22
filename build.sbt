ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "SpotifyAPI"
  )

lazy val http4sVersion = "1.0.0-M40"

libraryDependencies ++= Seq(

  // Cats
  "org.typelevel"                   %% "cats-core"              % "2.9.0",

  // Cats Effect
  "org.typelevel"                   %% "cats-effect"            % "3.4.4",

  // FS2
  //  "co.fs2"                  %% "fs2-core"               % "3.7.0",

  // Postgres
  "org.postgresql"                  % "postgresql"              % "42.6.0",

  // Doobie
//    "org.tpolecat"        %% "doobie-core"          % "0.13.4",
//    "org.tpolecat"        %% "doobie-postgres"      % "0.13.4",

  // Circe
  "io.circe"                        %% "circe-parser"           % "0.14.5",
  "io.circe"                        %% "circe-core"             % "0.14.5",
  "io.circe"                        %% "circe-generic"          % "0.14.5",

  // Log4s
  "org.log4s"                       %% "log4s"                  % "1.10.0",
  "org.apache.logging.log4j"        % "log4j-core"              % "2.20.0",

  // http4s (without the core, client and server)
  "org.http4s"                      %% "http4s-ember-client"    % http4sVersion,
  "org.http4s"                      %% "http4s-ember-server"    % http4sVersion,
  "org.http4s"                      %% "http4s-dsl"             % http4sVersion,

  // scache
  // "com.evolution"           %% "scache"                 % "4.40",

  // OAuth Libraries -> i think that you're going one step ahead with OAuth
//  "com.ocadotechnology"             %% "sttp-oauth2"             % "0.17.0-RC1",
//  "com.ocadotechnology"             %% "sttp-oauth2-circe"       % "0.17.0-RC1",

  // Testing Frameworks
  "org.scalactic"                   %% "scalactic"               % "3.2.16"      % Test,
  "org.scalatest"                   %% "scalatest"               % "3.2.16"      % Test,
  "org.scalameta"                   %% "munit"                   %"0.7.29"       % Test,
  "com.disneystreaming"             %% "weaver-cats"             % "0.8.3"       % Test,
)

testFrameworks += new TestFramework("weaver.framework.CatsEffect")