package com.kotlin

// Objective

// 1. Inheritance in Kotlin
//      1. Single Inheritance
//      2. Multilevel Inheritance
//      3. Hierarchical Inheritance

fun main(){

    val dog = Dog()
    dog.color = "Black"
    dog.bread = "Labrador"
    println(dog.color)
    println(dog.bread)
    dog.eat()
    dog.bark()

    println()
    val cat = Cat()
    cat.color = "white"
    cat.age = 3
    println(cat.color)
    println(cat.age)
    cat.meow()
    cat.eat()

    println()
    //Default value of Animal Class
    val animal = Animal()
    animal.color = "Grey"
    println(animal.color)
    animal.eat()
}

// By Default in Kotlin All class and Properties are public final in nature so remove the 'final' we use the keyword 'open'
open class Animal{
    var color: String = ""

    fun eat(){
        println("Eat!")
    }
}

class Dog: Animal(){
    var bread: String = ""

    fun bark(){
        println("Bark!")
    }
}

class Cat: Animal(){

    var age: Int = -1

    fun meow(){
        println("Meow!")
    }
}

