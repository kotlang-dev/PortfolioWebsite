package org.kotlang.portfolio.theme

/*
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.SilkPalette
import com.varabyte.kobweb.silk.theme.colors.SilkPalettes

@InitSilk
fun initTheme(ctx: InitSilkContext) {
    ctx.theme.palettes = SilkPalettes(
        light = SilkPalette(
            background = AppColors.Light.Background,
            color = AppColors.Light.Text,
            button = SilkPalette.Button(
                default = AppColors.Primary,
                hover = AppColors.Primary.darkened(0.1f),
                pressed = AppColors.Primary.darkened(0.2f)
            )
        ),
        dark = SilkPalette(
            background = AppColors.Dark.Background,
            color = AppColors.Dark.Text,
            button = SilkPalette.Button(
                default = AppColors.Primary,
                hover = AppColors.Primary.darkened(0.1f),
                pressed = AppColors.Primary.darkened(0.2f)
            )
        )
    )

    // Set the global base styles for the entire site
    ctx.stylesheet.registerBaseStyle("body") {
        base {
            Modifier
                .backgroundColor(ctx.theme.palettes[ctx.theme.colorMode].background)
                .color(ctx.theme.palettes[ctx.theme.colorMode].color)
        }
    }
}
*/