package org.kotlang.portfolio.theme

import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val MarkdownStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .color(palette.text)
            .fontSize(18.px)
            .lineHeight(1.8)
    }

    // Style for H1 headings
    cssRule(" h1") {
        Modifier
            .fontSize(32.px)
            .fontWeight(FontWeight.Bold)
            .margin(bottom = 24.px)
    }

    // Style for H2 headings
    cssRule(" h2") {
        Modifier
            .fontSize(24.px)
            .fontWeight(FontWeight.Bold)
            .margin(top = 40.px, bottom = 16.px)
    }

    // Style for paragraphs
    cssRule(" p") {
        Modifier.margin(bottom = 16.px)
    }

    // Style for links
    cssRule(" a") {
        Modifier
            .color(palette.primary)
            .textDecorationLine(TextDecorationLine.None)
            .transition(Transition.of("color", 200.ms))
    }
    cssRule(" a:hover") {
        Modifier.textDecorationLine(TextDecorationLine.Underline)
    }

    // Style for lists
    cssRule(" ul, ol") {
        Modifier.margin(left = 24.px, bottom = 16.px)
    }
    cssRule(" li") {
        Modifier.margin(bottom = 8.px)
    }
}
