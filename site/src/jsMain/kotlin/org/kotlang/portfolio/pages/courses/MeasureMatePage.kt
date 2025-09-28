package org.kotlang.portfolio.pages.courses

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.kotlang.portfolio.components.layout.ProjectShowcaseLayout
import org.kotlang.portfolio.models.Routes
import org.kotlang.portfolio.models.TechStack
import org.kotlang.portfolio.theme.ShowcaseDescriptionStyle
import org.kotlang.portfolio.util.Res

@Page(Routes.COURSES_MEASURE_MATE)
@Composable
fun MeasureMatePage() {
    ProjectShowcaseLayout(
        pageTitle = "MeasureMate Android App",
        pageDescription = "A comprehensive fitness tracking app built with Jetpack Compose and Firebase",
        githubLink = Res.Link.MEASUREMATE_GITHUB,
        courseLink = Res.Link.MEASUREMATE_COURSE,
        coverImage = "/courses/measure_mate/cover.jpeg",
        screenshots = listOf(
            "/courses/measure_mate/screenshot_01.png",
            "/courses/measure_mate/screenshot_02.png",
            "/courses/measure_mate/screenshot_03.png",
            "/courses/measure_mate/screenshot_04.png",
            "/courses/measure_mate/screenshot_05.png",
            "/courses/measure_mate/screenshot_06.png"
        ),
        techStack = listOf(
            TechStack.Compose,
            TechStack.ComposeCanvas,
            TechStack.Firebase,
            TechStack.DaggerHilt,
            TechStack.ComposeNavigation
        ),
        descriptionContent = {
            SpanText(
                text = "A fitness tracking app built with Jetpack Compose and Material 3, featuring a modern, declarative UI.",
                modifier = ShowcaseDescriptionStyle.toModifier()
            )
            SpanText(
                text = "Powered by Firebase for authentication and real-time Firestore data, the app ensures secure sign-ins and smooth syncing. Dagger Hilt is used for dependency management.",
                modifier = ShowcaseDescriptionStyle.toModifier()
            )
        }
    )
}
