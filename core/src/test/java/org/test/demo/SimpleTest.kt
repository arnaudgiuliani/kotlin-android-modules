package org.test.demo

import org.junit.Assert
import org.junit.Assert.fail
import org.junit.Ignore
import org.junit.Test

class SimpleTest {

    @Test
    fun successTest() {
        val myComponent = MyComponent("hello")
        myComponent.surname
        Assert.assertEquals("hello", myComponent.name)
    }

    @Test
    fun failedTest() {
//        fail("test is failing")
    }
}