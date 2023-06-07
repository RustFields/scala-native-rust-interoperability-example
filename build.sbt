ThisBuild / organization := "io.github.filippovissani"
ThisBuild / version      := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.2.2"

lazy val core = (project in file("core"))
  .settings(
    name := "scala-native-rust-interoperability-example",
  )
