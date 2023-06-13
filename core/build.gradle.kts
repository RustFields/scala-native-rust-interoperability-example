tasks.register("test") {
}

tasks.register("sbtNativeLink") {
    project.exec {
        commandLine("sbt", "nativeLink")
    }
}
