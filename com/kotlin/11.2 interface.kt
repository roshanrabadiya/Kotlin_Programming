package com.kotlin

// Objective

// 1. Interface in Kotlin
// Interface is not a class it's a some like Listener

fun main(){

   // val myListener = MyListener()  // you can not create the object of interface

    val myButton = MyButton()
    myButton.onClick()
    myButton.onTouch()

    println()
    val mySecondButton = MySecondButton()
    mySecondButton.onClick()
    mySecondButton.onTouch()
}
// In kotlin interface contains abstract and non-abstract function
interface MyListener{   // Interface all properties and function is 'open' not 'final'

    var name:String         // This variable is abstract it should not initialize

    fun onTouch()          //  This function is abstract and by default 'open' , 'public' & 'abstract' not 'final'

    fun onClick(){         // This is normal function
        println("interface button clicked")
    }
}
interface MySecondListener{   // Interface all properties and function is 'open' not 'final'

    fun onTouch(){  // this is normal function
        println("second lister button was touched")
    }

    fun onClick(){         // This is normal function
        println("interface button clicked")
    }
}
// implement one interface
class MyButton : MyListener {
    override var name: String = "dummy name"        // you should compulsory override the interface variable

    override fun onTouch() {    // you should compulsory override the interface function because it is abstract function
        println("Button was Touched")
    }

    override fun onClick() {
        super.onClick()         // here you call the interface function
        println("MyButton was clicked")
    }
}
// implement two interface to the class
class MySecondButton : MyListener,MySecondListener{
    override var name: String = ""

    override fun onTouch() {
        super.onTouch()
        println("My second class Button was Touch")
    }

    // you should compulsory override the onClick function. even it is not abstract in nature
    override fun onClick() {
        // here you can call only one or both the interface function call as like below
        super<MyListener>.onClick()
        super<MySecondListener>.onClick()
    }

}
