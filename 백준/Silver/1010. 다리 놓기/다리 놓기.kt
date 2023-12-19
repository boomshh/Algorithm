import java.lang.StringBuilder

fun main() {
    val sb = StringBuilder()

    val tc = readln().toInt()

    for(i in 1..tc) {
        val (n, m) = readln().split(' ').map { it.toInt() }

        var result = 1L

        for(i in 1..n) result = result * (m - i + 1) / i

        sb.append(result).append("\n")

    }
    println(sb)


}