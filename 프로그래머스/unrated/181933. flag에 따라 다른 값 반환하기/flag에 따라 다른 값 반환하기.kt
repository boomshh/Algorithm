class Solution {
    fun solution(a: Int, b: Int, flag: Boolean): Int {
        var answer: Int = 0
        if (flag) answer += a + b
        else answer += a - b
        return answer
    }
}

fun main() {
    val (a, b) = readln().split(' ').map{ it.toInt() }
    val flag = readln().toBoolean()
    
    val solution = Solution()
    
    println(solution.solution(a, b, flag))
}