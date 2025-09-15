package org.kotlang.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.SilkTheme
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px

@Composable
fun FeatureCard(feature: String, description: String) {
    val palette = SilkTheme.palette

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.px)
            .borderRadius(12.px)
            .backgroundColor(Colors.Black.copyf(alpha = 0.1f))
            .border(1.px, LineStyle.Solid, Colors.Black)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            SpanText("✅", modifier = Modifier.fontSize(20.px).margin(right = 12.px))
            SpanText(
                text = feature,
                modifier = Modifier.fontSize(20.px).fontWeight(FontWeight.Bold)
            )
        }
        SpanText(
            text = description,
            modifier = Modifier.margin(top = 8.px).lineHeight(1.5)
        )
    }
}
