import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val array = IntArray(8) {it + 1}

    val nums = mutableListOf<Int>()

    for(i in 0 until 8) {
        val n = nextInt()

        nums.add(n)

    }

    if(array.toList() == nums) {
        println("ascending")
    } else if (nums == array.toList().reversed()) {
        println("descending")
    } else println("mixed")




}