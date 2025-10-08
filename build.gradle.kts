plugins {
    id("org.jetbrains.dokka") version "2.0.0"
}

repositories {
    mavenCentral()
}

allprojects {
    group = "shop.terminal.api"
    version = "2.5.0" // x-release-please-version
}

subprojects {
    // These are populated with dependencies by `buildSrc` scripts.
    tasks.register("format") {
        group = "Verification"
        description = "Formats all source files."
    }
    tasks.register("lint") {
        group = "Verification"
        description = "Verifies all source files are formatted."
    }
    apply(plugin = "org.jetbrains.dokka")
}

subprojects {
    apply(plugin = "org.jetbrains.dokka")
}

// Avoid race conditions between `dokkaHtmlCollector` and `dokkaJavadocJar` tasks
tasks.named("dokkaHtmlCollector").configure {
    subprojects.flatMap { it.tasks }
        .filter { it.project.name != "terminal-kotlin" && it.name == "dokkaJavadocJar" }
        .forEach { mustRunAfter(it) }
}
