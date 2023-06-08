import java.io.FileOutputStream
import java.io.OutputStream

tasks.register("printPath") {
    println("${rootProject.projectDir}/core/src/main/resources/scala-native")
}

tasks.register("generateHeaders") {
    val outputFile = File("${rootProject.projectDir}/core/src/main/resources/scala-native/operations.h")
    val outputStream: OutputStream = FileOutputStream(outputFile)
    project.exec {
        standardOutput = outputStream
        commandLine("cbindgen")
    }
}

tasks.register("test") {
}

tasks.register("buildDebug") {
    project.exec {
        commandLine("cargo", "build")
    }
}

tasks.register("buildRelease") {
    project.exec {
        commandLine("cargo", "build", "--release")
    }
}
