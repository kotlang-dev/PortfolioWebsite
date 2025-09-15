package org.kotlang.portfolio.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.SilkTheme
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.theme.AppColors

@Composable
fun AboutMeSection() {
    val palette = SilkTheme.palette

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(topBottom = 80.px),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(80.percent),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(40.px)
        ) {
            // Section Title
            SpanText(
                text = "About Me",
                modifier = Modifier
                    .fontSize(32.px)
                    .fontWeight(FontWeight.Bold)
                    .textAlign(TextAlign.Center)
            )

            // Two-column layout for image and text
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(40.px),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Left Column: Image
                Image(
                    src = "https://kotlang-dev.github.io/assets/img/about.png",
                    alt = "About Me Image",
                    modifier = Modifier.weight(1f).borderRadius(12.px) // weight makes it take up 1 part of the space
                )

                // Right Column: Text
                Column(
                    modifier = Modifier.weight(2f), // weight makes it take up 2 parts of the space
                    verticalArrangement = Arrangement.spacedBy(12.px)
                ) {
                    SpanText(
                        text = "I'm Mohammad Arif, a passionate Android developer with a love for clean architecture and cutting-edge technologies. My journey in software development is driven by the thrill of turning complex problems into elegant, user-friendly mobile applications.",
                        modifier = Modifier.lineHeight(1.6) // Improves readability
                    )
                    SpanText(
                        text = "Specializing in Kotlin and the modern Android toolkit, I focus on building robust, scalable apps. I'm currently diving deep into Kotlin Multiplatform, exploring its potential to create seamless experiences across different devices. This portfolio itself is a testament to that passion, built entirely with Kotlin and Compose for Web.",
                        modifier = Modifier.lineHeight(1.6)
                    )
                }
            }
        }
    }
}
