package week_4

open class NPEduringinit(open val value: String) {
    init {
        value.length
    }
}

class B(override val value: String) : NPEduringinit(value)

fun main(args: Array<String>) {
    B("a")
}