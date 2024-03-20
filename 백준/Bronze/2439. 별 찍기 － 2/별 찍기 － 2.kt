fun main() {
    val tc = readln().toInt()

    for(i in 1..tc) {
        for(j in tc downTo 1) {
            print(if(i >= j) "*"
            else " "
            )
        }
        println()
    }
}