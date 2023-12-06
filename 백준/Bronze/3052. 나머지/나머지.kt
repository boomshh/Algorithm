import java.util.Scanner

fun main() = with(Scanner(System.`in`)) { 
    var nums = ArrayList<Int>()
    
    for(i in 0 until 10) {
        val num = nextInt()
        if(!((num % 42) in nums)) {
            nums.add(num % 42)
        }
    }
    print(nums.size)
}