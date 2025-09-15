package org.kotlang.portfolio.theme

import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.functions.blur
import com.varabyte.kobweb.compose.css.functions.saturate
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.anyLink
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.theme.colors.palette.background
import com.varabyte.kobweb.silk.theme.colors.palette.toPalette
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

val HeaderStyle = CssStyle {
    base {
        val palette = colorMode.toPalette()
        Modifier
            .fillMaxWidth()
            .padding(leftRight = 10.percent, topBottom = 16.px)
            .position(Position.Sticky)
            .top(0.px)
            .backgroundColor(palette.background)
            .zIndex(1)
            .backdropFilter(saturate(180.percent), blur(5.px))
    }
}

val MainNavigationLinkStyle = CssStyle {
    base {
        Modifier
            .color(Colors.Black)
            .transition()
            .textDecorationLine(TextDecorationLine.None)
            .fontWeight(FontWeight.Normal)
    }
    anyLink {
        Modifier
            .color(Colors.Black)
    }
    hover {
        Modifier
            .color(Colors.Green)
            .fontWeight(FontWeight.Bold)
    }
}

val ProjectNavigationLinkStyle = CssStyle {
    base {
        Modifier.textDecorationLine(TextDecorationLine.None)
    }
    hover {
        Modifier.textDecorationLine(TextDecorationLine.Underline)
    }
}