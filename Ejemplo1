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


fun nnn(boxes: Array<Long>, unitsPerBox: Array<Long>, truckSize: Long): Long {
    var cont: Long 
    var sum: Long
    var max: Long = 0
    var cajasTotal: Long = 0
    
    for (i in 0..boxes.size - 1){
        cajasTotal += boxes[i]
    }
    
    if (cajasTotal >= truckSize){
    	for (i in 0..boxes.size - 1){
        	cont = unitsPerBox[i] * boxes[i]
        	sum = boxes[i]
        	for (j in 0..boxes.size - 1){
            	if (i !=j ){
            		for (k in 1..boxes[j] +1){
                		sum += k.toLong()
                		if (sum <= truckSize){
                    	cont += unitsPerBox[j] * k.toLong()
                		}
            		}
            	}
        	}
        	if (cont > max){
        		max = cont
        	}
    	}
    }else {
        cont = 0
        for (i in 0..boxes.size - 1){
            cont += unitsPerBox[i] * boxes[i]
        }
        max = cont
    }
    return max
}

fun main(){
    val truckSize: Long = 610563//6//3
    val boxes = arrayOf<Long>(4,6,5,2,7)//(3,1,6)//(1,2,3)
    val UnitPerBox = arrayOf<Long>(46335,90039,24796,87808,17739)//(2,7,4)//(3,2,1)
    
	val m = nnn(boxes, UnitPerBox, truckSize)
	println(m)
}
