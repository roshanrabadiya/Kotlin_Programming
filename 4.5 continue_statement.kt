@file:Suppress("UNREACHABLE_CODE")

// Objective

// 1.
// Continue Statement in Kotlin

fun main(){

    // Example 1:
    for (i in 1..10){

        if (i == 4) {     // it skip the 4 number and continue the loop
            continue
        }
        println(i)
    }

    // Example 2: With For Loop with Label

    println()
   myOuterLoop@ for (i in 1..3){
        myInnerLoop@ for (j in 1..3){

                            if (i == 2 && j == 2) {
                                //continue                 // Hear numbers skip when the condition is true and continue the loop
                                continue@myOuterLoop         // Here i give the outer loop Label to skip inner as well as outer loop number
                            }
            println("$i  $j")                           
        }
    }
}
