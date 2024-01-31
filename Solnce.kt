import kotlin.math.pow

fun main(){
var num1 = readLine()!!.toDouble()
var num2 = readLine()!!.toDouble()

when {
    (num1 > num2)->num1 = (num1 + 1)
    (num2 == num1)->num1.pow(3 )
}
    println(num2)
    println(num1)
}
