package org.kotlang.portfolio.sections

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.framework.annotations.DelicateApi
import com.varabyte.kobweb.silk.components.icons.fa.FaBars
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.models.HomeSection
import org.kotlang.portfolio.theme.MainNavigationLinkStyle
import org.kotlang.portfolio.theme.toPortfolioPalette

@OptIn(DelicateApi::class)
@Composable
fun HomePageHeader() {
    val breakpoint = rememberBreakpoint()
    val palette = ColorMode.current.toPortfolioPalette()
    BaseHeader(
        leftContent = {
            Link(
                path = HomeSection.Hero.path,
                text = "Mohammad Arif",
                modifier = Modifier
                    .fontWeight(FontWeight.Bold)
                    .fontSize(24.px)
                    .textDecorationLine(TextDecorationLine.None)
            )
        },
        rightContent = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(24.px)
            ) {
                if (breakpoint > Breakpoint.SM) {
                    HomeSection.entries.forEach { section ->
                        Link(
                            path = section.path,
                            text = section.title,
                            modifier = MainNavigationLinkStyle.toModifier()
                        )
                    }
                } else {
                    FaBars(
                        modifier = Modifier
                            .margin(right = 15.px)
                            .onClick {
                                // TODO: Handle mobile menu click
                            },
                        size = IconSize.XL
                    )
                }
            }
        }
    )
}
