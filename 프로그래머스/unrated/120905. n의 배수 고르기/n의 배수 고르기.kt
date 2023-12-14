class Solution {
    fun solution(n: Int, numlist: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in numlist.indices) {
            if(numlist[i] % n == 0) {
                answer += numlist[i]
            }
        }
        return answer
    }
}