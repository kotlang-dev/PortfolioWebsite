package org.kotlang.portfolio.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.theme.FooterTextStyle
import org.kotlang.portfolio.theme.toPortfolioPalette

@Composable
fun SiteFooter() {
    val palette = ColorMode.current.toPortfolioPalette()
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(palette.backgroundVariant)
            .padding(topBottom = 40.px),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.gap(16.px),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SpanText(
                text = "Copyright © 2025 Mohammad Arif. All rights reserved.",
                modifier = FooterTextStyle.toModifier()
            )
            Row(
                modifier = FooterTextStyle.toModifier().gap(4.px),
                verticalAlignment = Alignment.CenterVertically
            ) {
                FaGithub()
                SpanText("This site is")
                Link(
                    path = "https://github.com/kotlang-dev/PortfolioWebsite",
                    text = "open source",
                    openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
                )
                SpanText("written using")
                Link(
                    path = "https://kobweb.varabyte.com/",
                    text = "Kobweb.",
                    openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
                )
            }
        }
    }
}
