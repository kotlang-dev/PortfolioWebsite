package org.kotlang.portfolio.components.widgets

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.SilkTheme
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.models.Project

@Composable
fun ProjectCard(project: Project) {
    val palette = SilkTheme.palette

    Link(path = project.link) {
        Column(
            modifier = Modifier
                .width(300.px)
                .padding(20.px)
                .borderRadius(12.px)
                .border(1.px)
        ) {
            Image(
                src = project.imageUrl,
                alt = "${project.title} Banner",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.px)
                    .objectFit(ObjectFit.Cover)
                    .borderRadius(8.px)
            )

            SpanText(
                text = project.title,
                modifier = Modifier
                    .margin(top = 16.px)
                    .fontSize(20.px)
                    .fontWeight(FontWeight.Bold)
            )

            SpanText(
                text = project.description,
                modifier = Modifier
                    .margin(top = 8.px)
                    .lineHeight(1.5)
            )
        }
    }
}
