package org.kotlang.portfolio.theme

import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val TechStackCardStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .border(2.px, LineStyle.Solid, palette.backgroundVariant)
            .backgroundColor(Colors.Transparent)
            .transition(
                Transition.of(property = "border-color", duration = 200.ms),
                Transition.of(property = "background-color", duration = 200.ms)
            )
    }
    hover {
        Modifier
            .border(color = palette.primary)
            .backgroundColor(palette.primary)
    }

    // Style for the Icon Box
    cssRule(" .tech-stack-icon") {
        Modifier
            .color(palette.primary)
            .padding(topBottom = 25.px, leftRight = 15.px)
            .border(
                width = 2.px,
                style = LineStyle.Solid,
                color = palette.primary
            )
            .borderRadius(
                topLeft = 15.px,
                topRight = 15.px,
                bottomLeft = 15.px,
                bottomRight = 0.px
            )
            .backgroundColor(Colors.Transparent)
            .transition(Transition.of(property = "background-color", duration = 200.ms))
    }
    cssRule(":hover .tech-stack-icon") {
        Modifier.backgroundColor(palette.background)
    }

    // Style for the Title
    cssRule(" .tech-stack-title") {
        Modifier
            .fontSize(18.px)
            .fontWeight(FontWeight.Bold)
            .margin(top = 10.px, bottom = 5.px)
            .color(palette.text)
            .transition(Transition.of(property = "color", duration = 200.ms))
    }
    cssRule(":hover .tech-stack-title") {
        Modifier.color(palette.background)
    }

    // Style for the Description
    cssRule(" .tech-stack-description") {
        Modifier
            .fontSize(14.px)
            .color(palette.text.toRgb().copyf(alpha = 0.7f))
            .transition(Transition.of(property = "color", duration = 200.ms))
    }
    cssRule(":hover .tech-stack-description") {
        Modifier.color(palette.background)
    }
}