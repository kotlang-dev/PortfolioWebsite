package org.kotlang.portfolio.theme

import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ScrollBehavior
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.functions.blur
import com.varabyte.kobweb.compose.css.functions.saturate
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.init.registerStyleBase
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.style.selectors.visited
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.loadFromLocalStorage
import com.varabyte.kobweb.silk.theme.colors.palette.border
import com.varabyte.kobweb.silk.theme.colors.palette.toPalette
import com.varabyte.kobweb.silk.theme.colors.systemPreference
import org.jetbrains.compose.web.css.*

@InitSilk
fun initStyles(ctx: InitSilkContext) {
    ctx.apply {
        config.initialColorMode = ColorMode.loadFromLocalStorage() ?: ColorMode.systemPreference

        stylesheet.apply {

            registerStyleBase("html") {
                Modifier.scrollBehavior(ScrollBehavior.Smooth)
            }

            registerStyleBase("body") {
                Modifier
                    .fontFamily(
                        "-apple-system", "BlinkMacSystemFont", "Segoe UI", "Roboto", "Oxygen", "Ubuntu",
                        "Cantarell", "Fira Sans", "Droid Sans", "Helvetica Neue", "sans-serif"
                    )
                    .fontSize(18.px)
            }
        }
    }
}

val HeaderStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .fillMaxWidth()
            .background(palette.header)
            .padding(topBottom = 12.px)
            .position(Position.Sticky)
            .top(0.px)
            .zIndex(1)
            .backdropFilter(saturate(180.percent), blur(5.px))
            .borderBottom(width = 1.px, style = LineStyle.Solid, color = colorMode.toPalette().border)
    }
}

val MainNavigationLinkStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .color(palette.text)
            .textDecorationLine(TextDecorationLine.None)
            .position(Position.Relative)
            .transition(Transition.of("color", duration = 0.2.s))
    }
    hover {
        Modifier.color(palette.primary)
    }
}

val SocialBarBackdropStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .borderRadius(r = 20.px)
            .backgroundColor(palette.backgroundVariant)
    }
}

val SocialLinkStyle = CssStyle {
    base {
        Modifier
            .cursor(Cursor.Pointer)
            .transition(Transition.of("transform", 0.2.s))
    }
    hover {
        Modifier.transform { scale(1.2) }
    }
}

val ProfileImageStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .width(280.px)
            .height(320.px)
            .position(Position.Relative)
            .backgroundColor(palette.backgroundVariant)
            .borderRadius(0.75.cssRem)
            .top(1.cssRem)
            .left(1.cssRem)
            .fillMaxSize()
    }
}

val FooterTextStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .fontSize(14.px)
            .color(palette.text.toRgb().copyf(alpha = 0.7f))
    }

    cssRule(" a") {
        Modifier
            .color(palette.primary)
            .textDecorationLine(TextDecorationLine.None)
            .transition(Transition.of("color", 200.ms))
    }

    cssRule(" a:hover") {
        Modifier.textDecorationLine(TextDecorationLine.Underline)
    }
}

val SubtleLinkStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .color(palette.text)
            .textDecorationLine(TextDecorationLine.None)
            .fontWeight(FontWeight.SemiBold)
            .transition(Transition.of("color", 200.ms))
    }
    hover {
        Modifier.color(palette.primary)
    }
    visited {
        Modifier.color(palette.text)
    }
}