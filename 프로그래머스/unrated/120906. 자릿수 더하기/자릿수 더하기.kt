class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        val a = n.toString()
        for(i in a.indices) {
            answer += a[i].toString().toInt()
        }
        return answer
    }
}