class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        if((a.toString() + b.toString()) < (b.toString() + a.toString())) {
            answer += (b.toString() + a.toString()).toInt()
        } else {
            answer += (a.toString() + b.toString()).toInt()
        }
        return answer
    }
}