fun main() {
    val word = readln()

    val array = IntArray(26){-1}

    for(i in word.indices) {
        val char = word[i] - 'a'
        if(array[char] == -1) {
            array[char] = i
        }
    }

    println(array.joinToString(" "))
}