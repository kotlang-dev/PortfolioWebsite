package org.kotlang.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.css.px

@Composable
fun SocialIcon(
    href: String,
    content: @Composable () -> Unit
) {
    Link(path = href) {
        Box(
            modifier = Modifier
                .padding(8.px)
                .backgroundColor(Colors.Black)
                .color(Colors.Turquoise)
        ) {
            content()
        }
    }
}
