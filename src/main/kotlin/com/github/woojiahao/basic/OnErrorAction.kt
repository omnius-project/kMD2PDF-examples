package com.github.woojiahao.basic

import com.github.kittinunf.result.failure
import com.github.woojiahao.markdownConverter
import java.io.FileNotFoundException

/**
 * Using the [Result](https://github.com/kittinunf/Result) library, conversions will return the status of the operation
 * and you can use the `failure` method where `it` has a reference to the exception thrown.
 */
fun main() {
  val converter = markdownConverter {
    document(document)
  }
  val conversionStatus = converter.convert()
  conversionStatus.failure {
    if (it is FileNotFoundException) println("File is currently already open")
  }
}