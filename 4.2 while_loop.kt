// Objective

// 1. while Loop in Kotlin

fun main(){

    // Here i have to print the Table of 12.
    val tableNum : Int = 8
    var i : Int = 1
    while (i <= 10)
    {
        println("$tableNum * $i = ${tableNum * i}")
        i++
    }
}


// while Loop Internal Process

//            Initialize   ->    Condition Check   ->    code execute         ->    Increment    ->     Output
//              i = 1      ->         yes..        ->    print(table value)   ->    i++  (i=2)   ->    8 * 1 = 8
//              i = 2      ->         yes..        ->    print(table value)   ->    i++  (i=3)   ->    8 * 2 = 16
//              i = 3      ->         yes..        ->    print(table value)   ->    i++  (i=4)   ->    8 * 3 = 24
//                .
//                .
//                .
//              i = 10      ->        yes..        ->    print(table value)   ->    i++  (i=11)   ->    8 * 10 = 80
//              i = 11      ->        No..                                                        ->    out from for loop
