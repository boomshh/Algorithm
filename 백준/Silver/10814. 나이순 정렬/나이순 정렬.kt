import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val tc = nextInt()
    var member = mutableListOf<Pair<Int,String>>()
    
    for(i in 1..tc) {
        member.add(Pair(nextInt(), next()))
    }
    
    val sortMem = member.sortedWith(compareBy{it.first})
    
    for(i in 0 until tc) {
        println("${sortMem[i].first} ${sortMem[i].second}")
    }
}
