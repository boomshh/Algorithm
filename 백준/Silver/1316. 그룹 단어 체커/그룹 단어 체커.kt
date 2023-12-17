import java.util.Scanner

fun main() = with(Scanner(System.`in`)){
    val tc = readln().toInt()
    var count = 0

    for(i in 1..tc) {
        val word = next()

        for(j in word.indices) {
            if( j != word.length - 1) {
                if(word[j] == word[j + 1]) {
                    continue
                } else if (word[j] in word.substring(j + 1, word.length)) {
                    break
                }
            } else {
                count += 1
            }
        }
    }

    print(count)

}