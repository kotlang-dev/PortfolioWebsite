package org.kotlang.portfolio.models

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.graphics.Color
import com.varabyte.kobweb.silk.components.icons.fa.FaDiscord
import com.varabyte.kobweb.silk.components.icons.fa.FaGithub
import com.varabyte.kobweb.silk.components.icons.fa.FaLinkedin
import com.varabyte.kobweb.silk.components.icons.fa.FaYoutube
import com.varabyte.kobweb.silk.components.icons.fa.IconSize

enum class SocialLink(
    val icon: @Composable (IconSize) -> Unit,
    val url: String,
    val brandColor: Color
) {
    Github(
        icon = { FaGithub(size = it) },
        url = "https://github.com/kotlang-dev",
        brandColor = Color.rgb(0x181717)
    ),
    Youtube(
        icon = { FaYoutube(size = it) },
        url = "https://www.youtube.com/@kotlang",
        brandColor = Color.rgb(0xFF0000)
    ),
    Linkedin(
        icon = { FaLinkedin(size = it) },
        url = "https://www.linkedin.com/in/mohammad-arif-5371a3253/",
        brandColor = Color.rgb(0x0A66C2)
    ),
    Discord(
        icon = { FaDiscord(size = it) },
        url = "https://discord.gg/your-invite",
        brandColor = Color.rgb(0x5865F2)
    )
}