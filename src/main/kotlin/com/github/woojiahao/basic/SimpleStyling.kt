package com.github.woojiahao.basic

import com.github.woojiahao.MarkdownDocument
import com.github.woojiahao.style.FontFamily
import com.github.woojiahao.style.Style
import com.github.woojiahao.style.elements.lists.List
import com.github.woojiahao.utility.c

/**
 * This example uses the CSS DSL to create a customized style for the exported PDF.
 *
 * More on this DSL can be found [here.](https://woojiahao.github.io/kMD2PDF/#/customDSL)
 */
fun main() {
  val customStyle = createDSLStyle()
  val markdownDocument = MarkdownDocument("resources/markdown-all-in-one.md", customStyle)
  markdownDocument.toPDF()
}

fun createDSLStyle() = Style
    .createStyle(
        16.0,
        FontFamily("Roboto", "Lato")
    ) {
      p {
        textColor = c("455A64")
      }

      inlineCode {
        fontFamily {
          +"Fira Code"
        }
      }

      ul {
        listStyleType = List.ListStyleType.SQUARE
      }

      selector("tr:nth-child(even)") {
        "background-color" to "#f2f2f2"
      }
    }