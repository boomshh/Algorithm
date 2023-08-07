fun main(args: Array<String>) {
    val s1 = readLine()!!
    val convertedStr = StringBuilder()

    for (char in s1) {
        convertedStr.append(when {
            char.isLowerCase() -> char.toUpperCase()
            char.isUpperCase() -> char.toLowerCase()
            else -> char
        })
    }
    println("$convertedStr")
}
