package com.kotlin

// Objective

// 1. Primary Constructor Inheritance in Kotlin


fun main(){

   var dog = Dog("Black","Pug")

}


open class Animal(var color: String){      // Super Class

    init {
        println("From Animal Init: $color")
    }
}


class Dog(color: String, var bread: String): Animal(color){       // Derived Class

    init {
        println("From Dog Init: $color and $bread")
    }

}



