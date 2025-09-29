package org.kotlang.portfolio.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.components.sections.SectionTitle
import org.kotlang.portfolio.components.widgets.SocialLink
import org.kotlang.portfolio.models.HomeSection
import org.kotlang.portfolio.models.SocialLink
import org.kotlang.portfolio.theme.ContactTextStyle
import org.kotlang.portfolio.theme.EmailLinkStyle
import org.kotlang.portfolio.theme.SectionContainerStyle

@Composable
fun ContactSection() {
    Box(
        modifier = Modifier
            .id(HomeSection.Contact.id)
            .fillMaxWidth()
            .padding(topBottom = 80.px),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = SectionContainerStyle.toModifier().gap(40.px),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SectionTitle(
                title = HomeSection.Contact.title,
                subtitle = HomeSection.Contact.subtitle,
                sectionId = HomeSection.Contact.id
            )

            Column(
                modifier = Modifier.gap(24.px),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                SpanText(
                    text = "I'm currently open to new opportunities and freelance projects. Feel free to reach out!",
                    modifier = ContactTextStyle.toModifier()
                )
                Link(
                    path = "mailto:ursmohammadarif@gmail.com",
                    text = "ursmohammadarif@gmail.com",
                    modifier = EmailLinkStyle.toModifier()
                )
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.px)
            ) {
                SocialLink.entries.forEach { social ->
                    SocialLink(social)
                }
            }
        }
    }
}
