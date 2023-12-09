class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in n..num_list.size) {
            answer += num_list[i - 1]
        }
        return answer
    }
}