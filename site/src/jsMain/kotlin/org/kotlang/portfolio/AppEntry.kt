package org.kotlang.portfolio

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.graphics.lightened
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxHeight
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.init.registerStyleBase
import com.varabyte.kobweb.silk.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.palette.background
import com.varabyte.kobweb.silk.theme.colors.palette.border
import com.varabyte.kobweb.silk.theme.colors.palette.color
import com.varabyte.kobweb.silk.theme.colors.palette.link

@InitSilk
fun initStyles(ctx: InitSilkContext) {
    ctx.stylesheet.registerStyleBase("html, body") { Modifier.fillMaxHeight() }
    ctx.apply {
        theme.palettes.apply {
            light.apply {
                color = Colors.Black.lightened(0.2f)
                background = Colors.WhiteSmoke
                border = Colors.DarkSlateGray
                link.visited = ctx.theme.palettes.light.link.default
            }

            dark.apply {
                color = Colors.White.darkened(0.1f)
                background = Color.rgb(15, 15, 25)
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
    SilkApp {
        Surface(SmoothColorStyle.toModifier().fillMaxHeight()) {
            content()
        }
    }
}
