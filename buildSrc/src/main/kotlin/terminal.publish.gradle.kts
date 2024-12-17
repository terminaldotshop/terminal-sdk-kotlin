import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.register
import org.gradle.kotlin.dsl.get
import com.vanniktech.maven.publish.JavaLibrary
import com.vanniktech.maven.publish.JavadocJar
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

    this.coordinates(project.group.toString(), project.name, project.version.toString())

    pom {
        name.set("Terminal API")
        description.set("Development documentation")
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
