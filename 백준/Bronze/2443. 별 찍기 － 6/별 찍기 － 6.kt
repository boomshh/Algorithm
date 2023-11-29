fun main() {
    val n = readln().toInt()
    
    for (i in n downTo 1) {
        for (k in 0 until n - i) {
            print(" ")
        }
        for (k in 0 until (i - 1) * 2 + 1) {
            print("*")
        }
        println()
    }
}