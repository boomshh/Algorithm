fun main() {
    val (a, b) = readln().split(" ").map{it.toInt()}
    val name1 = HashSet<String>()
    val name2 = HashSet<String>()
    
    for(i in 1..a) {
        name1.add(readln())
    }
    
    for(i in 1..b) {
        val c = readln()
        if(name1.contains(c)) {
            name2.add(c)
        }
    }
    println(name2.size)
    name2.sorted().forEach{ println(it) }
}