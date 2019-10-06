@file:JvmName("MyCustomKotlinFileName")  // here JVM get the Custom Kotlin File Name
package com.kotlin

// Objective

// 1. Default Arguments in Function. also interoperability Kotlin to java

fun main(){
    // here you can also pass two parameters in function because in function height value is default as 10.
    println("Volume is ${findVolume(2,5)}")   // output:  2 * 5 * 10 = 100

    //here you can pass the 3rd parameter and compiler gives more priority to passing the value
    val volume = findVolume(3,4,20)
    println("Volume is $volume")    // output: 3 * 4 * 20 = 240
}
// Default Arguments in Function
@JvmOverloads       // for support to java file we write Annotation in Kotlin
fun findVolume(length: Int,breadth: Int,height: Int = 10): Int{
    return length * breadth * height
}

