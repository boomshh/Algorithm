    fun solution(n: Int): String {
        val a = n.toString()
        var start = 0
        var end = a.length - 1

        while(start < end) {
            when {
                !Character.isLetterOrDigit(a[start]) -> start++
                !Character.isLetterOrDigit(a[end]) -> end--
                else -> {
                    if (a[start] != a[end]) {
                        return "no"

                    }
                    start++
                    end--
                }
            }
        }
        return "yes"
    }

    fun main() {
       while(true) {
           val input = readln().toInt()
           if(input == 0) {
               break
           }
           println(solution(input))
       }
    }
