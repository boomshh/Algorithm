class Solution {
    fun solution(s: String): String {
        var answer = ""
        val b = s.lowercase()
        val a = Regex("\\b\\w")
        answer += a.replace(b) {it.value.uppercase()}
        return answer
    }
}

fun main() {
    val a = readln()

    val s = Solution()

    println(s.solution(a))
}