import java.util.Scanner

class Solution {
    fun solution(num: Int, n: Int): Int {
        var answer: Int = 0
        
        if(num % n == 0) {
            answer++
        } else {
            return 0
        }
        return answer
    }
}

fun main() = with(Scanner(System.`in`)) {
    val num = nextInt()
    val n = nextInt()
    
    val solution = Solution()
    
    println(solution.solution(num, n))
}
