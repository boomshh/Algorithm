fun main() {
    val n = readln().toInt()
    
    for (i in 1..n) {
        for (j in 1 until i) {
            print(" ")
        }
        
        for (k in i..n){
            print("*")
        }
        println()
    }
}