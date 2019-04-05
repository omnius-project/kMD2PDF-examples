package com.github.woojiahao

import com.github.woojiahao.style.Settings.Theme.DARK
import com.github.woojiahao.style.settings
import com.github.woojiahao.utility.document

fun main() {
  val converter = markdownConverter {
    document(document)

    settings {
      // The other option is LIGHT which is the default
      theme = DARK
    }
  }

  converter.convert()
}