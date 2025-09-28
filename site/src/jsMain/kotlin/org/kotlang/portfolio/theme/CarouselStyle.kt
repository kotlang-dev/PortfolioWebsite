package org.kotlang.portfolio.theme

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.css.keywords.auto

val CarouselStyle = CssStyle {
    base {
        // Default style for mobile screens
        Modifier
            .width(90.percent)
            .maxWidth(1200.px)
    }
    Breakpoint.MD {
        Modifier.width(80.percent)
    }
    Breakpoint.LG {
        Modifier.width(70.percent)
    }

    val palette = colorMode.toPortfolioPalette()

    cssRule(" .swiper") {
        Modifier
            .width(100.percent)
            .height(auto)
    }

    cssRule(" .swiper-button-next, .swiper-button-prev") {
        Modifier.color(palette.primary)
    }
}
