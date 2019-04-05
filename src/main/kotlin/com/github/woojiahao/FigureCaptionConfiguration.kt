package com.github.woojiahao

import com.github.woojiahao.utility.document

/**
 * Example on configuring the figure captions that are automatically rendered.
 */
fun main() {
  val converter = markdownConverter {
    document(document)

    documentProperties {
      figcaption {
        isVisible = true
        divider = "::"
        prepend = "Fig"
        append = ":)"
      }
    }
  }

  converter.convert()
}