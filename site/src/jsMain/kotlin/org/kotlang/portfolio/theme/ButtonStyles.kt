package org.kotlang.portfolio.theme

import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
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
