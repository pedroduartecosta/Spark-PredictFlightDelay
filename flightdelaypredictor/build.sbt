import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.5",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "flightDelayPredictor",
    fork in run := true,
    libraryDependencies += sparkCore,
    libraryDependencies += sparkSQL,
    libraryDependencies += sparkMLlib
  )
