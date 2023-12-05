fun main(){
    val a = readln().toInt()
    val tc = readln().toInt()
    var sum = 0
    
    for(i in 1..tc) {
        var (b, c) = readln().split(" ").map{ it.toInt() }
        sum += b * c
    }
    
    if(a == sum) println("Yes")
    else println("No")
}