package org.kotlang.portfolio.theme

import com.varabyte.kobweb.compose.ui.graphics.Color

object AppColors {
    val Primary = Color.rgb(0x059669)

    object Light {
        val Background = Color.rgb(0xFFFFFF) // White
        val Text = Color.rgb(0x1F2937)      // Gray 800
        val TextSecondary = Color.rgb(0x6B7280) // Gray 500
    }

    object Dark {
        val HeaderBackground = Color.rgb(0x111827) // Gray 900
        val Background = Color.rgb(0x1F2937)      // Gray 800
        val Text = Color.rgb(0xFFFFFF)             // White
        val TextSecondary = Color.rgb(0xD1D5DB)    // Gray 300
    }
}
