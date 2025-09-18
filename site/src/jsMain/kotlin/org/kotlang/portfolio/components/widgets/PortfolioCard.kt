package org.kotlang.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.textDecorationLine
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowRight
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.models.PortfolioItem
import org.kotlang.portfolio.theme.*

@Composable
fun PortfolioCard(item: PortfolioItem) {
    Link(
        path = item.link,
        modifier = ProjectCardStyle.toModifier().textDecorationLine(TextDecorationLine.None)
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                src = item.icon,
                alt = "${item.title} Icon",
                modifier = ProjectIconStyle.toModifier()
            )
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                SpanText(item.title, modifier = ProjectTitleStyle.toModifier())
                SpanText(item.description, modifier = ProjectDescriptionStyle.toModifier())
                Row(modifier = TagContainerStyle.toModifier()) {
                    item.tags.forEach { tag ->
                        SpanText(tag, modifier = TagStyle.toModifier())
                    }
                }
                Row(
                    modifier = ShowcaseLinkStyle.toModifier().gap(8.px),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    SpanText("View Showcase")
                    FaArrowRight()
                }
            }
        }
    }
}