package com.github.woojiahao

import java.io.FileNotFoundException

/**
 * This example shows how the [MarkdownDocument.onError] method can be used to check whether the exported file location
 * is currently in use or already open.
 *
 * [MarkdownDocument.onError] passes the [Exception] raised so that users can perform checks on it.
 */
fun main() {
  val markdownDocument = MarkdownDocument("resources/markdown-all-in-one.md")
  markdownDocument.onError {
    println("An error occurred")

    if (it is FileNotFoundException) {
      println("File is currently already open")
    }
  }
  markdownDocument.toPDF()
}