fun reverse(nums: IntArray, start: Int, end: Int) {
    var left = start
    var right = end
    while(left < right) {
        val temp = nums[left]
        nums[left] = nums[right]
        nums[right] = temp
        left++
        right--
    }
}

fun main(){
    val (a, b) = readln().split(" ").map{it.toInt()}
    var nums = IntArray(a){it + 1}
    
    for(i in 1..b){
        val (i, j) = readln().split(" ").map{it.toInt()}
        
        reverse(nums, i - 1, j - 1)
        
    }
    println(nums.joinToString(" "))
}