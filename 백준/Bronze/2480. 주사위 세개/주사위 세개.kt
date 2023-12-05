fun main() {
    val (a, b, c) = readln().split(' ').map { it.toInt() }
    val list = listOf(a, b, c)
    var first = 0
    var second = 0
    var third = 0

    if((a == b) && (b == c) ) {
        first += 10000 + a * 1000
        println(first)
    } else if ((a == b) && (b != c)) {
        second += 1000 + a * 100
        print(second)
    } else if ((a != b) && (b == c)) {
        second += 1000 + b * 100
        print(second)

    } else if ((a == c) && (b != c)) {
        second += 1000 + c * 100
        print(second)

    } else {
        third += list.max() * 100
        print(third)
    }
}