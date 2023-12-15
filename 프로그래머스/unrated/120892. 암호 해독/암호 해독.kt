class Solution {
    fun solution(cipher: String, code: Int): String {
        var answer: String = ""
        for(i in code - 1..cipher.lastIndex step code) {
            answer += cipher[i]
        }
        return answer
    }
}