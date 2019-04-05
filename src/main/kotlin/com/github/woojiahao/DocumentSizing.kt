package com.github.woojiahao

import com.github.woojiahao.properties.DocumentSize
import com.github.woojiahao.properties.PageSize
import com.github.woojiahao.style.utility.Box
import com.github.woojiahao.style.utility.px
import com.github.woojiahao.utility.document

fun main() {
  val converter = markdownConverter {
    document(document)

    documentProperties {
      size(DocumentSize(PageSize.A4))
      margins(Box(50.0.px))
      leftPageMargins(Box(100.0.px))
    }
  }

  converter.convert()
}