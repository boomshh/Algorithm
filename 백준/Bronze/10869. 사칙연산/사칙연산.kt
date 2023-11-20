fun main(){
    val input = readLine() ?: ""
    val (a, b) = input.split(" ").map{ it.toInt()}
    
    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)
}