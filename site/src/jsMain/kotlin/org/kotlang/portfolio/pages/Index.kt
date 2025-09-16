package org.kotlang.portfolio.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.flexGrow
import com.varabyte.kobweb.compose.ui.modifiers.maxWidth
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.components.PageLayout
import org.kotlang.portfolio.sections.*

@Page
@Composable
fun HomePage() {
    PageLayout(
        header = { HomePageHeader() }
    ) {
        Column(
            modifier = Modifier
                .flexGrow(1)
                .maxWidth(1200.px)
        ) {
            HeroSection()
            AboutMeSection()
            ProjectsSection()
            ContactSection()
        }
    }
}
