import org.w3c.dom.HTMLInputElement
import org.w3c.dom.get
import kotlin.browser.document
import kotlin.test.Test
import kotlin.test.assertNotNull

class AppTest {

    @Test
    fun thingsShouldWork() {
        console.log(document.body?.innerHTML)
        assertNotNull((document.getElementsByName("email")[0] as HTMLInputElement))
    }
}