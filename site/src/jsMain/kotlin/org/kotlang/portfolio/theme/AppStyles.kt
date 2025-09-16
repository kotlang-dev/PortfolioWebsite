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
import org.jetbrains.compose.web.css.*

val HeaderStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .fillMaxWidth()
            .background(palette.header)
            .padding(topBottom = 16.px)
            .position(Position.Sticky)
            .top(0.px)
            .zIndex(1)
            .backdropFilter(saturate(180.percent), blur(5.px))
    }
}

val MainNavigationLinkStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .color(palette.text)
            .transition()
            .textDecorationLine(TextDecorationLine.None)
            .fontWeight(FontWeight.Normal)
    }
    anyLink {
        Modifier
            .color(palette.text)
    }
    hover {
        Modifier
            .color(palette.primary)
            .fontWeight(FontWeight.Bold)
    }
}

val MainButtonStyle = CssStyle {
    base {
        Modifier
            .width(100.px)
            .transition(Transition.of(property = "width", duration = 200.ms))
    }
    hover {
        Modifier.width(120.px)
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

val SocialLinkStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .color(Colors.Gray)
            .transition(Transition.of(property = "color", duration = 200.ms))
    }
    hover {
        Modifier.color(palette.primary)
    }
}

val ProfileImageStyle = CssStyle {
    base {
        Modifier
            .borderRadius(14.px)
            .transform { rotate((-2).deg) } // The slight tilt
            .boxShadow( // The subtle shadow for depth
                offsetX = 5.px,
                offsetY = 5.px,
                blurRadius = 15.px,
                spreadRadius = 0.px,
                color = Colors.Black.copyf(alpha = 0.2f)
            )
            .transition(Transition.of("transform", 0.3.s))
    }
    hover {
        Modifier
            .transform {
                rotate(0.deg)
                scale(1.05)
            }
    }
}