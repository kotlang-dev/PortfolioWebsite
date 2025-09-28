package org.kotlang.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.theme.SectionContainerStyle

@Composable
fun DesktopScreenshotSection(
    desktopScreenshot: String
) {
    Column(
        modifier = SectionContainerStyle.toModifier().padding(top = 0.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SectionTitle(
            title = "Desktop Preview",
            subtitle = "See it in Action"
        )
        Image(
            src = desktopScreenshot,
            alt = "Desktop Screenshot",
            modifier = Modifier.fillMaxWidth(90.percent)
        )
    }
}