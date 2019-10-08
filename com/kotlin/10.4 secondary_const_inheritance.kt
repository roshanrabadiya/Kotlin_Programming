package com.kotlin

// Objective

// 1. Secondary Constructor Inheritance in Kotlin


fun main(){

   var dog = Dog("Black","Pug")

}


open class Animal{      // Super Class
    
    var color: String = ""
    constructor(color: String){
        this.color = color
        println("From Animal: $color")
    }
}


class Dog: Animal{       // Derived Class
    
    var bread: String = ""
    constructor(color: String,  bread: String): super(color){
        this.bread = bread
        println("From Dog: $color and $bread")
    }
}



