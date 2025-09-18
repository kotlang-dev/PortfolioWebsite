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
            icon = Res.Image.APP_ICON,
            title = "Age Calculator (KMP)",
            description = "A multiplatform app for Android & Desktop with a shared codebase using Compose.",
            link = "/projects/age-calculator",
            tags = listOf("Kotlin Multiplatform", "Compose", "Room DB", "Koin (DI)")
        ),
        PortfolioItem(
            icon = Res.Image.APP_ICON,
            title = "QuizTime App",
            description = "A full-stack quiz app with a Ktor backend and a Jetpack Compose client.",
            link = "/projects/quiz-time",
            tags = listOf("Ktor", "Jetpack Compose", "Coroutines", "SQLDelight")
        ),
        PortfolioItem(
            icon = Res.Image.APP_ICON,
            title = "MeasureMate App",
            description = "A fitness tracking app built with Jetpack Compose and Firebase.",
            link = "/projects/measure-mate",
            tags = listOf("Firebase", "Jetpack Compose", "Dagger Hilt", "MVVM")
        )
    )

    val courses = listOf(
        PortfolioItem(
            icon = Res.Image.APP_ICON,
            title = "Android Quiz App",
            description = "Learn to build a full-stack Android app from scratch with modern technologies.",
            link = "/courses/quiz-app",
            tags = listOf("Ktor Backend", "Jetpack Compose", "MVVM", "REST API")
        ),
        PortfolioItem(
            icon = Res.Image.APP_ICON,
            title = "Android Fitness App",
            description = "Build a complete fitness app and master Firebase integration with Jetpack Compose.",
            link = "/courses/fitness-app",
            tags = listOf("Firebase", "Jetpack Compose", "Authentication", "Firestore")
        )
    )
}