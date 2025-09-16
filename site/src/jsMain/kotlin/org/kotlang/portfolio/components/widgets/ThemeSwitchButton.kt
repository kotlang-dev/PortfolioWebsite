package org.kotlang.portfolio.components.widgets

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.icons.fa.FaMoon
import com.varabyte.kobweb.silk.components.icons.fa.FaSun
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun ThemeSwitchButton() {
    var colorMode by ColorMode.currentState
    Button(
        onClick = { colorMode = colorMode.opposite },
        modifier = Modifier.borderRadius(50.percent).padding(0.px)
    ) {
        if (colorMode.isLight) FaMoon() else FaSun()
    }
}