package org.kotlang.portfolio.pages.courses

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
import org.kotlang.portfolio.util.Res

@Page("measure-mate")
@Composable
fun MeasureMatePage() {
    PageLayout(
        header = {
            ProjectPageHeader(
                githubLink = Res.Link.MEASUREMATE_GITHUB,
                courseLink = Res.Link.MEASUREMATE_COURSE
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
                Image(
                    src = "https://github.com/kotlang-dev/MeasureMate/blob/master/readme-assets/YoutubeThumbnail.png?raw=true",
                    alt = "MeasureMate App Banner",
                    modifier = Modifier.fillMaxWidth().borderRadius(12.px)
                )

                Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(12.px)) {
                    SpanText("MeasureMate Android App", modifier = Modifier.fontSize(32.px).fontWeight(FontWeight.Bold).textAlign(TextAlign.Center))
                    SpanText(
                        "A comprehensive fitness tracking app built with Jetpack Compose and Firebase, created as part of a premium Udemy course.",
                        modifier = Modifier.textAlign(TextAlign.Center).opacity(80.percent)
                    )
                }

                // Tech Stack Section
                Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(24.px)) {
                    SpanText("Tech Stack", modifier = Modifier.fontSize(28.px).fontWeight(FontWeight.Bold))
                    SimpleGrid(numColumns(base = 1, md = 2), modifier = Modifier.gap(24.px)) {
                        FeatureCard("Jetpack Compose", "To build the User Interface.")
                        FeatureCard("Material 3", "To design a beautiful and consistent UI.")
                        FeatureCard("Firebase Authentication", "To securely manage user sign-ins, including Google Sign-In.")
                        FeatureCard("Firebase Firestore", "To store, sync, and query data in real-time.")
                        FeatureCard("Dagger Hilt", "To manage dependency injection for cleaner, modular code.")
                        FeatureCard("Compose Navigation", "To navigate between screens seamlessly.")
                    }
                }
            }
        }
    }
}
