// Objective

// 1. do..while Loop in Kotlin

fun main(){

    // Here i have to print the Table of 15.
    val tableNum : Int = 15
    var i : Int = 1

    do{
        println("$tableNum * $i = ${tableNum * i}")
        i++
    }while (i <= 10)
}


// do..while Loop Internal Process

//            Initialize   ->     code execute       ->    Increment    ->     Condition Check   ->    Output
//              i = 1      ->   print(table value)   ->     i++ (i=2)   ->          yes..        ->    15 * 1 = 15
//              i = 2      ->   print(table value)   ->     i++ (i=3)   ->          yes..        ->    15 * 2 = 30
//              i = 3      ->   print(table value)   ->     i++ (i=4)   ->          yes..        ->    15 * 3 = 45
//                .
//                .
//                .
//              i = 10      ->   print(table value)   ->     i++ (i=11)   ->        yes..        ->    15 * 10 = 150
