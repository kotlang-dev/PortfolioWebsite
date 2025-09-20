package org.kotlang.portfolio.models

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.silk.components.icons.fa.*

enum class TechStack(
    val icon: @Composable (IconSize) -> Unit,
    val title: String,
    val description: String
) {
    Compose(
        icon = { FaPenNib(size = it) },
        title = "Jetpack Compose",
        description = "My toolkit of choice for building beautiful, declarative UIs on Android."
    ),
    ComposeNavigation(
        icon = { FaRoute(size = it) },
        title = "Compose Navigation",
        description = "The official library for navigating between screens in a Compose app."
    ),
    Ktor(
        icon = { FaServer(size = it) },
        title = "Ktor",
        description = "My framework for building powerful, async backend services in Kotlin."
    ),
    Firebase(
        icon = { FaFire(size = it) },
        title = "Firebase",
        description = "Leveraged for real-time databases, authentication, and cloud functions."
    ),
    RoomDB(
        icon = { FaDatabase(size = it) },
        title = "Room DB",
        description = "Used for robust, local data persistence on Android with an SQL abstraction."
    ),
    DaggerHilt(
        icon = { FaSyringe(size = it) },
        title = "Dagger Hilt",
        description = "For managing dependency injection to create scalable, modular code."
    ),
    ComposeMultiplatform(
        icon = { FaDesktop(size = it) },
        title = "Compose Multiplatform",
        description = "The declarative UI toolkit for building interfaces across multiple platforms."
    ),
    ComposeCanvas(
        icon = { FaPaintbrush(size = it) },
        title = "Compose Canvas",
        description = "The low-level drawing API for creating custom graphics and UI components."
    ),
    PreferenceDataStore(
        icon = { FaSun(size = it) },
        title = "Preference DataStore",
        description = "The modern, async library for storing simple key-value data in Android."
    ),
    Koin(
        icon = { FaSyringe(size = it) },
        title = "Koin",
        description = "A lightweight dependency injection framework for Kotlin developers."
    ),
    KotlinxDateTime(
        icon = { FaClock(size = it) },
        title = "Kotlinx DateTime",
        description = "The official multiplatform library for working with dates and times."
    ),
    Supabase(
        icon = { FaBolt(size = it) },
        title = "Supabase",
        description = "An open-source BaaS for databases, authentication, and storage."
    ),
    Media3(
        icon = { FaPlay(size = it) },
        title = "Media3 (ExoPlayer)",
        description = "The modern Android library for robust and customizable media playback."
    ),
    MongoDb(
        icon = { FaLeaf(size = it) },
        title = "MongoDB",
        description = "A popular NoSQL database for building scalable backend services."
    )
}