import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() =with(BufferedReader(InputStreamReader(System.`in`))){
    val a = Integer.parseInt(readLine())
    val nums = ArrayList<Int>(a)
    val sb = StringBuilder()
    val bw = System.out.bufferedWriter()

    for(i in 1..a){
        nums.add(Integer.parseInt(readLine()))
    }
    nums.sort()

    sb.append(nums.joinToString("\n"))
    bw.write(sb.toString())
    bw.close()


}