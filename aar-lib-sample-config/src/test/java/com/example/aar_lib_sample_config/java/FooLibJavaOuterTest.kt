package com.example.aar_lib_sample_config.java

import com.example.aar_lib.FooLibJavaOuter
import org.junit.Assert
import org.junit.Test

class FooLibJavaOuterTest {

    @Test
    fun test_foo_1() {
        val test = FooLibJavaOuter()
        Assert.assertEquals("1 block", test.foo("1"))
        Assert.assertEquals("2 block", test.foo("2"))
        Assert.assertEquals("Else block", test.foo("3"))
    }
}
