package org.kotlang.portfolio.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.px

@Composable
fun SiteFooter() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.px),
        contentAlignment = Alignment.Center
    ) {
        SpanText("© 2025 Mohammad Arif. All Rights Reserved.")
    }
}
