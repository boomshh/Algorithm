fun main() {
    val (x, y) = readln().split(" ")

    val sum = x.reversed().toInt() + y.reversed().toInt()
    val result = sum.toString().reversed()

    println(result.toInt())
}