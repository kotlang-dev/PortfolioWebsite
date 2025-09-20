package org.kotlang.portfolio.models

import org.kotlang.portfolio.util.Res

data class PortfolioItem(
    val icon: String,
    val title: String,
    val description: String,
    val link: String,
    val tags: List<String>
)

object PortfolioData {
    val projects = listOf(
        PortfolioItem(
            icon = Res.Image.APP_ICON_AGE_CALC,
            title = "Age Calculator (KMP)",
            description = "A multiplatform app for Android & Desktop with a shared codebase using Compose.",
            link = "/projects/age-calculator",
            tags = listOf("Compose Multiplatform", "Kotlinx DateTime", "Room DB", "Koin (DI)", "Pref DataStore")
        ),
        PortfolioItem(
            icon = Res.Image.APP_ICON_KINEX,
            title = "Kinex - Gym Workouts",
            description = "A full-stack quiz app with a Ktor backend and a Jetpack Compose client.",
            link = "/projects/kinex",
            tags = listOf("Ktor", "Jetpack Compose", "Coroutines", "SQLDelight")
        ),
        PortfolioItem(
            icon = Res.Image.APP_ICON_QUIZTIME,
            title = "Whiteboard",
            description = "A fitness tracking app built with Jetpack Compose and Firebase.",
            link = "/projects/whiteboard",
            tags = listOf("Firebase", "Jetpack Compose", "Dagger Hilt", "MVVM")
        )
    )

    val courses = listOf(
        PortfolioItem(
            icon = Res.Image.APP_ICON_QUIZTIME,
            title = "Android Quiz App",
            description = "A full-stack, interactive quiz app for Android built entirely with Kotlin.",
            link = "/courses/quiz-time",
            tags = listOf("Ktor Backend", "Jetpack Compose", "MongoDB", "Room", "Koin (DI)")
        ),
        PortfolioItem(
            icon = Res.Image.APP_ICON_MEASUREMATE,
            title = "Android Fitness App",
            description = "A fitness tracking app built with Jetpack Compose and Firebase.",
            link = "/courses/measure-mate",
            tags = listOf("Firebase", "Jetpack Compose", "Dagger Hilt (DI)", "Compose Navigation")
        )
    )
}