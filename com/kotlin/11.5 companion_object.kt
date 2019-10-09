package com.kotlin

// Objective

// 1. Companion object in Kotlin


fun main(){

    MyClass.id = 22
    println(MyClass.id)
    MyClass.getName()
    
}
class MyClass{
    companion object CreateUser{ // here i use the keyword 'companion' 

        var id: Int = -1        // Here variable like static variable

        fun getName() : String{     // Here Function like static function
            return "peter"
        }
    }
}

