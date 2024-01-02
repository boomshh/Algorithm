fun main() {
    val word = readln()
    val words = arrayListOf<String>()

    for(i in word.indices) {
        words += word.substring(i, word.lastIndex + 1)
    }

    val result = words.sorted()

    println(result.joinToString("\n"))
}