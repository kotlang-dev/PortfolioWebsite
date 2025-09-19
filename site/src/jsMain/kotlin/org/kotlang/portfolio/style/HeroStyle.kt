package org.kotlang.portfolio.style

import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s
import org.kotlang.portfolio.theme.toPortfolioPalette

val MainButtonStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .height(40.px)
            .border(width = 0.px)
            .borderRadius(r = 5.px)
            .backgroundColor(palette.primary)
            .cursor(Cursor.Pointer)
            .transition(Transition.of("background-color", 0.2.s))
    }
}

// A style for the introductory "Hello, I'm" text
val HeroIntroStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .fontSize(16.px)
            .fontWeight(FontWeight.Normal)
            .margin(bottom = 10.px)
            .color(palette.primary)
    }
    Breakpoint.LG {
        Modifier.fontSize(24.px)
    }
}

// A style for your name (the main headline)
val HeroHeadlineStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .fontSize(48.px)
            .fontWeight(FontWeight.Bolder)
            .color(palette.text)
    }
    Breakpoint.LG {
        Modifier.fontSize(56.px)
    }
}

// A style for your subtitle
val HeroSubtitleStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .fontSize(14.px)
            .fontWeight(FontWeight.Bold)
            .color(palette.primary)
    }
    Breakpoint.LG {
        Modifier.fontSize(18.px)
    }
}

// A style for the descriptive paragraph
val HeroDescriptionStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .maxWidth(550.px)
            .fontSize(14.px)
            .margin(topBottom = 25.px)
            .lineHeight(1.5)
            .color(palette.text)
    }
    Breakpoint.LG {
        Modifier.fontSize(18.px)
    }
}