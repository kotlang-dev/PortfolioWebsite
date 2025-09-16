package org.kotlang.portfolio.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.framework.annotations.DelicateApi
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.components.widgets.SocialBar
import org.kotlang.portfolio.models.HomeSection
import org.kotlang.portfolio.style.HeroDescriptionStyle
import org.kotlang.portfolio.style.HeroHeadlineStyle
import org.kotlang.portfolio.style.HeroIntroStyle
import org.kotlang.portfolio.style.HeroSubtitleStyle
import org.kotlang.portfolio.theme.ProfileImageStyle
import org.kotlang.portfolio.util.Res

@OptIn(DelicateApi::class)
@Composable
fun HeroSection() {
    val breakpoint = rememberBreakpoint()
    Box(
        modifier = Modifier
            .id(HomeSection.Home.id)
            .fillMaxWidth()
            .padding(topBottom = 100.px),
        contentAlignment = Alignment.Center
    ) {
        if (breakpoint > Breakpoint.MD) {
            // Desktop Layout
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row {
                    SocialBar()
                    MainContent()
                }
                ProfileImage()
            }
        } else {
            // Mobile Layout
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(40.px)
            ) {
                ProfileImage()
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    MainContent()
                }
                SocialBar(isRow = true)
            }
        }
    }
}

@Composable
private fun ProfileImage() {
    Image(
        src = Res.Image.profile,
        alt = "Mohammad Arif Profile Picture",
        modifier = ProfileImageStyle.toModifier().size(250.px)
    )
}

@Composable
private fun MainContent() {
    Column(modifier = Modifier.margin(leftRight = 24.px)) {
        SpanText(
            text = "Hello, I'm",
            modifier = HeroIntroStyle.toModifier()
        )
        SpanText(
            text = "Mohammad Arif",
            modifier = HeroHeadlineStyle.toModifier()
        )
        SpanText(
            text = "Android Developer | Kotlin Multiplatform Enthusiast",
            modifier = HeroSubtitleStyle.toModifier()
        )
        SpanText(
            text = "I'm an Android developer with two years of experience, specializing in building modern, user-centric applications. I also run a YouTube channel where I share tutorials to help other developers grow their skills.",
            modifier = HeroDescriptionStyle.toModifier()
        )
        Button(
            onClick = {}
        ) {
            Link(
                modifier = Modifier.color(Colors.White).textDecorationLine(TextDecorationLine.None),
                text = "Hire me",
                path = HomeSection.Contact.path
            )
        }
    }
}