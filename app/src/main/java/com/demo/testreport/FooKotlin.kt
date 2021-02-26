package com.demo.testreport

class FooKotlin {
    fun foo(str: String): String {
        return if (str == "1") {
            "1 block"
        } else if (str == "2") {
            "2 block"
        } else {
            "Else block"
        }
    }
}
