import java.util.Scanner

fun main() = with(Scanner(System.`in`)) { 
    var nums = IntArray(30) {it + 1}.toMutableList()
    
    for(i in 0 until 28) {
        val a = nextInt()
        if(a in nums) {
            nums.remove(a)
        }
    }
    println("${nums[0]}")
    println("${nums[1]}")

}