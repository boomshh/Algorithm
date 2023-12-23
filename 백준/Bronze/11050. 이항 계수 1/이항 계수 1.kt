fun t3a (n : Int) : Long {
    return if(n == 0 || n == 1) {
        1
    } else {
        (2..n.toLong()).reduce { acc, l -> acc * l }
    }
}

fun main() {
    val (a, b) = readln().split(' ').map { it.toInt() }

    val c = t3a(a)
    val d = t3a(b)
    val e = t3a(a - b)

    println(c / (e * d))
}