package com.github.woojiahao.basic

import com.github.woojiahao.MarkdownDocument
import com.github.woojiahao.style.Style

/**
 * This example showcases the most bare-bones use of the library.
 *
 * If no [Style] is provided, it uses the default styling and exports to the same location where the original markdown
 * document was located.
 */
fun main() {
  val markdownDocument = MarkdownDocument("resources/markdown-all-in-one.md")
  markdownDocument.toPDF()
}