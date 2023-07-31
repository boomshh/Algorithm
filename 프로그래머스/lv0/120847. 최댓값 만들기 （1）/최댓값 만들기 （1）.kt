class Solution {
    fun solution(numbers: IntArray): Int {
        val rsp = numbers.sorted()
        val a = rsp.last() 
        val b = rsp[rsp.size - 2]
        
        return a * b
    }
}