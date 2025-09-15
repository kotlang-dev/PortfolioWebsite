package org.kotlang.portfolio.models

enum class HomeSection(
    val id: String,
    val title: String,
    val path: String
) {
    Home(
        id = "home",
        title = "Home",
        path = "#home"
    ),
    Projects(
        id = "projects",
        title = "Projects",
        path = "#projects"
    ),
    Contact(
        id = "contact",
        title = "Contact",
        path = "#contact"
    )
}
