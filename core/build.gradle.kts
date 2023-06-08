tasks.register("test") {
}

tasks.register("nativeLink") {
    project.exec {
        commandLine("sbt", "nativeLink")
    }
}
