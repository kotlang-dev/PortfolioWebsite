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

@Page(Routes.PROJECTS_KINEX)
@Composable
fun KinexPage() {
    ProjectShowcaseLayout(
        pageTitle = "Kinex - Gym Workout Guide",
        pageDescription = "Kinex is a modern, offline-first android application, built entirely with Kotlin and Jetpack Compose",
        playStoreLink = Res.Link.AGE_CALC_PLAYSTORE, //TODO update this link
        coverImage = "/projects/kinex/cover.jpeg",
        screenshots = listOf(
            "/projects/kinex/screenshot_01.png",
            "/projects/kinex/screenshot_02.png",
            "/projects/kinex/screenshot_03.png",
            "/projects/kinex/screenshot_04.png",
            "/projects/kinex/screenshot_05.png",
            "/projects/kinex/screenshot_06.png",
            "/projects/kinex/screenshot_07.png",
            "/projects/kinex/screenshot_08.png"
        ),
        techStack = listOf(
            TechStack.Compose,
            TechStack.RoomDB,
            TechStack.Supabase,
            TechStack.Media3,
            TechStack.Koin,
            TechStack.PreferenceDataStore
        ),
        descriptionContent = {
            SpanText(
                text = "A modern, offline-first fitness app where users can create custom workouts, browse a rich exercise library, and watch exercises through a custom-built video player with offline caching.",
                modifier = ShowcaseDescriptionStyle.toModifier()
            )
            SpanText(
                text = "It also features an interactive BMI calculator, along with an adaptive design system that supports both Light and Dark themes",
                modifier = ShowcaseDescriptionStyle.toModifier()
            )
        }
    )
}
