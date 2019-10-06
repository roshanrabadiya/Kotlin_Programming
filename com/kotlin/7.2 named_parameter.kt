@file:JvmName("MyCustomKotlinFileName")  // here JVM get the Custom Kotlin File Name
package com.kotlin

// Objective

// 1. Named Parameters in Kotlin. There is no interoperability of Named Parameters in java

fun main(){
    findVolume(length = 10, breadth = 20, height = 2)  // hear i pass the value with parameter name

    println()
    // if you change the sequence of parameter then it will give the same output
    findVolume(breadth = 20, height = 2, length = 10)

    println()
    // if there is default argument
    findVolume(breadth = 20, length = 10)
}
fun findVolume(length: Int,breadth: Int,height: Int = 10){
    println("Length is $length")
    println("Breadth is $breadth")
    println("Height is $height")
}

