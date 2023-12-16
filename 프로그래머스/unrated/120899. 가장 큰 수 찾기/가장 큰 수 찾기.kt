class Solution {
    fun solution(array: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val a = array.maxOrNull()
        val b = array.indexOf(a!!)
        answer += a
        answer += b 
        return answer
    }
}