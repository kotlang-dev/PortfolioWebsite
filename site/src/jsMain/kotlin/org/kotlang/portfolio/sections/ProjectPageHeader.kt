package org.kotlang.portfolio.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.theme.SilkTheme
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun ProjectPageHeader(githubLink: String, playStoreLink: String? = null) {
    val palette = SilkTheme.palette
    val colorMode = ColorMode.current

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(leftRight = 10.percent, topBottom = 16.px)
            .position(Position.Sticky)
            .top(0.px)
            .backgroundColor(Colors.Gray)
            .zIndex(1),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Link(path = "/", modifier = Modifier.textDecorationLine(TextDecorationLine.None)) {
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.px)) {
                FaArrowLeft()
                com.varabyte.kobweb.silk.components.text.SpanText("Back to Portfolio")
            }
        }

        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(16.px)) {
            Link(path = githubLink, modifier = Modifier.textDecorationLine(TextDecorationLine.None)) {
                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.px)) {
                    FaGithub()
                    com.varabyte.kobweb.silk.components.text.SpanText("View on Github")
                }
            }
            if (playStoreLink != null) {
                Link(path = playStoreLink, modifier = Modifier.textDecorationLine(TextDecorationLine.None)) {
                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.px)) {
                        FaGooglePlay()
                        com.varabyte.kobweb.silk.components.text.SpanText("Get on Play Store")
                    }
                }
            }
            Button(onClick = {  }, modifier = Modifier.borderRadius(50.percent).padding(0.px)) {
                if (colorMode.isLight) FaMoon() else FaSun()
            }
        }
    }
}
