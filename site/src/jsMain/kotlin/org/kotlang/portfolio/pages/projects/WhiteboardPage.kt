package org.kotlang.portfolio.pages.projects

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import org.kotlang.portfolio.components.layout.ProjectShowcaseLayout
import org.kotlang.portfolio.models.Routes
import org.kotlang.portfolio.models.TechStack
import org.kotlang.portfolio.util.Res

@Page(Routes.PROJECTS_WHITEBOARD)
@Composable
fun WhiteboardPage() {
    ProjectShowcaseLayout(
        pageTitle = "Kinex - Gym Workout Guide",
        pageDescription = "Kinex is a modern, offline-first Android application designed to be the perfect companion for gym-goers of all levels. Built entirely with Kotlin and Jetpack Compose",
        githubLink = Res.Link.WHITEBOARD_GITHUB,
        techStack = listOf(
            TechStack.ComposeMultiplatform,
            TechStack.ComposeCanvas,
            TechStack.RoomDB,
            TechStack.Koin,
            TechStack.PreferenceDataStore
        )
    )
}
