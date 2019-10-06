package com.kotlin

// Objective

// 1. Extension Function

fun main(){

    // Example 1:
    val str1: String = "Hello "
    val str2: String = "Friends"
    val str3: String = "Hey, "

    println(str3.add(str1, str2))

    // Example 2:
    val a: Int = 10
    val b: Int = 20

    val maxNum = a.findMax(b)
    println(maxNum)

}
// here we can define function in Pre Define Class like 'String'
fun String.add(s1: String,s2: String): String{
    return this + s1 + s2
}
fun Int.findMax(other: Int): Int{
    return if(this > other)
        this
    else
        other
}

