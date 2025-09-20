package org.kotlang.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.components.SectionTitle
import org.kotlang.portfolio.components.widgets.TechStackCard
import org.kotlang.portfolio.models.TechStack
import org.kotlang.portfolio.theme.CardGridStyle
import org.kotlang.portfolio.theme.SectionContainerStyle

@Composable
fun TechStackSection(techStack: List<TechStack>) {
    Column(
        modifier = SectionContainerStyle.toModifier(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SectionTitle(
            title = "Tech Stack",
            subtitle = "The Core Technologies"
        )

        Row(modifier = CardGridStyle.toModifier().margin(top = 40.px)) {
            techStack.forEach { tech ->
                TechStackCard(techStack = tech)
            }
        }
    }
}
