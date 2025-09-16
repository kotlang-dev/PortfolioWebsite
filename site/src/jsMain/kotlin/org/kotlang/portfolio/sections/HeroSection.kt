package org.kotlang.portfolio.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
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
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.components.widgets.SocialBar
import org.kotlang.portfolio.models.HomeSection
import org.kotlang.portfolio.theme.MainButtonStyle
import org.kotlang.portfolio.theme.ProfileImageStyle
import org.kotlang.portfolio.theme.toPortfolioPalette
import org.kotlang.portfolio.util.Res

@OptIn(DelicateApi::class)
@Composable
fun HeroSection() {
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier
            .id(HomeSection.Home.id)
            .fillMaxWidth()
            .padding(topBottom = 60.px),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(24.px) // Adds space between each item
    ) {
        Row {
            if (breakpoint > Breakpoint.MD) {
                SocialBar()
            }
            MainText(breakpoint = breakpoint)
            Image(
                src = Res.Image.profile,
                alt = "Mohammad Arif Profile Picture",
                modifier = ProfileImageStyle.toModifier().size(150.px)
            )
        }
    }
}

@Composable
fun MainText(breakpoint: Breakpoint) {
    val font = "Roboto"
    val palette = ColorMode.current.toPortfolioPalette()
    Column {
        SpanText(
            text = "Hello, I'm",
            modifier = Modifier
                .margin(topBottom = 0.px)
                .fontFamily(font)
                .fontSize(if (breakpoint >= Breakpoint.LG) 45.px else 20.px)
                .fontWeight(FontWeight.Normal)
                .color(palette.primary)
        )
        SpanText(
            text = "Mohammad Arif",
            modifier = Modifier
                .margin(top = 20.px, bottom = 0.px)
                .fontFamily(font)
                .fontSize(if (breakpoint >= Breakpoint.LG) 68.px else 40.px)
                .fontWeight(FontWeight.Bolder)
                .color(palette.text)
        )
        SpanText(
            text = "Android Developer | Kotlin Multiplatform Enthusiast",
            modifier = Modifier
                .margin(top = 10.px, bottom = 5.px)
                .fontFamily(font)
                .fontSize(20.px)
                .fontWeight(FontWeight.Bold)
                .color(palette.text)
        )
        SpanText(
            text = "I'm an Android developer with two years of experience, specializing in building modern, user-centric applications. I also run a YouTube channel where I share tutorials to help other developers grow their skills.",
            modifier = Modifier
                .margin(bottom = 25.px)
                .maxWidth(400.px)
                .fontFamily(font)
                .fontSize(15.px)
                .fontStyle(FontStyle.Italic)
                .fontWeight(FontWeight.Normal)
                .color(palette.text)
        )
        Button(
            onClick = {},
            modifier = MainButtonStyle.toModifier()
                .height(40.px)
                .border(width = 0.px)
                .borderRadius(r = 5.px)
                .backgroundColor(palette.primary)
                .color(Colors.White)
                .cursor(Cursor.Pointer)
        ) {
            Link(
                modifier = Modifier
                    .color(Colors.White)
                    .textDecorationLine(TextDecorationLine.None),
                text = "Hire me",
                path = HomeSection.Contact.path
            )
        }
    }
}