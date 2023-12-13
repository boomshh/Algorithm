import java.lang.StringBuilder

class Solution {
    fun solution(my_string: String, n: Int): String {
        val result = StringBuilder()
        for(char in my_string) {
            result.append(char.toString().repeat(n))
        }
        return result.toString()
    }
}