// Objective

// 1. String Interpolation

fun main(args: Array<String>){

    // 1st way

    // This range contains the Number 1 , 2 , 3 , 4 , 5
    val r1 = 1..5
    // This range contains the Number in Descending  5 , 4 , 3 , 2 , 1
    val r1Dec = 5 downTo 1 
    // Check the number is present in range
    val r1Check = 6 in r1
    // skip the range number. range is 1 , 3 , 5
     val mySkip = 1..5 step 2
    println(r1)
    println(r1Check)
    println(r1Dec)

    println()
    // This range contains the Number a , b , c , d , ..... , z
    val c1 = 'a'..'z'
    // This range contains the Number in Descending  z , y , x.... , a
    val c1Dec = 'z' downTo 'a'
    // Check the number is present in range
    val c1Check = 'r' in c1
    println(c1)
    println(c1Check)
    println(c1Dec)

    println()

    // 2nd Way
    val r2 = 10.rangeTo(1)
    val countDown = 10.downTo(5)
    println(r2)
    println(countDown)
}
