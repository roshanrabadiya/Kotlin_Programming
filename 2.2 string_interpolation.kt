// Objective

// 1. String Interpolation

fun main(args: Array<String>){

    var myStr : String = "Peter"
    myStr = "Hello " + myStr

    var a : Int = 13
    var b : Int = 22

    // This is 1st way. but it is not proper way
    println("The statement is " + myStr)
    var c = a + b
    println("The sum of "+ a + "and " + b + " is " + c)

    // This is 2nd way.
    println("The statement is $myStr")
    println("The sum of $a and $b is ${a+b}")
    print("The statement is $myStr. and length of Statement is ${myStr.length}")
}
