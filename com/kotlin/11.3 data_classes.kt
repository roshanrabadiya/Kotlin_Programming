package com.kotlin

// Objective

// 1. Data Classes in Kotlin

fun main(){
    //compare the objects
    val user1 = User("peter",20)
    val user2 = User("peter",20)

    if (user1 == user2)
        println("Equal")    // if you can declare class as 'data' format it compare only the 'data'
    else
        println("Not Equal")  // if you can not declare class as 'data' format it simply compare the 'object' not 'data'

    println(user1.toString()) // here without data keyword it print the memory location of that object.

    // copy the objects
    val user3 = user1.copy()
    println(user3)

    // here you can change the parameter
    val user4 = user1.copy(id = 26)
    println(user4)
}
// in data class in primary constructor is a properties not the parameter
data class User(var name:String,var id:Int){

}
