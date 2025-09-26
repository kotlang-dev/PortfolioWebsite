package org.kotlang.portfolio.util

import kotlinx.browser.document
import org.w3c.dom.HTMLMetaElement

fun setPageMetadata(title: String, description: String) {
    document.title = title
    (document.head?.querySelector("meta[name='description']") as? HTMLMetaElement)?.content = description
    (document.head?.querySelector("meta[property='og:title']") as? HTMLMetaElement)?.content = title
    (document.head?.querySelector("meta[property='og:description']") as? HTMLMetaElement)?.content = description
}
