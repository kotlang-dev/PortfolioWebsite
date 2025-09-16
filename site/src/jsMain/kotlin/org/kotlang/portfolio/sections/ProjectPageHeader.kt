package org.kotlang.portfolio.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowLeft
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.FaGooglePlay
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.theme.ProjectNavigationLinkStyle
import org.kotlang.portfolio.theme.toPortfolioPalette

@Composable
fun ProjectPageHeader(
    githubLink: String,
    playStoreLink: String? = null
) {
    val palette = ColorMode.current.toPortfolioPalette()

    BaseHeader(
        leftContent = {
            Link(path = "/", modifier = ProjectNavigationLinkStyle.toModifier().color(palette.text)) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.px)
                ) {
                    FaArrowLeft()
                    SpanText("Back to Portfolio")
                }
            }
        },
        rightContent = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.px)
            ) {
                Link(path = githubLink, modifier = ProjectNavigationLinkStyle.toModifier().color(palette.text)) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.px)
                    ) {
                        FaGithub()
                        SpanText("View on Github")
                    }
                }
                if (playStoreLink != null) {
                    Link(path = playStoreLink, modifier = ProjectNavigationLinkStyle.toModifier().color(palette.text)) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.px)
                        ) {
                            FaGooglePlay()
                            SpanText("Get on Play Store")
                        }
                    }
                }
            }
        }
    )
}