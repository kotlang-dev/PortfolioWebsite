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
            .fontFamily("Roboto")
            .fontSize(20.px)
            .fontWeight(FontWeight.Normal)
            .margin(topBottom = 0.px)
            .color(palette.primary)
    }
    Breakpoint.LG {
        Modifier.fontSize(45.px)
    }
}

// A style for your name (the main headline)
val HeroHeadlineStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .fontFamily("Roboto")
            .fontSize(40.px)
            .fontWeight(FontWeight.Bolder)
            .margin(top = 20.px, bottom = 0.px)
            .color(palette.text)
    }
    Breakpoint.LG {
        Modifier.fontSize(68.px)
    }
}

// A style for your subtitle
val HeroSubtitleStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .fontFamily("Roboto")
            .fontSize(18.px)
            .fontWeight(FontWeight.Bold)
            .margin(top = 10.px, bottom = 5.px)
            .color(palette.text)
    }
    Breakpoint.LG {
        Modifier.fontSize(20.px)
    }
}

// A style for the descriptive paragraph
val HeroDescriptionStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .maxWidth(400.px)
            .fontFamily("Roboto")
            .fontSize(15.px)
            .fontStyle(FontStyle.Italic)
            .fontWeight(FontWeight.Normal)
            .margin(bottom = 25.px)
            .color(palette.text)
    }
}