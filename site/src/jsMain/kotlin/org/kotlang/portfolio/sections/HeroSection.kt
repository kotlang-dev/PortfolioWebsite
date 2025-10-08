package org.kotlang.portfolio.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.framework.annotations.DelicateApi
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.components.widgets.SocialBar
import org.kotlang.portfolio.models.HomeSection
import org.kotlang.portfolio.theme.HeroDescriptionStyle
import org.kotlang.portfolio.theme.HeroHeadlineStyle
import org.kotlang.portfolio.theme.HeroIntroStyle
import org.kotlang.portfolio.theme.HeroSubtitleStyle
import org.kotlang.portfolio.theme.PrimaryButtonStyle
import org.kotlang.portfolio.theme.ProfileImageStyle
import org.kotlang.portfolio.util.Res

@OptIn(DelicateApi::class)
@Composable
fun HeroSection() {
    val breakpoint = rememberBreakpoint()
    Box(
        modifier = Modifier
            .id(HomeSection.Hero.id)
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
        src = Res.Image.PROFILE,
        alt = "Mohammad Arif Profile Picture",
        modifier = ProfileImageStyle.toModifier().size(250.px)
    )
}

@Composable
private fun MainContent() {
    Column(
//        modifier = Modifier.margin(leftRight = 24.px)
    ) {
        SpanText(
            text = "Hello, I'm",
            modifier = HeroIntroStyle.toModifier()
        )
        SpanText(
            text = "Mohammad Arif",
            modifier = HeroHeadlineStyle.toModifier()
        )
        SpanText(
            text = "Android & Kotlin Multiplatform Developer",
            modifier = HeroSubtitleStyle.toModifier()
        )
        SpanText(
            text = "A Kotlin specialist with three years of experience crafting modern Android apps with Jetpack Compose. Passionate about the entire Kotlin ecosystem, including Kotlin Multiplatform. I also create educational content to empower the developer community.",
            modifier = HeroDescriptionStyle.toModifier()
        )
        Link(
            path = HomeSection.Contact.path,
            text = "Get in Touch",
            modifier = PrimaryButtonStyle.toModifier()
        )
    }
}