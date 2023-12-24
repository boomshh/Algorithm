fun main() {
    var case = 1
    while(true) {
        val (l, p , v) = readln().split(" ").map { it.toInt() }

        if(l == 0 && p == 0 && v == 0) break

        val days = (v / p) * l + if(v % p <= l) v % p else l

        println("Case $case: $days")
        case++
    }
}