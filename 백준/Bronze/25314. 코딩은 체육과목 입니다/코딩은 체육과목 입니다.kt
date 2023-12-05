fun main() {
    val n = readln().toInt()
    
    for(i in 1..n) {
        if(i % 4 == 0) {
            print("long ")
        }
    }
    print("int")
}