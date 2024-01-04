fun main() {
    val n = readln().toInt()
    
    var rooms = 1
    var result = 1
    
    if(n == 1) {
        println(result)
    } else {
        while(rooms < n) {
            rooms += result * 6
            result++ 
        }
        println(result)
    }
}