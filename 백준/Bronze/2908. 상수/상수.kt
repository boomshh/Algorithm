fun main() {
    val (a, b) = readln().split(" ")

    if((a.reversed()) > (b.reversed())) {
        print(a.reversed())
    } else print(b.reversed())

}