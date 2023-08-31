class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0
        
        for ( i in s1) {
            for ( k in s2) {
                
                if(i==k) {
                    answer ++
                }
            }
        }
        
        return answer
    }
}