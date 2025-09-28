package org.kotlang.portfolio.pages.projects

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import org.kotlang.portfolio.components.layout.ProjectShowcaseLayout
import org.kotlang.portfolio.models.Routes
import org.kotlang.portfolio.models.TechStack
import org.kotlang.portfolio.util.Res

@Page(Routes.PROJECTS_AGE_CALCULATOR)
@Composable
fun AgeCalculatorPage() {
    ProjectShowcaseLayout(
        pageTitle = "Age Calculator - Track Dates (KMP)",
        pageDescription = "A modern, offline-first app designed to track the age of important life events, built with Kotlin Multiplatform.",
        githubLink = Res.Link.AGE_CALC_GITHUB,
        playStoreLink = Res.Link.AGE_CALC_PLAYSTORE,
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
        )
    )
}
