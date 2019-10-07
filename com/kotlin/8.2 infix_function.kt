package com.kotlin

// Objective

// 1. infix Function in kotlin

fun main(){
    
    val a: Int = 10
    val b: Int = 20

    val maxNum = a.findMax(b)
    val maxNum2 = a findMax b   // using infix function you can make syntax more Readable 
    println(maxNum2)

}

infix fun Int.findMax(other: Int): Int{     // This is Infix Function
    return if(this > other)
        this
    else
        other
}

/* 1. All infix Function are Extension Function
    but all Extension function are not infix
   
   2. Infix function only ONE Parameter. 
 */
