package com.github.woojiahao.basic

import com.github.woojiahao.markdownConverter

/**
 * This example shows how a user can specify the export location of the PDF.
 *
 * **Note:** The exported PDF location must end with the PDF name and with the `.pdf` extension, otherwise, it will
 * throw an error.
 */
fun main() {
  val converter = markdownConverter {
    document(document)
    targetLocation("${System.getProperty("user.home")}/Desktop/exported.pdf")
  }
  converter.convert()
}