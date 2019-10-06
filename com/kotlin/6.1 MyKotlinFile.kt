@file:JvmName("MyCustomKotlinFileName")  // here JVM get the Custom Kotlin File Name
package com.kotlin
import com.java.MyJavaClass

// Objective

// 1. interoperability in Kotlin as well as java
// it works within the same Application.
// using '.class' file you can use the java class file

fun main(){
    val myClass = MyJavaClass.area(10,20)   // hear i call the MyJavaClass
    println("Printing sum from the Kotlin File: $myClass")

}
fun add(a: Int,b: Int): Int{
    return a + b
}

/*  Compiler converts my_first_file as My_first_fileKt.class file

class My_first_fileKt{
    public static void main(String[] args){

    }

    public static int add(int a, int b){
        return a + b;
    }
}

 */
