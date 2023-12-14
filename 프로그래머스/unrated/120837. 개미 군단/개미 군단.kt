class Solution {
    fun solution(hp: Int): Int {
        var answer: Int = 0
        val a = 5
        val b = 3
        val c = 1
        answer += hp / 5 + (hp % 5 / 3) + (hp % 5 % 3)
        return answer
    }
}