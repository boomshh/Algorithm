fun main() {
    val a = readln().toString()
    val map = mutableMapOf<Char, Int>()

    a.forEach {
        val char = it.lowercaseChar()
        if(map.containsKey(char)) {
            map[char] = map[char]!!.plus(1)
        } else {
            map[char] = 1
        }
    }

    val max = map.maxByOrNull { it.value }
    if(map.filter { it.value == max!!.value }.count() > 1) {
        print("?")
    } else {
        print(max!!.key.uppercase())
    }
}