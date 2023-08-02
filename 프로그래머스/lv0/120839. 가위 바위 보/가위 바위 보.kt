class Solution {
    fun solution(rsp: String) = rsp.split("").joinToString("") {
        when (it) {
            "2" -> "0"
            "0" -> "5"
            "5" -> "2"
            else -> ""
        }
    }
        
}