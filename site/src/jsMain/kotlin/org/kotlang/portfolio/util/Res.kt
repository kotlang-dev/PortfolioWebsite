package org.kotlang.portfolio.util

import com.varabyte.kobweb.compose.ui.graphics.Color

object Res {
    object Image {
        const val PROFILE = "profile_image.jpg"
        const val APP_ICON_AGE_CALC = "ic_agecalc.png"
        const val APP_ICON_KINEX = "ic_kinex.png"
        const val APP_ICON_MEASUREMATE = "ic_measuremate.png"
        const val APP_ICON_QUIZTIME = "ic_quiztime.png"
    }
    object String {
        const val NAME = "Stefan Jovanovic"
        const val PROFESSION = "Kotlin Multiplaform Developer"
        const val ABOUT_ME =
            "Lorem ipsum dolor sit amet, nisl tempus lorem adipiscing elit. Donec sollicitudin blandit tellus, ac sagittis ligula egestas consequat. Lorem ipsum dolor sit amet."
        const val BUTTON_TEXT = "Get in touch"
        const val ROBOTO_CONDENSED = "RobotoCondensedBold"
        const val ROBOTO_REGULAR = "RobotoRegular"
        const val MY_EMAIL = "mailto:stefan.jovanavich@gmail.com"
        const val SAVED_THEME = "theme"
    }
    object Icon {
        const val EMAIL_LIGHT = "mail.svg"
        const val EMAIL_DARK = "mail_light.svg"
        const val GITHUB = "github.svg"
        const val GITHUB_LIGHT = "github_light.svg"
        const val INSTAGRAM = "instagram.svg"
        const val INSTAGRAM_LIGHT = "instagram_light.svg"
        const val GITLAB = "gitlab.svg"
        const val GITLAB_LIGHT = "gitlab_light.svg"
        const val SUN = "sun.svg"
        const val MOON = "moon.svg"
    }
    //TODO remove it
    enum class Theme(val color: Color) {
        BLUE(color = Color.rgb(r = 33, g = 150, b = 243)),
        LIGHT_BLUE(color = Color.rgb(r = 168, g = 236, b = 255)),
        DARK_BLUE(color = Color.rgb(r = 34, g = 63, b = 94)),
        SOCIAL_ICON_BACKGROUND_LIGHT(color = Color.rgb(r = 230, g = 230, b = 230)),
        SOCIAL_ICON_BACKGROUND_DARK(color = Color.rgb(r = 48, g = 82, b = 118)),
        GRADIENT_ONE(color = Color.rgb(r = 161, g = 196, b = 253)),
        GRADIENT_ONE_DARK(color = Color.rgb(r = 19, g = 38, b = 58)),
        GRADIENT_TWO(color = Color.rgb(r = 194, g = 233, b = 251)),
        GRADIENT_TWO_DARK(color = Color.rgb(r = 20, g = 46, b = 73))
    }

    object Dimens {
        const val BORDER_RADIUS = 8
        const val MAX_CARD_WIDTH = 1000
        const val MAX_CARD_HEIGHT = 600
        const val ICON_SIZE = 24
        const val ICON_SIZE_LG = 32
    }

    object Link {
        const val MEASUREMATE_GITHUB = "https://github.com/kotlang-dev/MeasureMate"
        const val MEASUREMATE_COURSE = "https://www.udemy.com/course/measuremate/?referralCode=B3DE352F96BC3C3E9E80"
        const val QUIZTIME_GITHUB = "https://github.com/kotlang-dev/QuizTime"
        const val QUIZTIME_COURSE = "https://www.udemy.com/course/quiztime/learn/?referralCode=D1F5E08155303110B7A4"
        const val AGE_CALC_GITHUB = "https://github.com/kotlang-dev/AgeCalculator-TrackDates"
        const val AGE_CALC_PLAYSTORE = "https://play.google.com/store/apps/details?id=com.synac.agecalculator"
        const val KINEX_PLAYSTORE = "https://play.google.com/store/apps/details?id=com.synac.kinex"

        const val YOUTUBE = "https://www.youtube.com/@kotlang"
        const val GITHUB = "https://github.com/kotlang-dev"
        const val LINKEDIN = "https://www.linkedin.com/in/kotlang/"
        const val DISCORD = "https://discord.com/invite/mwTnZKHaVt"
    }
}