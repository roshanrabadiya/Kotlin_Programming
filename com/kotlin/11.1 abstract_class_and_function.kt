package com.kotlin

// Objective

// 1. Abstract in Kotlin

fun main(){

    // can not create the object of abstract class
    //val person = Person()       // Error
    var indian = Indian()
    indian.name = "Peter"
    indian.eat()
}

abstract class Person{

    abstract var name: String
    abstract fun eat()         // abstract properties are "open" by default
    open fun getDetail(){}     // A "open" function ready to override
    fun goToSchool(){}         // A Normal Function: public and final by default
}
class Indian: Person() {
    override var name: String = "dummy_name"     // here you compulsory override the variable

    override fun eat() {                         // here you compulsory override function
        println("This is abstract function")
    }
}
