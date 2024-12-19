plugins {
    id("terminal.kotlin")
    application
}

dependencies {
    implementation(project(":terminal-kotlin"))
}

application {
    mainClass = "shop.terminal.api.example.MainKt"
}
