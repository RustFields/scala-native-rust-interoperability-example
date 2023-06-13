import java.io.FileOutputStream
import java.io.OutputStream

tasks.register("generateHeaders") {
    project.exec {
        commandLine("cbindgen")
    }
}

tasks.register("test") {
}

tasks.register("cargoBuildDebug") {
    project.exec {
        commandLine("cargo", "build")
    }
}

tasks.register("cargoBuildRelease") {
    project.exec {
        commandLine("cargo", "build", "--release")
    }
}
