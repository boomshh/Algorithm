fun main() {
    val word = readln()

    val tc = readln().toInt()

    var count = 0

    for(i in 0 until tc) {
        val words = readln()
        val w = words + words

        if(w.contains(word)) {
            count += 1
        }
    }

    println(count)
}