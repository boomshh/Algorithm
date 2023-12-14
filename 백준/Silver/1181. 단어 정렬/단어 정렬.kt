fun main() {
    val tc = readln().toInt()
    val ab = mutableListOf<String>()

    for(i in 1..tc) {
        val a = readln()
        ab.add(a)

    }
    val result1 = ab.distinct().sorted()
    val result2 = result1.sortedBy { it.length }

    println(result2.joinToString("\n"))
}