package com.example.aar_lib_sample_config

import com.example.aar_lib.FooLibKotlinOuter
import org.junit.Assert
import org.junit.Test

class FooLibKotlinOuterTest {

    @Test
    fun foo() {
        val test = FooLibKotlinOuter()
        Assert.assertEquals("1 block", test.foo("1"))
        Assert.assertEquals("2 block", test.foo("2"))
        Assert.assertEquals("Else block", test.foo("3"))
    }
}
