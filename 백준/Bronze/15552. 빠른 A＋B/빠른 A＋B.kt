import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for(i in 1..n) {
        val (a, b) = br.readLine().split(" ").map { it.toInt() }
        val result = a + b
        bw.write("$result\n")
    }
    bw.flush()
    bw.close()

}