package org.kotlang.portfolio.util

external class Swiper(selector: String, options: dynamic) {
    fun destroy()
}

fun swiperOptions(block: SwiperOptions.() -> Unit): SwiperOptions {
    return jso(block)
}

external interface SwiperOptions {
    var effect: String
    var coverflowEffect: CoverflowEffectOptions
    var centeredSlides: Boolean
    var loop: Boolean
    var slidesPerView: Any
    var spaceBetween: Int
    var autoplay: AutoplayOptions
    var breakpoints: dynamic
    var pagination: Any
    var navigation: NavigationOptions
}

external interface CoverflowEffectOptions {
    var rotate: Int
    var stretch: Int
    var depth: Int
    var modifier: Int
    var slideShadows: Boolean
}

external interface BreakpointOptions {
    var slidesPerView: Int
    var spaceBetween: Int
}

external interface AutoplayOptions {
    var delay: Int
    var disableOnInteraction: Boolean
}

external interface NavigationOptions {
    var nextEl: String
    var prevEl: String
}

fun <T> jso(block: T.() -> Unit): T {
    val obj: T = js("({})")
    obj.block()
    return obj
}