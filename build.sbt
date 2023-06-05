scalaVersion := "3.2.2"

// set to Debug for compilation details (Info is default)
logLevel := Level.Info
nativeLinkStubs := true
// import to add Scala Native options
import scala.scalanative.build.*

// defaults set with common options shown
nativeConfig ~= { c =>
  c.withLTO(LTO.none) // thin
    .withMode(Mode.debug) // releaseFast
    .withGC(GC.immix) // commix
}

lazy val root = project
  .in(file("./core"))
  .settings(
    name := "scala-native-rust-interoperability-example",
  ).enablePlugins(ScalaNativePlugin)
