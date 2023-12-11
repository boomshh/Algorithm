fun main() {
    val words = Array(5) { readLine()!! }

    val maxLen = words.maxOf { it.length }

    val result = StringBuilder()
    for (i in 0 until maxLen) {
        for (j in 0 until 5) {
            if (i < words[j].length) {
                result.append(words[j][i])
            }
        }
    }

    println(result)
}