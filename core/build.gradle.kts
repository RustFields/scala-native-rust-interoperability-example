tasks.register("printProjectRoot") {
    doLast {
        println(rootProject.projectDir)
    }
}

tasks.register("test") {
}

tasks.register("nativeLink") {
}

tasks.register("run") {
}