package org.kotlang.portfolio.components.layout

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.components.sections.ScreenshotSection
import org.kotlang.portfolio.components.sections.SectionTitle
import org.kotlang.portfolio.components.sections.TechStackSection
import org.kotlang.portfolio.models.TechStack
import org.kotlang.portfolio.sections.ProjectPageHeader
import org.kotlang.portfolio.theme.SectionContainerStyle
import org.kotlang.portfolio.util.setPageMetadata

@Composable
fun ProjectShowcaseLayout(
    pageTitle: String,
    pageDescription: String,
    screenshots: List<String>? = null,
    techStack: List<TechStack>,
    desktopScreenshot: String? = null,
    bannerImageLink: String? = null,
    githubLink: String? = null,
    playStoreLink: String? = null,
    courseLink: String? = null
) {
    LaunchedEffect(Unit) {
        setPageMetadata(
            title = "$pageTitle - Mohammad Arif",
            description = pageDescription
        )
    }

    PageLayout(
        header = {
            ProjectPageHeader(
                githubLink = githubLink,
                playStoreLink = playStoreLink,
                courseLink = courseLink
            )
        }
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = SectionContainerStyle.toModifier().gap(16.px),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    src = bannerImageLink
                        ?: "https://github.com/kotlang-dev/AgeCalculator-TrackDates/blob/main/.github/assets/banner.png?raw=true",
                    alt = "Age Calculator Banner",
                    modifier = Modifier.fillMaxWidth().borderRadius(12.px)
                )
                SpanText(
                    text = pageTitle,
                    modifier = Modifier.fontSize(32.px).fontWeight(FontWeight.Bold).textAlign(TextAlign.Center)
                )
                SpanText(
                    text = pageDescription,
                    modifier = Modifier.textAlign(TextAlign.Center).opacity(80.percent)
                )
            }

            screenshots?.let {
                ScreenshotSection(screenshots = it)
            }

            if (desktopScreenshot != null) {
                Column(
                    modifier = SectionContainerStyle.toModifier().padding(top = 0.px),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    SectionTitle(
                        title = "Desktop Preview",
                        subtitle = "See it in Action"
                    )
                    Image(
                        src = desktopScreenshot,
                        alt = "Desktop Screenshot",
                        modifier = Modifier.fillMaxWidth(90.percent)
                    )
                }
            }

            TechStackSection(techStack = techStack)
        }
    }
}
