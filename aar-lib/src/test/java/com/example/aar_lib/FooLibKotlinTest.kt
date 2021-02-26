package com.example.aar_lib

import org.junit.Assert
import org.junit.Test

class FooLibKotlinTest {

    @Test
    fun foo() {
        val test = FooLibKotlin()

        Assert.assertEquals("1 block", test.foo("1"))
        Assert.assertEquals("2 block", test.foo("2"))
        Assert.assertEquals("Else block", test.foo("3"))
    }
}
