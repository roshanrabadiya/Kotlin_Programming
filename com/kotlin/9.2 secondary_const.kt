package com.kotlin

// Objective

// 1. Secondary Constructor in Kotlin

fun main(){

    var employee = Employee("Peter",23)
    println("Employee ID is ${employee.id}")

}

class Employee(name: String){
    var id: Int = 1
    init {
        // here id gets the Default value of id
        println("Employee Name is $name")
    }

    constructor(n: String, id: Int): this(n){
        // The body of the secondary constructor is called after the init block 
        this.id = id
    }
}


