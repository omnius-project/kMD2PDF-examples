package com.github.woojiahao

import com.github.woojiahao.utility.document

fun main() {
  val converter = markdownConverter {
    document(document)

    style {
      header {
        left {
          +"Test left header"
        }

        center {
          pageNumber("Page ")
        }

        right {
          +"Test right header"
        }
      }

      footer {
        left {
          +"Test left footer"
        }

        center {
          +"Test center footer"
        }

        right {
          +"Test right footer"
        }
      }
    }
  }

  converter.convert()
}