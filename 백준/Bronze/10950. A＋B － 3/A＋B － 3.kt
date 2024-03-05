fun main() {

    val tc = readln().toInt()

    for(i in 1..tc) {
        val (a, b) = readln().split(' ').map { it.toInt() }

        val sum = a + b
        println(sum)
    }

}