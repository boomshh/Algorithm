fun main() {
    val n = readln()
    
    println(problem(n))
}

fun problem(n: String): Int {
    var start = 0
    var end = n.length - 1
    
    while(start < end) {
        when {
            !Character.isLetterOrDigit(n[start]) -> start++
            !Character.isLetterOrDigit(n[end]) -> end--
            else -> {
                if(Character(n[start]) != Character(n[end])) {
                    return 0
                }
                start++
                end--
            }
        }
    }
    return 1
}