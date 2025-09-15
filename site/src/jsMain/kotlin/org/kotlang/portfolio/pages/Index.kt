package org.kotlang.portfolio.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.flexGrow
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.text.SpanText
import org.kotlang.portfolio.components.PageLayout
import org.kotlang.portfolio.sections.AboutMeSection
import org.kotlang.portfolio.sections.ContactSection
import org.kotlang.portfolio.sections.HeroSection
import org.kotlang.portfolio.sections.HomePageHeader
import org.kotlang.portfolio.sections.ProjectsSection

@Page
@Composable
fun HomePage() {
    PageLayout(
        header = { HomePageHeader() }
    ) {
        Column(modifier = Modifier.flexGrow(1)) {
            HeroSection()
            AboutMeSection()
            ProjectsSection()
            ContactSection()
        }
    }
}
