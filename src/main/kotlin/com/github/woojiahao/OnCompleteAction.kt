package com.github.woojiahao

import com.github.kittinunf.result.success
import com.github.woojiahao.markdownConverter
import com.github.woojiahao.utility.document
import java.awt.Desktop

/**
 * Using the [Result](https://github.com/kittinunf/Result) library, conversions will return the status of the operation
 * and you can use the `success` method where `it` has a reference to the output PDF file.
 */
fun main() {
  val converter = markdownConverter {
    document(document)
  }
  val conversionResult = converter.convert()
  conversionResult.success {
    if (Desktop.isDesktopSupported()) Desktop.getDesktop().open(it)
  }
}