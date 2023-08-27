ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.9"

lazy val root = (project in file("."))
  .settings(
    name := "SpotifyAPI"
  )

libraryDependencies ++= Seq(

  // Cats
  "org.typelevel"       %% "cats-core"            % "2.0.0-RC2",

  // Cats Effect
  "org.typelevel"       %% "cats-effect"          % "2.0.0",

  // FS2
  //  "co.fs2"                  %% "fs2-core"               % "3.7.0",

  // Postgres
  "org.postgresql"      % "postgresql"            % "42.6.0",

  // Doobie
  "org.tpolecat"        %% "doobie-core"          % "0.8.0-RC1",
  "org.tpolecat"        %% "doobie-postgres"      % "0.8.0-RC1",

  // Circe
  "io.circe"            %% "circe-parser"         % "0.12.0-RC4",
  "io.circe"            %% "circe-core"           % "0.12.0-RC4",
  "io.circe"            %% "circe-generic"        % "0.12.0-RC4",

  // Finagle
  "com.twitter"         %% "finagle-http"         % "19.8.0",
  "io.github.felixbr"   %% "finagle-http-effect"  % "0.3.0",

  // Finch
  "com.github.finagle"  %% "finch-core"          % "0.30.0",
  "com.github.finagle"  %% "finch-circe"         % "0.30.0",

  // Log4Cats
  "io.chrisdavenport"   %% "log4cats-log4s"      % "0.4.0-M1",
  "io.chrisdavenport"   %% "log4cats-slf4j"      % "1.0.0-RC3",

  // Log4s
  "org.log4s"           %% "log4s"               % "1.8.2",
  "org.apache.logging.log4j" % "log4j-core" % "2.12.1",

  // http4s
//  "org.http4s"          %% "http4s-ember-client" % http4sVersion,
//  "org.http4s"          %% "http4s-ember-server" % http4sVersion,
//  "org.http4s"          %% "http4s-dsl" % http4sVersion,

  // scache
  //  "com.evolution"           %% "scache"                 % "5.1.2",

  // Testing Frameworks
  "org.scalactic"       %% "scalactic"            % "3.2.16"      % Test,
  "org.scalatest"       %% "scalatest"            % "3.2.16"      % Test,
//  "com.disneystreaming" %% "weaver-cats"          % "0.8.3"       % Test
)