class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val a = num_list.sorted()
        answer += a.take(5)

        return answer
    }
}