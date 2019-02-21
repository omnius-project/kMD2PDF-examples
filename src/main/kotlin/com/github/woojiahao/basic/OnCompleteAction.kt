package com.github.woojiahao.basic

import com.github.woojiahao.MarkdownDocument
import java.awt.Desktop
import java.io.File

/**
 * This example shows how the [MarkdownDocument.onComplete] method can be used to launch the exported PDF on any OS.
 *
 * [MarkdownDocument.onComplete] passes the exported PDF [File] so that users can manipulate it as they see fit.
 */
fun main() {
  val markdownDocument = MarkdownDocument("resources/markdown-all-in-one.md")
  markdownDocument.onComplete {
    println("Conversion success - opening document")

    if (Desktop.isDesktopSupported()) {
      Desktop.getDesktop().open(it)
    } else {
      System.out.println("Awt Desktop is not supported!")
    }
  }
  markdownDocument.toPDF()
}