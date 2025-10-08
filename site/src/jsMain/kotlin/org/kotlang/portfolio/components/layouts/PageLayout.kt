package org.kotlang.portfolio.components.layouts

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.ColumnScope
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import org.kotlang.portfolio.components.sections.SiteFooter
import org.kotlang.portfolio.components.widgets.BackToTopButton

@Composable
fun PageLayout(
    header: @Composable () -> Unit,
    content: @Composable ColumnScope.() -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            header()
            Column(
                modifier = Modifier.fillMaxWidth().weight(1),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                content()
            }
            SiteFooter()
        }
        BackToTopButton()
    }
}