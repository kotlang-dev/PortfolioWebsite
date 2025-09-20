package org.kotlang.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.classNames
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.models.TechStack
import org.kotlang.portfolio.theme.TechStackCardStyle

@Composable
fun TechStackCard(techStack: TechStack) {
    Column(
        modifier = TechStackCardStyle.toModifier()
            .maxWidth(300.px)
            .padding(24.px)
    ) {
        Box(
            modifier = Modifier.classNames("tech-stack-icon")
        ) {
            techStack.icon(IconSize.LG)
        }

        SpanText(
            text = techStack.title,
            modifier = Modifier.classNames("tech-stack-title")
        )

        SpanText(
            text = techStack.description,
            modifier = Modifier.classNames("tech-stack-description")
        )
    }
}