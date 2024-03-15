fun main() {
    val a = readln().toInt()
    
    for(i in 1..a) {
        for(j in 1..i) {
            print("*")
        }
        println()
    }
}