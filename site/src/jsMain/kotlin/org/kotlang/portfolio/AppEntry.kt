package org.kotlang.portfolio

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxHeight
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.loadFromLocalStorage
import com.varabyte.kobweb.silk.theme.colors.palette.background
import com.varabyte.kobweb.silk.theme.colors.palette.border
import com.varabyte.kobweb.silk.theme.colors.palette.color
import com.varabyte.kobweb.silk.theme.colors.palette.link
import com.varabyte.kobweb.silk.theme.colors.saveToLocalStorage
import com.varabyte.kobweb.silk.theme.colors.systemPreference
import org.kotlang.portfolio.theme.PortfolioPalettes

@InitSilk
fun initStyles(ctx: InitSilkContext) {
    ctx.apply {
        config.initialColorMode = ColorMode.loadFromLocalStorage() ?: ColorMode.systemPreference

        theme.palettes.apply {
            light.apply {
                color = PortfolioPalettes.light.text
                background = PortfolioPalettes.light.background
                border = Colors.DarkSlateGray
                link.visited = ctx.theme.palettes.light.link.default
            }

            dark.apply {
                color = PortfolioPalettes.dark.text
                background = PortfolioPalettes.dark.background
                border = Colors.LightSlateGray
                link.apply {
                    val linkDark = Color.rgb(0x1a85ff)
                    default = linkDark
                    visited = linkDark
                }
            }
        }
    }
}

@App
@Composable
fun AppEntry(content: @Composable () -> Unit) {
    val colorMode = ColorMode.current
    LaunchedEffect(colorMode) {
        colorMode.saveToLocalStorage()
    }
    SilkApp {
        Surface(SmoothColorStyle.toModifier().fillMaxHeight()) {
            content()
        }
    }
}
