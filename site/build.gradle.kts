import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication
import kotlinx.html.link
import kotlinx.html.meta
import kotlinx.html.script

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kobweb.application)
    alias(libs.plugins.kobwebx.markdown)
}

group = "org.kotlang.portfolio"
version = "1.0-SNAPSHOT"

kobweb {
    app {
        index {
            description.set("A portfolio for Mohammad Arif, an Android & Kotlin Multiplatform Developer and Content Creator specializing in modern, user-centric applications.")

            head.add {
                meta(name = "og:title", content = "Mohammad Arif - Android & Kotlin Multiplatform Developer")
                meta(
                    name = "og:description",
                    content = "A portfolio showcasing modern Android and Kotlin Multiplatform projects and courses."
                )
                meta(name = "og:image", content = "https://kotlang.dev/og_image.png")
                meta(name = "og:url", content = "https://kotlang.dev")
                meta(name = "og:type", content = "website")

                //Icon
                link(rel = "icon", href = "/favicon.ico")
                link(rel = "apple-touch-icon", href = "/apple-touch-icon.png") { attributes["sizes"] = "180x180" }

                // Link to the Web App Manifest
                link(rel = "manifest", href = "/site.webmanifest")

                //Swiper
                link(rel = "stylesheet", href = "https://cdn.jsdelivr.net/npm/swiper@12/swiper-bundle.min.css")
                script { src = "https://cdn.jsdelivr.net/npm/swiper@12/swiper-bundle.min.js" }
            }
        }
    }
}

kotlin {
    configAsKobwebApplication("portfolio")

    sourceSets {
        jsMain.dependencies {
            implementation(libs.compose.runtime)
            implementation(libs.compose.html.core)
            implementation(libs.kobweb.core)
            implementation(libs.kobweb.silk)
            implementation(libs.silk.icons.fa)
            implementation(libs.kobwebx.markdown)
            implementation(project(":worker"))
        }
    }
}
