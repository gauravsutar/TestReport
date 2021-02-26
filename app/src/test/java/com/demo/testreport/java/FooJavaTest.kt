package com.demo.testreport.java

import com.demo.testreport.FooJava
import org.junit.Assert
import org.junit.Test

class FooJavaTest {

    @Test
    fun test_foo_1(){
        val test = FooJava()
        Assert.assertEquals("1 block",test.foo("1"))
    }
}
