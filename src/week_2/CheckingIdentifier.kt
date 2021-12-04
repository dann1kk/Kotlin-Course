package week_2

fun isValidIdentifier(s: String): Boolean {
    fun validCharacter(ch: Char) = ch.isLetterOrDigit() || ch == '_'

    if(s.isEmpty() || s[0].isDigit() ) {
        return false
    }

    for(ch in s){
        if(!validCharacter(ch)) return false
    }

    return true

}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}