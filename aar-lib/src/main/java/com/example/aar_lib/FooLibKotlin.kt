package com.example.aar_lib

class FooLibKotlin {
    fun foo(str: String): String {
        return when (str) {
            "1" -> {
                "1 block"
            }
            "2" -> {
                "2 block"
            }
            else -> {
                "Else block"
            }
        }
    }
}
