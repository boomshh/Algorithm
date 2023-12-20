fun main() {
    val pay = readln().toInt()

    val a = 1000 - pay

    val result = (a / 500) + (a % 500 / 100) + (a % 500 % 100 / 50) + (a % 500 % 100 % 50 / 10 ) + (a % 500 % 100 % 50 % 10 / 5) + (a % 500 % 100 % 50 % 10 % 5 )

    println(result)
}