package com.github.woojiahao

import com.github.woojiahao.markdownConverter
import com.github.woojiahao.style
import com.github.woojiahao.style.elements.lists.List.ListStyleType.SQUARE
import com.github.woojiahao.style.settings
import com.github.woojiahao.style.utility.FontFamily
import com.github.woojiahao.style.utility.px
import com.github.woojiahao.utility.c
import com.github.woojiahao.utility.document

/**
 * This example uses the CSS DSL to create a customized style for the exported PDF.
 *
 * More on this DSL can be found [here.](https://woojiahao.github.io/kMD2PDF/#/customDSL)
 */
fun main() {
  val converter = markdownConverter {
    document(document)

    settings {
      fontSize = 16.0.px
      font = FontFamily("Roboto", "Lato")
      monospaceFont = FontFamily("Fira Code")
    }

    style {
      p {
        textColor = c("455A64")
      }

      ul {
        listStyleType = SQUARE
      }

      selector("tr:nth-child(even)") {
        "background-color" to "#f2f2f2"
      }
    }
  }
  converter.convert()
}