package com.demo.testreport

import org.junit.Assert
import org.junit.Test

class FooKotlinTest {

    @Test
    fun foo() {
        val test = FooKotlin()

        Assert.assertEquals("1 block", test.foo("1"))
        Assert.assertEquals("2 block", test.foo("2"))
        Assert.assertEquals("Else block", test.foo("3"))
    }
}
