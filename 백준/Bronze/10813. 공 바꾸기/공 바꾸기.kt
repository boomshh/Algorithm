fun main() {
    val (n, m) = readln().split(" ").map{ it.toInt() }
    var nums = IntArray(n) { it + 1}
    
    for(i in 1..m) {
        val(i, j) = readln().split(" ").map{ it.toInt()}
        
        val temp = nums[i - 1]
        nums[i - 1] = nums[j - 1]
        nums[j - 1] = temp
    }
    
    println(nums.joinToString(" "))
}