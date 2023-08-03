class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        for(i in my_string) {
            when {
                i.isUpperCase() -> answer += i.lowercase()
                i.isLowerCase() -> answer += i.uppercase()
                else -> answer += i
            }
        }
        return answer
    }
}