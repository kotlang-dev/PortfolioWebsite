package org.kotlang.portfolio.pages.courses

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.kotlang.portfolio.components.layouts.ProjectShowcaseLayout
import org.kotlang.portfolio.models.Routes
import org.kotlang.portfolio.models.TechStack
import org.kotlang.portfolio.theme.ShowcaseDescriptionStyle
import org.kotlang.portfolio.util.Res

@Page(Routes.COURSES_QUIZ_TIME)
@Composable
fun QuizTimePage() {
    ProjectShowcaseLayout(
        pageTitle = "QuizTime: A Full-Stack Android App",
        pageDescription = "A full-stack quiz application featuring a Ktor backend and a Jetpack Compose UI for Android, developed as part of a premium Udemy course.",
        githubLink = Res.Link.QUIZTIME_GITHUB,
        courseLink = Res.Link.QUIZTIME_COURSE,
        coverImage = "/courses/quiz_time/cover.jpg",
        screenshots = listOf(
            "/courses/quiz_time/screenshot_01.png",
            "/courses/quiz_time/screenshot_02.png",
            "/courses/quiz_time/screenshot_03.png",
            "/courses/quiz_time/screenshot_04.png",
            "/courses/quiz_time/screenshot_05.png",
            "/courses/quiz_time/screenshot_06.png"
        ),
        techStack = listOf(
            TechStack.Compose,
            TechStack.RoomDB,
            TechStack.Koin,
            TechStack.Ktor,
            TechStack.MongoDb
        ),
        descriptionContent = {
            SpanText(
                text = "A full-stack quiz application built entirely with Kotlin. The Android client uses Jetpack Compose with MVVM and Clean Architecture, featuring smooth UI, state management, and offline caching.",
                modifier = ShowcaseDescriptionStyle.toModifier()
            )
            SpanText(
                text = "On the backend, it offers both Ktor and Spring Boot implementations serving REST APIs with MongoDB for data storage.",
                modifier = ShowcaseDescriptionStyle.toModifier()
            )
        }
    )
}
