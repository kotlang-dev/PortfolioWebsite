package org.kotlang.portfolio.theme

import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.graphics.lightened
import com.varabyte.kobweb.silk.theme.colors.ColorMode

// 1. Define the structure of our custom palette.
// These are the semantic names for the color roles in our app.
class PortfolioPalette(
    val background: Color,
    val surface: Color, // For slightly elevated surfaces
    val header: Color,
    val primary: Color,
    val text: Color,
    val border: Color
)

// 2. Define the actual color values for light and dark themes.
object PortfolioPalettes {
    val light = PortfolioPalette(
        background = Colors.WhiteSmoke, //Color.rgb(0xFFFFFF),
        surface = Color.rgb(0xF8F9FA),
        header = Colors.White.copyf(alpha = 0.85f),
        primary = Color.rgb(0x059669),
        text = Colors.Black.lightened(0.2f), //Color.rgb(0x18181B)
        border = Color.rgb(0xE5E7EB)
    )

    val dark = PortfolioPalette(
        background = Color.rgb(15, 15, 25), //Color.rgb(0x18181B),
        surface = Color.rgb(0x202023),
        header = Colors.Black.copyf(alpha = 0.85f),
        primary = Color.rgb(0x34D399),
        text = Colors.White.darkened(0.1f), //Color.rgb(0xFFFFFF)
        border = Color.rgb(0x374151) // Gray 700
    )
}

fun ColorMode.toPortfolioPalette(): PortfolioPalette {
    return when (this) {
        ColorMode.LIGHT -> PortfolioPalettes.light
        ColorMode.DARK -> PortfolioPalettes.dark
    }
}
