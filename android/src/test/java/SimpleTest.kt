import org.junit.Assert
import org.junit.Ignore
import org.junit.Test
import org.test.demo.AndroidComponent
import org.test.demo.MyComponent

class SimpleTest {

    @Test
    fun testOk() {
        val myComponent = MyComponent("hello")
        myComponent.surname
        Assert.assertEquals(myComponent.name, AndroidComponent("hello").name)
    }
}