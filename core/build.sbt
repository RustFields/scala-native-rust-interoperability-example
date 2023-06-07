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
