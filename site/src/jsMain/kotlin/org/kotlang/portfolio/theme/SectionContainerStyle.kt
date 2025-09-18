package org.kotlang.portfolio.theme

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.style.CssStyle
import org.jetbrains.compose.web.css.*

val SectionContainerStyle = CssStyle {
    base {
        Modifier
            .fillMaxWidth()
            .maxWidth(1200.px)
            .padding(topBottom = 80.px)
    }
}

val CardGridStyle = CssStyle {
    base {
        Modifier
            .fillMaxWidth()
            .flexWrap(FlexWrap.Wrap)
            .justifyContent(JustifyContent.Center)
            .gap(32.px)
    }
}
