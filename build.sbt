
val SlickPGVersion = "0.19.7"
val SlickVersion = "3.3.3"

libraryDependencies ++= Seq(
  "com.github.tminglei" %% "slick-pg" % SlickPGVersion,
  "com.typesafe.slick" %% "slick" % SlickVersion,
  "com.typesafe.slick" %% "slick-hikaricp" % SlickVersion,
  "org.postgresql"     % "postgresql"              % "42.2.17",
)

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.8"

lazy val root = (project in file("."))
  .settings(
    name := "test-hangout1"
  )
