ThisBuild / organization := "io.github.filippovissani"
ThisBuild / version      := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.2.2"

lazy val root = (project in file("."))
  .settings(
    name := "scala-native-rust-interoperability-example",
  )

enablePlugins(ScalaNativePlugin)
nativeLinkStubs := true
// set to Debug for compilation details (Info is default)
logLevel := Level.Info
// import to add Scala Native options
import scala.scalanative.build.*

// defaults set with common options shown
nativeConfig ~= { c =>
  c.withLTO(LTO.none) // thin
    .withMode(Mode.debug) // releaseFast
    .withGC(GC.immix) // commix
}

nativeLinkingOptions ++= {
  val path = s"${baseDirectory.value.getParentFile}/native/target/release"
  val library = "operations"
  Seq(s"-L$path", "-rpath", path, s"-l$library")
}
