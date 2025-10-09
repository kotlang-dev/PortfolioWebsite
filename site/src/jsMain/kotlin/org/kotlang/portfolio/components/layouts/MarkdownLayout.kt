package org.kotlang.portfolio.components.layouts

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.core.PageContext
import com.varabyte.kobweb.core.layout.Layout
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.window
import kotlinx.coroutines.delay
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.theme.MarkdownStyle
import org.kotlang.portfolio.util.setPageMetadata
import org.w3c.dom.url.URLSearchParams

@Layout
@Composable
fun MarkdownLayout(ctx: PageContext, content: @Composable () -> Unit) {

    var colorMode by ColorMode.currentState

    LaunchedEffect(ctx.route) {
        delay(100)
        val theme = window.location.search.let {
            val params = URLSearchParams(it)
            params.get("theme")
        }

        if (theme == "dark") colorMode = ColorMode.DARK
        else if (theme == "light") colorMode = ColorMode.LIGHT
    }

    LaunchedEffect(Unit) {
        setPageMetadata(
            title = "Privacy Policy - Kinex: Gym Workouts Guide",
            description = "Privacy Policy - Kinex: Gym Workouts Guide"
        )
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(topBottom = 60.px, leftRight = 24.px),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = MarkdownStyle.toModifier().maxWidth(800.px)
        ) {
            content()
        }
    }
}
