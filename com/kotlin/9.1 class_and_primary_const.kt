package com.kotlin

import java.math.BigInteger

// Objective

// 1. class and Primary Constructor in Kotlin

fun main(){

    var employee = Employee("Peter")

}

class Employee(var name: String){
    init {        // to define field variable or Properties we use init{} Block
        println("Employee Name is $name")
    }
}


