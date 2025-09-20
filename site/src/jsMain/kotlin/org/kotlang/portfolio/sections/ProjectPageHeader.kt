package org.kotlang.portfolio.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.framework.annotations.DelicateApi
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowLeft
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.FaGooglePlay
import com.varabyte.kobweb.silk.components.icons.fa.FaGraduationCap
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.theme.HeaderSecondaryButtonStyle
import org.kotlang.portfolio.theme.HeaderIconButtonStyle
import org.kotlang.portfolio.theme.HeaderPrimaryButtonStyle
import org.kotlang.portfolio.theme.SubtleLinkStyle

@OptIn(DelicateApi::class)
@Composable
fun ProjectPageHeader(
    githubLink: String? = null,
    playStoreLink: String? = null,
    courseLink: String? = null,
) {
    val breakpoint = rememberBreakpoint()
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
                    if (breakpoint >= Breakpoint.MD) {
                        SpanText("Back to Portfolio")
                    }
                }
            }
        },
        rightContent = {
            val primaryButtonStyle = if (breakpoint >= Breakpoint.MD) {
                HeaderPrimaryButtonStyle
            } else HeaderIconButtonStyle
            val secondaryButtonStyle = if (breakpoint >= Breakpoint.MD) {
                HeaderSecondaryButtonStyle
            } else HeaderIconButtonStyle

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.px)
            ) {
                if (githubLink != null) {
                    Link(
                        path = githubLink,
                        modifier = secondaryButtonStyle.toModifier()
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.px)
                        ) {
                            FaGithub()
                            if (breakpoint >= Breakpoint.MD) {
                                SpanText("View on Github")
                            }
                        }
                    }
                }
                if (playStoreLink != null) {
                    Link(
                        path = playStoreLink,
                        modifier = primaryButtonStyle.toModifier()
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.px)
                        ) {
                            FaGooglePlay()
                            if (breakpoint >= Breakpoint.MD) {
                                SpanText("Get on Play Store")
                            }
                        }
                    }
                }
                if (courseLink != null) {
                    Link(
                        path = courseLink,
                        modifier = primaryButtonStyle.toModifier()
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.px)
                        ) {
                            FaGraduationCap()
                            if (breakpoint >= Breakpoint.MD) {
                                SpanText("Join Course")
                            }
                        }
                    }
                }
            }
        }
    )
}