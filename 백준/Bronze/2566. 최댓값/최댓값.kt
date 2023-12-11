import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val nums = Array(9) {IntArray(9)}
    var max = 0
    var x = 0
    var y = 0
    
    for (i in 0 until 9) {
        for(j in 0 until 9) {
            nums[i][j] += nextInt()
            if(nums[i][j] > max) {
                max = nums[i][j]
                x = i
                y = j
            }
        }
    }
    println(max)
    println("${x + 1} ${y + 1}")
}