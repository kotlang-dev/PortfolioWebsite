package org.kotlang.portfolio.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.components.widgets.ProjectCard
import org.kotlang.portfolio.models.HomeSection
import org.kotlang.portfolio.models.Project

@Composable
fun ProjectsSection() {
    val projects = listOf(
        Project(
            title = "Age Calculator App",
            description = "A multi-platform app to track important life events, built with Kotlin Multiplatform.",
            imageUrl = "https://github.com/kotlang-dev/AgeCalculator-TrackDates/blob/main/.github/assets/banner.png?raw=true",
            link = "/projects/age-calculator" // We will create these pages later
        ),
        Project(
            title = "QuizTime App",
            description = "A full-stack quiz application featuring a Ktor backend and a Jetpack Compose UI.",
            imageUrl = "https://github.com/kotlang-dev/QuizTime/blob/main/readme-assets/QuizTime-Thumbnail.png?raw=true",
            link = "/projects/quiz-time"
        ),
        Project(
            title = "MeasureMate Fitness App",
            description = "A fitness tracking app built with Jetpack Compose and Firebase, from a premium Udemy course.",
            imageUrl = "https://github.com/kotlang-dev/MeasureMate/blob/master/readme-assets/YoutubeThumbnail.png?raw=true",
            link = "/projects/measure-mate"
        )
    )

    Box(
        modifier = Modifier
            .id(HomeSection.Projects.id)
            .fillMaxWidth()
            .padding(topBottom = 80.px),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(90.percent),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(40.px)
        ) {
            SpanText(
                text = "My Projects",
                modifier = Modifier
                    .fontSize(32.px)
                    .fontWeight(FontWeight.Bold)
                    .textAlign(TextAlign.Center)
            )

            // A responsive grid that changes the number of columns based on screen size
            SimpleGrid(
                numColumns = numColumns(base = 1, md = 2, lg = 3),
                modifier = Modifier.gap(24.px)
            ) {
                projects.forEach { project ->
                    ProjectCard(project)
                }
            }
        }
    }
}
