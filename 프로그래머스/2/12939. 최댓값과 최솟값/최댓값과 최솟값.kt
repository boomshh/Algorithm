class Solution {
    fun solution(s: String): String {
        var answer = ""
        val number = s.split(" ").map { it.toInt() }
        val min = number.minOrNull()
        val max = number.maxOrNull()
        answer += "$min $max"
        return answer
    }
}

fun main() {
    val s = readln()
    val a = Solution()
    println(a.solution(s))

}