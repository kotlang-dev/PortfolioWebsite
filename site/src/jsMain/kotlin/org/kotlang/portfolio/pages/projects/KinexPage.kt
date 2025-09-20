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
import org.kotlang.portfolio.models.TechStack
import org.kotlang.portfolio.sections.ProjectPageHeader

@Page("kinex")
@Composable
fun KinexPage() {
    val techStack = listOf(
        TechStack.Compose,
        TechStack.RoomDB,
        TechStack.Supabase,
        TechStack.Media3,
        TechStack.Koin,
        TechStack.PreferenceDataStore,
    )
    PageLayout(
        header = {
            ProjectPageHeader()
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

                TechStackSection(techStack)
            }
        }
    }
}
