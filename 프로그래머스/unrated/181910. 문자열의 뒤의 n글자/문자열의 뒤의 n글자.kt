class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        answer += my_string.substring(my_string.length - n)
        return answer
    }
}