fun main() {
    val n = readln().toInt()
    
    for (i in 1..n) {
        for (j in n downTo 1) {
            print(
            if (i >= j) "*"
            else " "
            )
        }
        println()
    }
}