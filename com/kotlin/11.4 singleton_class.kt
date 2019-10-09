package com.kotlin

// Objective

// 1. Singleton class in Kotlin

// you can not create the Object of Singleton class. Kotlin crete manually.

fun main(){

    // call the properties and function of Singleton class
    CreateUser.id = 22
    println(CreateUser.id)
    println(CreateUser.getName())
    CreateUser.getDetail()
}
open class CustomerDetail{
    open fun getDetail(){
        println("Getting Customer Detail")
    }
}
object CreateUser: CustomerDetail(){

    var id: Int = -1        // Here variable Act as static variable

    fun getName() : String{     // Here Function Act as static function
        return "peter"
    }

    override fun getDetail() {      // override the parent class function. and it also Act as Static function
        println("call the Detail of Customer")
        super.getDetail()
    }
}
