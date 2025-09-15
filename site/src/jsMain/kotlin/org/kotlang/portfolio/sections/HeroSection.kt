package org.kotlang.portfolio.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.models.HomeSection
import org.kotlang.portfolio.util.Res

@Composable
fun HeroSection() {
    Column(
        modifier = Modifier
            .id(HomeSection.Home.id)
            .fillMaxWidth()
            .padding(topBottom = 60.px),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(24.px) // Adds space between each item
    ) {
        // Your Profile Picture
        Image(
            src = Res.Image.profile,
            alt = "Mohammad Arif Profile Picture",
            modifier = Modifier.size(150.px)
        )

        // Your Name
        SpanText(
            text = "Mohammad Arif",
            modifier = Modifier
                .fontSize(48.px)
                .fontWeight(FontWeight.Bold)
        )

        // Your Title
        SpanText(
            text = "Android Developer | Kotlin Multiplatform Enthusiast",
            modifier = Modifier
                .fontSize(20.px)
                .color(Colors.Gray) // We will replace this with theme colors later
        )

        // "Get In Touch" Button
        Link(
            path = "#contact", // This will scroll to the contact section later
            text = "Get In Touch",
            modifier = Modifier
                .padding(topBottom = 14.px, leftRight = 28.px)
                .backgroundColor(Colors.DarkSlateBlue) // Placeholder color
                .color(Colors.White)
                .borderRadius(8.px)
                .textDecorationLine(com.varabyte.kobweb.compose.css.TextDecorationLine.None) // Remove underline
        )
    }
}
