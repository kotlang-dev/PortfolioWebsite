package org.kotlang.portfolio.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.components.sections.SectionTitle
import org.kotlang.portfolio.components.widgets.PortfolioCard
import org.kotlang.portfolio.models.HomeSection
import org.kotlang.portfolio.models.PortfolioData
import org.kotlang.portfolio.theme.CardGridStyle
import org.kotlang.portfolio.theme.SectionContainerStyle

@Composable
fun CoursesSection() {
    Box(
        modifier = Modifier
            .id(HomeSection.Courses.id)
            .fillMaxWidth()
            .padding(topBottom = 80.px),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = SectionContainerStyle.toModifier().gap(60.px),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SectionTitle(
                title = HomeSection.Courses.title,
                subtitle = HomeSection.Courses.subtitle,
                sectionId = HomeSection.Courses.id
            )

            Row(modifier = CardGridStyle.toModifier()) {
                PortfolioData.courses.forEach { course ->
                    PortfolioCard(item = course)
                }
            }
        }
    }
}
