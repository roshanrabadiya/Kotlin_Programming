// Objective

// 1.
// Break Statement in Kotlin

fun main(){

    // Example 1:
    for (i in 1..10){
        println(i)
        if (i == 6)     // After 6 it exit from the for loop
            break
    }

    // Example 2: For Loop with Label

   myOuterLoop@ for (i in 1..3){
        myInnerLoop@ for (j in 1..3){
                            println("$i  $j")
                            if (i == 2 && j == 2)
                                //break                   // Hear this break statement is terminate only inner loop not outer loop
                                break@myOuterLoop         // Here i give the outer loop Label to terminate inner as well as outer loop
        }
    }
}
