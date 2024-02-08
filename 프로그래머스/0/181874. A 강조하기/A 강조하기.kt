class Solution {
    fun solution(myString: String): String {
        var answer: String = ""
        val a = myString.lowercase()
        for(i in a.indices) {
            if(a[i] == 'a') {
                answer += a[i].uppercaseChar()
            } else {
                answer += a[i]
            }
        }
        return answer
    }
}