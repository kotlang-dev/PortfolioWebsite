package org.kotlang.portfolio.components.widgets

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.kotlang.portfolio.theme.CarouselStyle
import org.kotlang.portfolio.util.BreakpointOptions
import org.kotlang.portfolio.util.Swiper
import org.kotlang.portfolio.util.jso
import org.kotlang.portfolio.util.swiperOptions

@Composable
fun ScreenshotCarousel(screenshots: List<String>) {
    Box(
        modifier = CarouselStyle.toModifier().padding(topBottom = 40.px),
        contentAlignment = Alignment.Center
    ) {
        Div(attrs = { classes("swiper") }) {
            Div(attrs = { classes("swiper-wrapper") }) {
                screenshots.forEach { screenshot ->
                    Div(attrs = { classes("swiper-slide") }) {
                        Image(
                            src = screenshot,
                            alt = "App Screenshot",
                            modifier = Modifier.fillMaxSize().borderRadius(16.px)
                        )
                    }
                }
            }
            Div(attrs = { classes("swiper-button-prev") })
            Div(attrs = { classes("swiper-button-next") })
        }
    }

    DisposableEffect(Unit) {
        val swiper = Swiper(
            selector = ".swiper",
            options = swiperOptions {
                effect = "coverflow"
                centeredSlides = true
                coverflowEffect = jso {
                    rotate = 30
                    stretch = 0
                    depth = 100
                    modifier = 1
                    slideShadows = false
                }
                loop = true
                slidesPerView = 1
                spaceBetween = 20
                autoplay = jso {
                    delay = 2000
                    disableOnInteraction = false
                }
                pagination = false
                navigation = jso {
                    nextEl = ".swiper-button-next"
                    prevEl = ".swiper-button-prev"
                }
                breakpoints = jso {
                    this[768] = jso<BreakpointOptions> {
                        slidesPerView = 2
                        spaceBetween = 30
                    }
                    this[1024] = jso<BreakpointOptions> {
                        slidesPerView = 3
                        spaceBetween = 55
                    }
                }
            }
        )
        onDispose {
            swiper.destroy()
        }
    }
}
