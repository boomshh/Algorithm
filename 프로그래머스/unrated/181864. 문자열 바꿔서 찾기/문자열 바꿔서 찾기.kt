class Solution {
    fun solution(myString: String, pat: String): Int {
        var answer: Int = 0
        val a = myString.map {
            when(it){
                'A' -> 'B'
                'B' -> 'A'
                else -> it
            }
        }.joinToString("")
        answer += if(a.contains(pat)) 1
        else 0
        return answer
    }
}