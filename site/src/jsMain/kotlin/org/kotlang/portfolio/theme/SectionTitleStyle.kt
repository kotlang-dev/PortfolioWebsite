package org.kotlang.portfolio.theme

import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val SectionTitleStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .fillMaxWidth()
            .textAlign(TextAlign.Center)
            .color(palette.primary)
            .fontSize(25.px)
            .fontWeight(FontWeight.Normal)
            .transition(Transition.of(property = "margin", duration = 300.ms))
    }
}

val SectionSubtitleStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .fillMaxWidth()
            .textAlign(TextAlign.Center)
            .color(palette.text)
            .fontSize(40.px)
            .fontWeight(FontWeight.Bold)
            .transition(Transition.of(property = "margin", duration = 300.ms))
    }
}

val SectionUnderlineStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .height(2.px)
            .width(80.px)
            .backgroundColor(palette.primary)
            .borderRadius(r = 50.px)
    }
}
