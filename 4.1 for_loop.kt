// Objective

// 1. For Loop in Kotlin

fun main(){

    // Here i have to print the Table of 12.
    val tableNum : Int = 12

    for(i in 1..10)
    {
        println("$tableNum * $i = ${tableNum * i}")
    }
}


// For Loop Internal Process

//            Initialize   ->    Condition Check   ->    code execute         ->    Increment    ->     Output
//              i = 1      ->         yes..        ->    print(table value)   ->    i++  (i=2)   ->    12 * 1 = 12
//              i = 2      ->         yes..        ->    print(table value)   ->    i++  (i=3)   ->    12 * 2 = 24
//              i = 3      ->         yes..        ->    print(table value)   ->    i++  (i=4)   ->    12 * 3 = 36
//                .
//                .
//                .
//              i = 10      ->        yes..        ->    print(table value)   ->    i++  (i=11)   ->    12 * 10 = 120
//              i = 11      ->        No..                                                        ->    out from for loop              
