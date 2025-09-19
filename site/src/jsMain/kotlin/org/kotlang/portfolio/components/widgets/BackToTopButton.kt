package org.kotlang.portfolio.components.widgets

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.PointerEvents
import com.varabyte.kobweb.compose.css.Visibility
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowUp
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.style.animation.toAnimation
import com.varabyte.kobweb.silk.style.toModifier
import kotlinx.browser.document
import kotlinx.browser.window
import org.jetbrains.compose.web.css.AnimationTimingFunction
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.s
import org.kotlang.portfolio.theme.BackToTopButtonStyle
import org.kotlang.portfolio.theme.FadeInAnimation
import org.w3c.dom.SMOOTH
import org.w3c.dom.ScrollBehavior
import org.w3c.dom.ScrollToOptions
import org.w3c.dom.events.EventListener

@Composable
fun BackToTopButton() {
    var scroll: Double? by remember { mutableStateOf(null) }

    DisposableEffect(Unit) {
        val listener = EventListener {
            scroll = document.documentElement?.scrollTop
        }
        window.addEventListener(type = "scroll", callback = listener)
        onDispose {
            window.removeEventListener(type = "scroll", callback = listener)
        }
    }

    val showButton = (scroll ?: 0.0) > 400.0

    Column(
        modifier = Modifier
            .fillMaxSize()
            .position(Position.Fixed)
            .zIndex(1)
            .pointerEvents(PointerEvents.None),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End
    ) {
        Box(
            modifier = BackToTopButtonStyle.toModifier()
                .visibility(if (showButton) Visibility.Visible else Visibility.Hidden)
                .onClick {
                    document.documentElement?.scroll(
                        ScrollToOptions(
                            top = 0.0,
                            behavior = ScrollBehavior.SMOOTH
                        )
                    )
                }
                .then(
                    if (showButton) {
                        Modifier.animation(
                            FadeInAnimation.toAnimation(
                                duration = 1.s,
                                timingFunction = AnimationTimingFunction.EaseInOut
                            )
                        )
                    } else {
                        Modifier
                    }
                ),
            contentAlignment = Alignment.Center
        ) {
            FaArrowUp(size = IconSize.LG)
        }
    }
}