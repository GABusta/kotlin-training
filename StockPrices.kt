import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*


fun nnn(stockPrices: Array<Int>, k: Int): Int {
    var sum: Int = 0
    var total: Int = 0
    var max: Int
    var cont: Int
    val length = stockPrices.size
    
    for (i in 0..(length -k)) {
        sum = 0
        cont = i + 1
        max = stockPrices[i]
        while (cont < length && (stockPrices[cont] > max && sum < k-1)) {
            max = stockPrices[cont]
            cont ++
            sum ++
        }
        
    	if (sum == k-1){
            total ++
    	}
    }
    return total
    }

fun main(){
    val k: Int = 3
    val num = arrayOf<Int>(1,2,3,3,4,5)
	val m = nnn(num, k)
	println(m)
}
