class Solution {
    fun solution(n_str: String): String {
        var answer: String = ""
        answer += n_str.dropWhile { it == '0' }
        return answer
    }
}