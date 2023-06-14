tasks.register("test") {
}

tasks.register("sbtNativeLink") {
    project.exec {
        commandLine("sbt", "nativeLink")
    }
}

tasks.register("sbtRun") {
    project.exec {
        commandLine("sbt", "run")
    }
}
