package com.github.woojiahao

import com.github.woojiahao.markdownConverter
import com.github.woojiahao.utility.document

/**
 * This example showcases the most bare-bones use of the library.
 */
fun main() {
  val converter = markdownConverter {
    document(document)
  }
  converter.convert()
}