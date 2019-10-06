// Objective

// 1. Function as Expression in Kotlin

fun main(){
    val maxValue = maxNum(8,18)
    println("Max value is $maxValue")

    val maxValue2 = maxNum2(12,8)
    println("Max value is $maxValue2")

    val maxValue3 = maxNum3(14,22)
    println("Max value is $maxValue3")
}

// This way you can return any value in Kotlin
fun maxNum(a: Int, b: Int): Int{
    return if (a>b)
                a
            else
                b
}
// Function as a Expression
fun maxNum2(a: Int, b: Int): Int = if (a>b) a else b

// suppose 'if' statement contains more number of block statements
fun maxNum3(a: Int, b: Int): Int
        = if (a>b){
                println("$a is Greater")
                a
            } else {
                println("$b is Greater")
                b
            }
