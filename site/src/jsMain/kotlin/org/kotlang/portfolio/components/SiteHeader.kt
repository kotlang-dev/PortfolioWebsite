package org.kotlang.portfolio.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.icons.fa.FaMoon
import com.varabyte.kobweb.silk.components.icons.fa.FaSun
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.theme.SilkTheme
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun SiteHeader() {
    val palette = SilkTheme.palette
    val colorMode = ColorMode.current

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(leftRight = 10.percent, topBottom = 16.px)
            .position(Position.Sticky)
            .top(0.px)
            .backgroundColor(Colors.Cyan)
            .zIndex(1),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Left side: Name
        Link(
            path = "/",
            text = "Mohammad Arif",
            modifier = Modifier
                .fontWeight(FontWeight.Bold)
                .fontSize(24.px)
                .textDecorationLine(TextDecorationLine.None)
        )

        // Right side: Nav links and Theme toggle
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(24.px)
        ) {
            Link("about", "About", modifier = Modifier.textDecorationLine(TextDecorationLine.None))
            Link("projects", "Projects", modifier = Modifier.textDecorationLine(TextDecorationLine.None))

            Button(
                onClick = {  },
                modifier = Modifier.borderRadius(50.percent).padding(0.px)
            ) {
                if (colorMode.isLight) FaMoon() else FaSun()
            }
        }
    }
}

