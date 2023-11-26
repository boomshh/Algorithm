fun main() {
    val n = readln().toInt()
    for (i in 1..n) {
        for (j in i..n) {
            print("*")
        }
        println(" ")
    }
}