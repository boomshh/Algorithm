class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        val a = my_string.replace(Regex("[^0-9]"), "")
        answer += a.map { it.toString().toInt() }.sum()
        return answer
    }
}