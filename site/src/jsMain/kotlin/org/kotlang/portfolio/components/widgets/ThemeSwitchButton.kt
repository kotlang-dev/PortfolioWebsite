package org.kotlang.portfolio.components.widgets

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.icons.MoonIcon
import com.varabyte.kobweb.silk.components.icons.SunIcon
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.kotlang.portfolio.theme.ThemeSwitchButtonStyle

@Composable
fun ThemeSwitchButton() {
    var colorMode by ColorMode.currentState
    Button(
        onClick = { colorMode = colorMode.opposite },
        modifier = ThemeSwitchButtonStyle.toModifier()
    ) {
        if (colorMode.isLight) MoonIcon() else SunIcon()
    }
}