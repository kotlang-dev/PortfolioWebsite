package org.kotlang.portfolio.theme

import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import org.jetbrains.compose.web.css.px

val SectionTitleStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .color(palette.primary)
            .fontSize(20.px)
            .fontWeight(FontWeight.Bold)
            .margin(bottom = 5.px)
    }
}

val SectionSubtitleStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .color(palette.text)
            .fontSize(24.px)
            .margin(bottom = 15.px)
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
