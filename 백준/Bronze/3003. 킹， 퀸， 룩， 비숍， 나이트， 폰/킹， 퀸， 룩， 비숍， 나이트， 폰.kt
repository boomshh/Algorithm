fun main() {
    val n = readln().split(" ").map{it.toInt()}
    var nums = arrayOf(1,1,2,2,2,8)
    
    val result = nums.mapIndexed{ index, i ->
                                i - n[index]}
    
    println(result.joinToString(" "))
}