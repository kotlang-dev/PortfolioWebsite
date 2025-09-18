package org.kotlang.portfolio.components

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.models.HomeSection
import org.kotlang.portfolio.theme.SectionSubtitleStyle
import org.kotlang.portfolio.theme.SectionTitleStyle
import org.kotlang.portfolio.theme.SectionUnderlineStyle
import org.kotlang.portfolio.util.ObserveViewportEntered

@Composable
fun SectionTitle(section: HomeSection) {
    val scope = rememberCoroutineScope()
    var titleMargin by remember { mutableStateOf(50.px) }
    var subtitleMargin by remember { mutableStateOf(50.px) }

    ObserveViewportEntered(
        sectionId = section.id,
        distanceFromTop = 700.0,
        onViewportEntered = {
            scope.launch {
                subtitleMargin = 0.px
                delay(25)
                titleMargin = 0.px
            }
        }
    )

    Column(
        modifier = Modifier.id(section.id),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SpanText(
            text = section.title,
            modifier = SectionTitleStyle.toModifier().margin(left = titleMargin)
        )
        SpanText(
            text = section.subtitle,
            modifier = SectionSubtitleStyle.toModifier().margin(bottom = 10.px, left = subtitleMargin)
        )
        Box(modifier = SectionUnderlineStyle.toModifier())
    }
}
