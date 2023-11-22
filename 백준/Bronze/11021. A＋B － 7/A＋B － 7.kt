fun main() {
    val tc = readln().toInt()
    for (i in 1..tc) {
        val (a, b) = readln().split(" ").map{it.toInt()}
        
        println("Case #${i}: ${a + b}")
    }
}