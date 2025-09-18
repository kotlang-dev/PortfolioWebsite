package org.kotlang.portfolio.theme

import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.css.WhiteSpace
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.style.selectors.visited
import org.jetbrains.compose.web.css.*

val ProjectCardStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .position(Position.Relative)
            .flex(1, 1, 350.px)
            .maxWidth(400.px)
            .backgroundColor(palette.surface)
            .borderRadius(16.px)
            .border(1.px, LineStyle.Solid, palette.border)
            .padding(top = 50.px, bottom = 20.px, leftRight = 20.px)
            .transition(Transition.of("box-shadow", 300.ms))
            .color(palette.text)
    }
    hover {
        Modifier.boxShadow(
            offsetX = 0.px,
            offsetY = 8.px,
            blurRadius = 16.px,
            spreadRadius = 0.px,
            color = palette.primary.toRgb().copyf(alpha = 0.1f)
        )
    }
    visited {
        Modifier.color(palette.text)
    }
}

val ProjectTitleStyle = CssStyle {
    base {
        Modifier
            .fillMaxWidth()
            .textAlign(TextAlign.Center)
            .fontWeight(FontWeight.Bold)
            .fontSize(24.px)
    }
}

val ProjectDescriptionStyle = CssStyle {
    base {
        Modifier
            .fillMaxWidth()
            .padding(topBottom = 10.px)
            .textAlign(TextAlign.Center)
            .fontSize(16.px)
            .opacity(70.percent)
    }
}

val ProjectIconStyle = CssStyle {
    base {
        Modifier
            .position(Position.Absolute)
            .top(0.px)
            .left(50.percent)
            .transform { translate((-50).percent, (-50).percent) }
            .size(80.px)
            .backgroundColor(rgba(173, 216, 230, 0.2))
            .padding(12.px)
            .borderRadius(16.px)
            .border(1.px, LineStyle.Solid, rgba(255, 255, 255, 0.1)) // Subtle border
    }
}

val TagContainerStyle = CssStyle {
    base {
        Modifier
            .fillMaxWidth()
            .flexWrap(FlexWrap.Wrap)
            .gap(8.px)
    }
}

val TagStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .backgroundColor(palette.primary.toRgb().copyf(alpha = 0.1f))
            .color(palette.primary)
            .padding(topBottom = 4.px, leftRight = 12.px)
            .borderRadius(16.px)
            .fontSize(14.px)
            .fontWeight(FontWeight.Medium)
            .whiteSpace(WhiteSpace.NoWrap)
    }
}


val ShowcaseLinkStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .padding(top = 20.px)
            .color(palette.primary)
            .fontWeight(FontWeight.SemiBold)
            .transition(Transition.of("color", 300.ms))
    }
    hover {
        Modifier.color(palette.primary.darkened(0.1f))
    }
    visited {
        Modifier.color(palette.primary)
    }
}
