fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    
    val array = IntArray(10)
    var mul = a * b * c
    
    while(mul > 0) {
        array[mul % 10]++
        mul /= 10
    }
    
    for(i in 0 until 10) {
        println(array[i])
    }
}