package org.kotlang.portfolio.pages.projects

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.components.PageLayout
import org.kotlang.portfolio.components.sections.TechStackSection
import org.kotlang.portfolio.models.Routes
import org.kotlang.portfolio.models.TechStack
import org.kotlang.portfolio.sections.ProjectPageHeader
import org.kotlang.portfolio.util.Res

@Page(Routes.PROJECTS_AGE_CALCULATOR)
@Composable
fun AgeCalculatorPage() {
    val techStack = listOf(
        TechStack.ComposeMultiplatform,
        TechStack.RoomDB,
        TechStack.PreferenceDataStore,
        TechStack.KotlinxDateTime,
        TechStack.Koin
    )

    //TODO update these info on every page
    /*LaunchedEffect(Unit) {
        setPageMetadata(
            title = "Age Calculator (KMP) - Mohammad Arif",
            description = "A multiplatform app for Android & Desktop with a shared codebase using Compose."
        )
    }*/

    PageLayout(
        header = {
            ProjectPageHeader(
                githubLink = Res.Link.AGE_CALC_GITHUB,
                playStoreLink = Res.Link.AGE_CALC_PLAYSTORE
            )
        }
    ) {
        Box(
            modifier = Modifier.fillMaxSize().padding(topBottom = 40.px, leftRight = 5.percent),
            contentAlignment = Alignment.TopCenter
        ) {
            Column(
                modifier = Modifier.fillMaxWidth().maxWidth(1000.px),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(40.px)
            ) {
                // Banner Image
                Image(
                    src = "https://github.com/kotlang-dev/AgeCalculator-TrackDates/blob/main/.github/assets/banner.png?raw=true",
                    alt = "Age Calculator Banner",
                    modifier = Modifier.fillMaxWidth().borderRadius(12.px)
                )

                // Title and Description
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(12.px)
                ) {
                    SpanText(
                        "Age Calculator - Track Dates",
                        modifier = Modifier.fontSize(32.px).fontWeight(FontWeight.Bold).textAlign(TextAlign.Center)
                    )
                    SpanText(
                        "A modern, offline-first app designed to track the age of important life events, built with Kotlin Multiplatform.",
                        modifier = Modifier.textAlign(TextAlign.Center).opacity(80.percent)
                    )
                }

                TechStackSection(techStack = techStack)
            }
        }
    }
}
