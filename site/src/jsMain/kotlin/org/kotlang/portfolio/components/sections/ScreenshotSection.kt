package org.kotlang.portfolio.components.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.components.widgets.ScreenshotCarousel

@Composable
fun ScreenshotSection(screenshots: List<String>) {
    Column(
        modifier = Modifier.fillMaxWidth().gap(20.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SectionTitle(
            title = "Screenshots",
            subtitle = "The App in Action"
        )
        ScreenshotCarousel(screenshots = screenshots)
    }
}
