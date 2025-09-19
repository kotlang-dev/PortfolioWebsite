package org.kotlang.portfolio.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowLeft
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.FaGooglePlay
import com.varabyte.kobweb.silk.components.icons.fa.FaGraduationCap
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text
import org.kotlang.portfolio.theme.GithubButtonStyle
import org.kotlang.portfolio.theme.PlayStoreButtonStyle
import org.kotlang.portfolio.theme.SubtleLinkStyle

@Composable
fun ProjectPageHeader(
    githubLink: String? = null,
    playStoreLink: String? = null,
    courseLink: String? = null,
) {
    BaseHeader(
        leftContent = {
            Link(
                path = "/",
                modifier = SubtleLinkStyle.toModifier()
            ) {
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
                if (githubLink != null) {
                    Link(
                        path = githubLink,
                        modifier = GithubButtonStyle.toModifier()
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.px)
                        ) {
                            FaGithub()
                            SpanText("View on Github")
                        }
                    }
                }
                if (playStoreLink != null) {
                    Link(
                        path = playStoreLink,
                        modifier = PlayStoreButtonStyle.toModifier()
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.px)
                        ) {
                            FaGooglePlay()
                            SpanText("Get on Play Store")
                        }
                    }
                }
                if (courseLink != null) {
                    Link(
                        path = courseLink,
                        modifier = PlayStoreButtonStyle.toModifier()
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.px)
                        ) {
                            FaGraduationCap()
                            SpanText("Join Course")
                        }
                    }
                }
            }
        }
    )
}