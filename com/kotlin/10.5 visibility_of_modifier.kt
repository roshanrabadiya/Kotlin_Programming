package com.kotlin

// Objective

// 1. Visibility of modifier(private, protected, internal, public) in Kotlin


fun main(){

    var indian = Indian()
    indian.test()

    println()
    val people = People()
    people.testing()
}

open class Person{
    private val a = 1
    protected val b = 2
    internal val c = 3
    val d = 4       // By Default public
}
class Indian: Person() {
    // Access the variable of Super Class

    fun test(){
        // private is not accessible by the the sub class
        //println(a)    // Error

        // only Accessible by Sub-Class
        println(b)

        // within a same Package protected is accessible
        println(c)

        // public ia Accessible every were
        println(d)
    }
}
// now Try to Access in Another Class
class People{
    fun testing(){

        var person = Person()
        // private is not accessible by the the other class
        //println(person.a)    // Error

        // only Accessible by Sub-Class.
        // println(b)   // Error

        // within a same Package protected is accessible to other Class of same Package
        println(person.c)

        // public ia Accessible every were
        println(person.d)
    }
}


