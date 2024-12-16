plugins {
    id("terminal.kotlin")
    id("terminal.publish")
}

dependencies {
    api(project(":terminal-kotlin-client-okhttp"))
}
