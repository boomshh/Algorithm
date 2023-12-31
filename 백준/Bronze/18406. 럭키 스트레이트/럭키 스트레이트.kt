fun main() {
    val number = readln()

    val a = number.take(number.length / 2)
    val b = number.drop(number.length / 2)

    var an = 0
    var bn = 0

    for(i in a.indices) {
        an += a[i].toString().toInt()
    }

    for(i in b.indices) {
        bn += b[i].toString().toInt()
    }

    if(an == bn) {
        println("LUCKY")
    } else println("READY")
}