class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val b = num_list.drop(num_list.lastIndex - 1)
        if(b[0] < b[1]) {
            answer += num_list + (b[1] - b[0])
        } else {
            answer += num_list + (b[1] * 2)
        }
        return answer
    }
}
