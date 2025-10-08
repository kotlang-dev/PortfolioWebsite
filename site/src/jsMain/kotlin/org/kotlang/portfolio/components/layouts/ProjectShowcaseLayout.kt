package org.kotlang.portfolio.components.layouts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import org.kotlang.portfolio.components.sections.DesktopScreenshotSection
import org.kotlang.portfolio.components.sections.ScreenshotSection
import org.kotlang.portfolio.components.sections.ShowcaseHeroSection
import org.kotlang.portfolio.components.sections.TechStackSection
import org.kotlang.portfolio.models.TechStack
import org.kotlang.portfolio.sections.ProjectPageHeader
import org.kotlang.portfolio.util.setPageMetadata

@Composable
fun ProjectShowcaseLayout(
    coverImage: String,
    pageTitle: String,
    pageDescription: String,
    screenshots: List<String>,
    techStack: List<TechStack>,
    desktopScreenshot: String? = null,
    githubLink: String? = null,
    playStoreLink: String? = null,
    courseLink: String? = null,
    descriptionContent: @Composable () -> Unit
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
            ShowcaseHeroSection(
                title = pageTitle,
                coverImage = coverImage,
                description = descriptionContent
            )

            ScreenshotSection(screenshots = screenshots)

            if (desktopScreenshot != null) {
                DesktopScreenshotSection(desktopScreenshot)
            }

            TechStackSection(techStack = techStack)
        }
    }
}
