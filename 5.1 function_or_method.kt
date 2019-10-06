// Objective

// 1. Methods or Function in Kotlin

fun main(){
   addNumbers()         // hear i simply call the assNumbers Method or Function
   val multiplication = mul(3,5)
    println("multiplication is $multiplication")
}

fun addNumbers(): Unit{  // in Kotlin 'void' is replace with 'Unit' keyword. but you skip the 'Unite' keyword if function is nothing return
    val a: Int = 10
    val b: Int = 12
    println("Sum is ${a+b}")
}

fun mul(a: Int, b: Int): Int{  // here function is return the Integer value.
    return a*b
}
