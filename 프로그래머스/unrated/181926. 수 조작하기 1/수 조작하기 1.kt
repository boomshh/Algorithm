class Solution {
    fun solution(n: Int, control: String): Int {
        var answer = n
        for(command in control) {
            when(command) {
                'w' -> answer += 1
                's' -> answer -= 1
                'd' -> answer += 10
                'a' -> answer -= 10
                else -> n
            }
        }
        return answer
    }
}