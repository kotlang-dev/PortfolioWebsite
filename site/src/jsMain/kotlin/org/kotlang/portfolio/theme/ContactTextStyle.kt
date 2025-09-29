package org.kotlang.portfolio.theme

import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.style.selectors.visited
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val ContactTextStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .color(palette.text.toRgb().copyf(alpha = 0.7f))
            .fontSize(18.px)
    }
}

val EmailLinkStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .color(palette.primary)
            .fontWeight(FontWeight.Bold)
            .fontSize(24.px)
            .textDecorationLine(TextDecorationLine.None)
            .transition(Transition.of("color", 200.ms))
    }
    hover {
        Modifier.color(palette.primary.darkened(0.1f))
    }
    visited {
        Modifier.color(palette.primary)
    }
}
