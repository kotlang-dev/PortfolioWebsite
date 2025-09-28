package org.kotlang.portfolio.theme

import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

val ShowcaseTitleStyle = CssStyle {
    base {
        Modifier
            .fontSize(32.px)
            .fontWeight(FontWeight.Bold)
    }
    Breakpoint.MD {
        Modifier.fontSize(48.px)
    }
}

val ShowcaseDescriptionStyle = CssStyle {
    val palette = colorMode.toPortfolioPalette()
    base {
        Modifier
            .fontSize(20.px)
            .lineHeight(1.5)
            .color(palette.text)
    }
}

val ShowcaseImageContainerStyle = CssStyle {
    base {
        Modifier
            .fillMaxWidth()
            .aspectRatio(16, 9)
    }
    Breakpoint.MD {
        Modifier.fillMaxWidth(60.percent)
    }
}

val ShowcaseImageStyle = CssStyle {
    base {
        Modifier
            .fillMaxSize()
            .objectFit(ObjectFit.Cover)
    }
    Breakpoint.MD {
        Modifier.styleModifier {
            property("mask-image", "linear-gradient(to left, black 70%, transparent)")
            property("-webkit-mask-image", "linear-gradient(to left, black 70%, transparent)")
        }
    }
}
