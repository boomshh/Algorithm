class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0
        for(i in s1.indices) {
            if(s1[i] in s2) {
                answer += 1
            }
        }
            return answer
    }
}