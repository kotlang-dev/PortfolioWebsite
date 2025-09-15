package org.kotlang.portfolio.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.zIndex
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.framework.annotations.DelicateApi
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.style.ThemeIconStyle
import org.kotlang.portfolio.util.Res
import org.kotlang.portfolio.util.Res.Dimens.ICON_SIZE
import org.kotlang.portfolio.util.Res.Dimens.ICON_SIZE_LG

@OptIn(DelicateApi::class)
@Composable
fun ThemeSwitchButton(
    colorMode: ColorMode,
    onClick: () -> Unit
) {
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .position(Position.Fixed)
            .zIndex(1)
            .styleModifier {
                property("pointer-events", "none")
            },
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.End
    ) {

    }
}