package org.kotlang.portfolio.theme

import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.animation.Keyframes
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.AnimationTimingFunction
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

val BackToTopButtonStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .size(50.px)
            .borderRadius(100.percent)
            .margin(right = 40.px, bottom = 40.px)
            .cursor(Cursor.Pointer)
            .styleModifier { property("pointer-events", "auto") }
            .transition(Transition.of("translate", 200.ms, AnimationTimingFunction.Ease))
            .backgroundColor(palette.background.inverted())
            .color(palette.background)
    }
    hover {
        Modifier.translateY((-10).px)
    }
}

val FadeInAnimation = Keyframes {
    from { Modifier.opacity(0) }
    to { Modifier.opacity(1) }
}
