package org.kotlang.portfolio.pages.projects

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import org.kotlang.portfolio.components.layout.ProjectShowcaseLayout
import org.kotlang.portfolio.models.Routes
import org.kotlang.portfolio.models.TechStack
import org.kotlang.portfolio.util.Res

@Page(Routes.PROJECTS_KINEX)
@Composable
fun KinexPage() {
    ProjectShowcaseLayout(
        pageTitle = "Kinex - Gym Workout Guide",
        pageDescription = "Kinex is a modern, offline-first Android application designed to be the perfect companion for gym-goers of all levels. Built entirely with Kotlin and Jetpack Compose",
        playStoreLink = Res.Link.AGE_CALC_PLAYSTORE, //TODO update this link
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
        )
    )
}
