fun main() {
    val a = readln().toInt()
    val b = readln()
    
    for(i in 2 downTo 0) {
        println(a * b[i].digitToInt())
    }
    println(a * b.toInt())
} 