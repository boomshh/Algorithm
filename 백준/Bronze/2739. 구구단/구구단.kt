fun main() {
    val num = readln().toInt()

    for(i in 1..9) {
        val result = num * i
        println("$num * $i = $result")
    }
}