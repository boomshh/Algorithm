fun main() {
    val tc = readLine()!!.toInt()

    for(i in 1..tc) {
        val (a, b) = readln().split(' ').map { it.toInt() }

        val sum = a + b
        println("Case #$i: $a + $b = $sum")
    }
}