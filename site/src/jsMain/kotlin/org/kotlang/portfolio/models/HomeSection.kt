package org.kotlang.portfolio.models

enum class HomeSection(
    val id: String,
    val title: String,
    val subtitle: String,
    val path: String
) {
    Hero(
        id = "hero",
        title = "Home",
        subtitle = "",
        path = "#hero"
    ),
    Projects(
        id = "projects",
        title = "Projects",
        subtitle = "Showcasing My Kotlin Skills",
        path = "#projects"
    ),
    Courses(
        id = "courses",
        title = "Courses",
        subtitle = "Sharing My Knowledge",
        path = "#courses"
    ),
    Contact(
        id = "contact",
        title = "Contact",
        subtitle = "Get in Touch",
        path = "#contact"
    )
}
