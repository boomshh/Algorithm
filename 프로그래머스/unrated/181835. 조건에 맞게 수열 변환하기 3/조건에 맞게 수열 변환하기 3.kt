class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        if(k % 2 == 1) {
            answer += arr.map { it * k}
        } else answer += arr.map { it + k }
        return answer
    }
}