package week_3

fun String.isNice(): Boolean {
    val doesntContainForbiddenSubstring = listOf("bu", "ba", "be").none {this.contains(it)}

    val containsThreeVowels = count{it in "aeiou"} >=3

    val consecutiveDoubleLetter: Boolean = zipWithNext().any { pair: Pair<Char, Char> -> pair.first == pair.second};

    return if (doesntContainForbiddenSubstring && containsThreeVowels){
        true
    } else if (doesntContainForbiddenSubstring && consecutiveDoubleLetter){
        true
    } else containsThreeVowels && consecutiveDoubleLetter

}