// Objective

// 1. Data Type in Kotlin

// In Kotlin there is No Primitive Data type. Every variable is Objects
fun main(args: Array<String>){

    var myStr : String      // This is a String Data Type
    myStr = "Hello"
    var myStr2: String = "Hello"    // you can also define variable this way
    var myStr3 = "Hello"    // you can also define variable this way

    var myChar : Char = 'C'     // This is Char Data type. hear you use single('') quote not Double("")
    var myInt : Int = 10    // This is a Integer Data Type
    var isAlive : Boolean = true    // This is a Boolean Data Type
    var myFloat : Float = 99.5F     // This is a Float Data Type
    var myLong : Long = 12345734L   // This is a Long Data Type
    var myDouble : Double = 99.99999    // This is a Double Data Type. Here You can't Use Suffix after the value

    print(myDouble)
}
