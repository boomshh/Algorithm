class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer: Int = 0
        val a = myString.lowercase()
        val b = pat.lowercase()
        if(a.contains(b)) {
            answer += 1
        } else answer += 0

        return answer
    }
}