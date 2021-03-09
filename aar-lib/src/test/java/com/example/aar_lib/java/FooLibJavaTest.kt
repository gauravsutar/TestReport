package com.example.aar_lib.java

import com.example.aar_lib.FooLibJava
import org.junit.Assert
import org.junit.Test

class FooLibJavaTest {

    @Test
    fun test_foo_1() {
        val test = FooLibJava()
        Assert.assertEquals("1 block", test.foo("1"))
        Assert.assertEquals("2 block", test.foo("2"))
        Assert.assertEquals("Else block", test.foo("3"))
    }
}
