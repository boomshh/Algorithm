fun main() {
    val n = readln().toInt()
    val nums = IntArray(n + 1)
    
    for(i in nums.indices) {
        when(i) {
            0 -> nums[0] = 0
            1 -> nums[1] = 1
            else -> nums[i] = nums[i - 1] + nums[i - 2]
        }
    }
    println(nums[n])
}