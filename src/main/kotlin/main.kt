import libs.sorted
import kotlin.browser.document

fun main() {
    document.write("!!Hello, world!!!")
    console.log(":)")
    console.log(sorted(arrayOf(1,2,3)))
    console.log(sorted(arrayOf(3,1,2)))
}