package org.kotlang.portfolio.pages.projects

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.kotlang.portfolio.components.layout.ProjectShowcaseLayout
import org.kotlang.portfolio.models.Routes
import org.kotlang.portfolio.models.TechStack
import org.kotlang.portfolio.theme.ShowcaseDescriptionStyle
import org.kotlang.portfolio.util.Res

@Page(Routes.PROJECTS_AGE_CALCULATOR)
@Composable
fun AgeCalculatorPage() {
    ProjectShowcaseLayout(
        pageTitle = "Age Calculator - Track Dates (KMP)",
        pageDescription = "A modern, offline-first app designed to track the age of important life events.",
        githubLink = Res.Link.AGE_CALC_GITHUB,
        playStoreLink = Res.Link.AGE_CALC_PLAYSTORE,
        coverImage = "/projects/age_calculator/cover.jpeg",
        screenshots = listOf(
            "/projects/age_calculator/screenshot_01.png",
            "/projects/age_calculator/screenshot_02.png",
            "/projects/age_calculator/screenshot_03.png",
            "/projects/age_calculator/screenshot_04.png",
            "/projects/age_calculator/screenshot_05.png",
            "/projects/age_calculator/screenshot_06.png",
            "/projects/age_calculator/screenshot_07.png"
        ),
        desktopScreenshot = "/projects/age_calculator/screenshot_desktop.png",
        techStack = listOf(
            TechStack.ComposeMultiplatform,
            TechStack.RoomDB,
            TechStack.PreferenceDataStore,
            TechStack.KotlinxDateTime,
            TechStack.Koin
        ),
        descriptionContent = {
            SpanText(
                text = "A modern, offline-first app designed to track the age of important life events. This project showcases modern, multi-platform development best practices with a clean, shared architecture and a reactive, adaptive UI.",
                modifier = ShowcaseDescriptionStyle.toModifier()
            )
            SpanText(
                text = "It also features a fully automated CI/CD pipeline for desktop releases—all built with Kotlin Multiplatform and Compose Multiplatform.",
                modifier = ShowcaseDescriptionStyle.toModifier()
            )
        }
    )
}
