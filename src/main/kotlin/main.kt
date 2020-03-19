import kotlinx.html.a
import kotlinx.html.div
import kotlinx.html.dom.append
import kotlinx.html.h1
import kotlinx.html.p
import libs.sorted
import kotlin.browser.document

fun main() {
    console.log(sorted(arrayOf(1, 2, 3)))

    document.body?.append?.div {
        h1 {
            +"Welcome"
        }
        p {
            +"Fancy joining this year's "
            a("https://www.linkedin.com/showcase/sdc-lx") {
                target = "_blank"
                +"SDC:LX"
            }
        }
    }
    document.write("!!Hello, world!!!")
}