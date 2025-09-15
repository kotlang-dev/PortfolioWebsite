package org.kotlang.portfolio.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.icons.fa.FaMoon
import com.varabyte.kobweb.silk.components.icons.fa.FaSun
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.SilkTheme
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.localStorage
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.name
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.components.IconButton
import org.kotlang.portfolio.components.ThemeSwitchButton
import org.kotlang.portfolio.models.HomeSection
import org.kotlang.portfolio.style.ThemeIconStyle
import org.kotlang.portfolio.theme.HeaderStyle
import org.kotlang.portfolio.theme.MainNavigationLinkStyle
import org.kotlang.portfolio.util.Res
import org.kotlang.portfolio.util.Res.Dimens.ICON_SIZE
import org.kotlang.portfolio.util.Res.Dimens.ICON_SIZE_LG

@Composable
fun HomePageHeader() {
    val palette = SilkTheme.palette

    var colorMode by ColorMode.currentState

    LaunchedEffect(colorMode) {
        val savedTheme = localStorage.getItem(Res.String.SAVED_THEME) ?: ColorMode.LIGHT.name
        colorMode = ColorMode.valueOf(savedTheme)
    }

    Row(
        modifier = HeaderStyle.toModifier(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Link(
            path = "/",
            text = "Mohammad Arif",
            modifier = Modifier.fontWeight(FontWeight.Bold).fontSize(24.px).textDecorationLine(TextDecorationLine.None)
        )
        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(24.px)) {
            HomeSection.entries.forEach { section ->
                Link(
                    path = section.path,
                    text = section.title,
                    modifier = MainNavigationLinkStyle.toModifier()
                )
            }
            Button(
                onClick = {
                    colorMode = colorMode.opposite
                    localStorage.setItem(Res.String.SAVED_THEME, colorMode.name)
                },
                modifier = Modifier.padding(0.px).borderRadius(50.percent)
            ) {
                Box(Modifier.padding(8.px)) {
                    when (colorMode) {
                        ColorMode.LIGHT -> FaMoon()
                        ColorMode.DARK -> FaSun()
                    }
                }
            }
//            IconButton(
//                modifier = ThemeIconStyle.toModifier()
//                    .margin(all = 16.px)
//                    .styleModifier {
//                        property("pointer-events", "auto")
//                    },
//                colorMode = colorMode,
//                icon = if (colorMode.isLight) FaSun() else FaMoon(),
//                iconSize = ICON_SIZE.px,
//                onClick = {
//                    colorMode = colorMode.opposite
//                    localStorage.setItem(Res.String.SAVED_THEME, colorMode.name)
//                }
//            )
        }
    }
}
