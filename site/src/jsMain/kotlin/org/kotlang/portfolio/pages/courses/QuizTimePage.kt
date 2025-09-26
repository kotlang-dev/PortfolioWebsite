package org.kotlang.portfolio.pages.courses

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.kotlang.portfolio.components.PageLayout
import org.kotlang.portfolio.components.sections.TechStackSection
import org.kotlang.portfolio.models.Routes
import org.kotlang.portfolio.models.TechStack
import org.kotlang.portfolio.sections.ProjectPageHeader
import org.kotlang.portfolio.util.Res

@Page(Routes.COURSES_QUIZ_TIME)
@Composable
fun QuizTimePage() {
    val techStack = listOf(
        TechStack.Compose,
        TechStack.RoomDB,
        TechStack.Koin,
        TechStack.Ktor,
        TechStack.MongoDb
    )
    PageLayout(
        header = {
            ProjectPageHeader(
                githubLink = Res.Link.QUIZTIME_GITHUB,
                courseLink = Res.Link.QUIZTIME_COURSE
            )
        }
    ) {
        Box(
            modifier = Modifier.fillMaxSize().padding(topBottom = 40.px, leftRight = 5.percent),
            contentAlignment = Alignment.TopCenter
        ) {
            Column(
                modifier = Modifier.fillMaxWidth().maxWidth(1000.px),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(40.px)
            ) {
                Image(
                    src = "https://github.com/kotlang-dev/QuizTime/blob/main/readme-assets/QuizTime-Thumbnail.png?raw=true",
                    alt = "QuizTime App Banner",
                    modifier = Modifier.fillMaxWidth().borderRadius(12.px)
                )

                Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(12.px)) {
                    SpanText("QuizTime App", modifier = Modifier.fontSize(32.px).fontWeight(FontWeight.Bold).textAlign(TextAlign.Center))
                    SpanText(
                        "A full-stack quiz application featuring a Ktor backend and a Jetpack Compose UI for Android, developed as part of a premium Udemy course.",
                        modifier = Modifier.textAlign(TextAlign.Center).opacity(80.percent)
                    )
                }

                TechStackSection(techStack)
            }
        }
    }
}
