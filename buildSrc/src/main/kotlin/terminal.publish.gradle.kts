import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    signAllPublications()
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    coordinates(project.group.toString(), project.name, project.version.toString())

    pom {
        name.set("Terminal API")
        description.set("The Terminal API gives you access to the same API that powers the award winning\nTerminal SSH shop (`ssh terminal.shop`).")
        url.set("https://terminal.shop/docs")

        licenses {
            license {
                name.set("Apache-2.0")
            }
        }

        developers {
            developer {
                name.set("Terminal")
                email.set("dev@terminal.com")
            }
        }

        scm {
            connection.set("scm:git:git://github.com/terminaldotshop/terminal-sdk-kotlin.git")
            developerConnection.set("scm:git:git://github.com/terminaldotshop/terminal-sdk-kotlin.git")
            url.set("https://github.com/terminaldotshop/terminal-sdk-kotlin")
        }
    }
}
