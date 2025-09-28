package org.kotlang.portfolio.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.components.sections.SectionTitle
import org.kotlang.portfolio.components.widgets.SocialIcon
import org.kotlang.portfolio.models.HomeSection

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
            modifier = Modifier.fillMaxWidth(90.percent),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(24.px)
        ) {
            SectionTitle(
                title = HomeSection.Contact.title,
                subtitle = HomeSection.Contact.subtitle,
                sectionId = HomeSection.Contact.id
            )

            SpanText(
                text = "I'm currently available for freelance work and open to discussing new projects.",
                modifier = Modifier.textAlign(TextAlign.Center)
            )

            Row(
                horizontalArrangement = Arrangement.spacedBy(16.px)
            ) {
                SocialIcon(href = "https://www.youtube.com/@kotlang") { FaYoutube(size = IconSize.LG) }
                SocialIcon(href = "https://github.com/kotlang-dev") { FaGithub(size = IconSize.LG) }
                SocialIcon(href = "https://www.linkedin.com/in/mohammadarif-dev/") { FaLinkedin(size = IconSize.LG) }
                SocialIcon(href = "https://www.instagram.com/kotlang.dev/") { FaInstagram(size = IconSize.LG) }
                SocialIcon(href = "#") { FaDiscord(size = IconSize.LG) } //TODO Replace # with your Discord link
            }
        }
    }
}
