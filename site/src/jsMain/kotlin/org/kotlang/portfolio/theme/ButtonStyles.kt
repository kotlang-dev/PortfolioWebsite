package org.kotlang.portfolio.theme

import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.style.selectors.visited
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s

val ThemeSwitchButtonStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .backgroundColor(Colors.Transparent)
            .padding(0.px)
            .color(palette.text)
            .transition(
                Transition.of("color", duration = 0.2.s),
                Transition.of("transform", duration = 0.2.s)
            )
    }
    hover {
        Modifier
            .color(palette.primary)
            .transform { scale(1.2) }
    }
}

val PrimaryButtonStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .height(40.px)
            .border(width = 0.px)
            .borderRadius(r = 5.px)
            .backgroundColor(palette.primary)
            .color(Colors.White)
            .cursor(Cursor.Pointer)
            .textDecorationLine(TextDecorationLine.None)
            .padding(leftRight = 24.px, topBottom = 8.px)
            .transition(Transition.of("background-color", duration = 0.2.s))
    }
    hover {
        Modifier.backgroundColor(palette.primary.darkened(0.1f))
    }
}

val PlayStoreButtonStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .backgroundColor(palette.primary)
            .color(palette.background)
            .padding(topBottom = 6.px, leftRight = 12.px)
            .borderRadius(8.px)
            .fontWeight(FontWeight.SemiBold)
            .textDecorationLine(TextDecorationLine.None)
            .transition(Transition.of("background-color", 200.ms))
    }
    hover {
        Modifier.backgroundColor(palette.primary.darkened(0.1f))
    }
    visited {
        Modifier.color(palette.background)
    }
}

val GithubButtonStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .border(1.px, LineStyle.Solid, palette.border)
            .backgroundColor(palette.surface)
            .color(palette.text)
            .padding(topBottom = 6.px, leftRight = 12.px)
            .borderRadius(8.px)
            .fontWeight(FontWeight.SemiBold)
            .textDecorationLine(TextDecorationLine.None)
            .transition(
                Transition.of("background-color", 200.ms),
                Transition.of("color", 200.ms)
            )
    }
    hover {
        Modifier
            .backgroundColor(palette.primary)
            .color(palette.background)
    }
    visited {
        Modifier.color(palette.text)
    }
}