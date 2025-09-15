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
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.components.PageLayout
import org.kotlang.portfolio.components.widgets.FeatureCard
import org.kotlang.portfolio.sections.ProjectPageHeader

@Page("age-calculator")
@Composable
fun AgeCalculatorPage() {
    PageLayout(
        header = {
            ProjectPageHeader(
                githubLink = "https://github.com/kotlang-dev/AgeCalculator-TrackDates",
                playStoreLink = "https://play.google.com/store/apps/details?id=com.synac.agecalculator"
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

                // Features Section
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(24.px)
                ) {
                    SpanText("Key Features", modifier = Modifier.fontSize(28.px).fontWeight(FontWeight.Bold))
                    SimpleGrid(numColumns(base = 1, md = 2), modifier = Modifier.gap(24.px)) {
                        FeatureCard(
                            "Multiplatform Support",
                            "A single, shared codebase for Android, Windows, macOS, and Linux."
                        )
                        FeatureCard(
                            "Adaptive UI",
                            "The interface intelligently adapts to different screen sizes for phones, tablets, and desktops."
                        )
                        FeatureCard(
                            "Track Key Life Events",
                            "Add and manage multiple occasions like birthdays, anniversaries, and milestones."
                        )
                        FeatureCard(
                            "Detailed Age Breakdown",
                            "Instantly see the elapsed time in years, months, days, and even down to the second."
                        )
                        FeatureCard(
                            "Dynamic Theming",
                            "Personalize your experience by switching between Light, Dark, or System themes."
                        )
                        FeatureCard(
                            "100% Offline & Private",
                            "All data is stored securely on your device and is never collected or transmitted."
                        )
                    }
                }
            }
        }
    }
}
