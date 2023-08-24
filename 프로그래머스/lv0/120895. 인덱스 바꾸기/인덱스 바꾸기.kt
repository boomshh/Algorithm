class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        val chars = my_string.toCharArray()
        val tmp = chars[num1]
        chars[num1] = chars[num2]
        chars[num2] = tmp
        return chars.concatToString()
    }

}