
fun main(args: Array<String>){

    var myString = "Hello Friends"   // This is String Variable
    println(myString)

    var myNumber = 10   // This is Integer Variable
    println(myNumber)

    var myDecimal = 10.0  // This is Decimal(Float) Variable
    println(myDecimal)

    // This is Mutable String. you change the value of string
    var myName: String    // This is Variable Declaration
    myName = "peter"      // Assign the value to the variable
    myName = "parker"     // Edit The String
    println(myName)

    // This is Imutable String. you can Not change the value of string
    val myAnotherName: String
    myAnotherName = "Google"
//  myAnotherName = "yahoo"   // hear compiler gives Error

}
