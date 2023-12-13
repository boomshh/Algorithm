fun main() {
    var result = 0

    val input = readln().split(",")
        result += input.map { it.toString().toInt() }.sum()
    
    println(result)
}