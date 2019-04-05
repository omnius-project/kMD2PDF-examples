package com.github.woojiahao.basic

import com.github.woojiahao.MarkdownDocument
import com.github.woojiahao.markdownConverter

/**
 * This example showcases the most bare-bones use of the library.
 */
fun main() {
  val document = MarkdownDocument("resources/markdown-all-in-one.md")
  val converter = markdownConverter {
    document(document)
  }
  converter.convert()
}