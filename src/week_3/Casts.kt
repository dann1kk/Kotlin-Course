package week_3

fun main(args: Array<String>) {
    val s = ""
    println(s as? Int)    // null
    println(s as Int?)    // exception
}