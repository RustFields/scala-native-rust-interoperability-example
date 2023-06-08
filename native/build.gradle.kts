tasks.register("printProjectRoot") {
    doLast {
        println(rootProject.projectDir)
    }
}

tasks.register("generateHeaders") {
}

tasks.register("test") {
}

tasks.register("buildDebug") {
}

tasks.register("buildRelease") {
}
