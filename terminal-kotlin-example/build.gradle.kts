plugins {
    id("terminal.kotlin")
    application
}

dependencies {
    implementation(project(":terminal-kotlin-core"))
    implementation(project(":terminal-kotlin-client-okhttp"))
}

application {
    // Use `./gradlew :terminal-kotlin-example:run` to run `Main`
    // Use `./gradlew :terminal-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "shop.terminal.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
