package org.kotlang.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.framework.annotations.DelicateApi
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.theme.ShowcaseImageContainerStyle
import org.kotlang.portfolio.theme.ShowcaseImageStyle
import org.kotlang.portfolio.theme.ShowcaseTitleStyle

@OptIn(DelicateApi::class)
@Composable
fun ShowcaseHeroSection(
    title: String,
    description: @Composable () -> Unit,
    coverImage: String
) {
    val breakpoint = rememberBreakpoint()

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                bottom = 60.px,
                left = if (breakpoint >= Breakpoint.MD) 60.px else 0.px
            ),
        contentAlignment = Alignment.Center
    ) {
        if (breakpoint >= Breakpoint.MD) {
            Row(
                modifier = Modifier.gap(20.px),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Intro(
                    modifier = Modifier.fillMaxWidth(40.percent).gap(10.px),
                    title = title,
                    description = description
                )
                CoverImage(coverImage = coverImage)
            }
        } else {
            Column(
                modifier = Modifier.fillMaxWidth().gap(20.px),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CoverImage(coverImage = coverImage)
                Intro(
                    modifier = Modifier.gap(10.px).padding(leftRight = 10.px),
                    title = title,
                    description = description
                )
            }
        }
    }
}

@Composable
private fun Intro(
    modifier: Modifier = Modifier,
    title: String,
    description: @Composable () -> Unit
) {
    Column(modifier = modifier) {
        SpanText(title, modifier = ShowcaseTitleStyle.toModifier())
        description()
    }
}

@Composable
private fun CoverImage(
    coverImage: String
) {
    Box(
        modifier = ShowcaseImageContainerStyle.toModifier()
    ) {
        Image(
            src = coverImage,
            alt = "Cover Image",
            modifier = ShowcaseImageStyle.toModifier()
        )
    }
}
