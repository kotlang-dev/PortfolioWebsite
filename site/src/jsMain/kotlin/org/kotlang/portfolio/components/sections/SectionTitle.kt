package org.kotlang.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.theme.SectionSubtitleStyle
import org.kotlang.portfolio.theme.SectionTitleStyle
import org.kotlang.portfolio.theme.SectionUnderlineStyle

@Composable
fun SectionTitle(
    title: String,
    subtitle: String,
    sectionId: String? = null
) {
    Column(
        modifier = Modifier
            .then(if (sectionId != null) Modifier.id(sectionId) else Modifier)
            .fillMaxWidth()
            .margin(bottom = 20.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SpanText(
            text = title,
            modifier = SectionTitleStyle.toModifier()
        )
        SpanText(
            text = subtitle,
            modifier = SectionSubtitleStyle.toModifier()
        )
        Box(modifier = SectionUnderlineStyle.toModifier())
    }
}
