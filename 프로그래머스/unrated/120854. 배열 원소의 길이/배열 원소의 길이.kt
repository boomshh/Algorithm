class Solution {
    fun solution(strlist: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        val a = strlist.map { it.length }
        answer += a
        return answer
    }
}