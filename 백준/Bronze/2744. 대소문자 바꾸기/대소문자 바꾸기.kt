import java.lang.StringBuilder

fun main() {
    val str = readln()
    val result = StringBuilder()

    for(char in str) {
        if(char.isUpperCase()) {
            result.append(char.lowercase())
        } else {
            result.append(char.uppercase())
        }
    }

    println(result)
}