package org.kotlang.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.models.SocialLink
import org.kotlang.portfolio.theme.SocialBarBackdropStyle
import org.kotlang.portfolio.theme.SocialLinkStyle

@Composable
fun SocialBar(isRow: Boolean = false) {
    val socials = SocialLink.entries

    if (isRow) {
        Row(
            modifier = SocialBarBackdropStyle.toModifier()
                .margin(top = 25.px)
                .padding(leftRight = 25.px)
                .minHeight(40.px),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(24.px)
        ) {
            socials.forEach { social -> SocialLink(social) }
        }
    } else {
        Column(
            modifier = SocialBarBackdropStyle.toModifier()
                .margin(right = 25.px)
                .padding(topBottom = 30.px)
                .minWidth(40.px),
            verticalArrangement = Arrangement.spacedBy(40.px),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            socials.forEach { social -> SocialLink(social) }
        }
    }
}

@Composable
private fun SocialLink(social: SocialLink) {
    Link(
        path = social.url,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB,
        modifier = Modifier.textDecorationLine(TextDecorationLine.None),
    ) {
        Box(SocialLinkStyle.toModifier().color(social.brandColor)) {
            social.icon(IconSize.LG)
        }
    }
}