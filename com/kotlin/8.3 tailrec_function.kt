package com.kotlin

import java.math.BigInteger

// Objective

// 1. tailrec Function in kotlin

fun main(){

    println(getFibonacciNum(10000, BigInteger("1"), BigInteger("0")))   

}
// 0 1 1 2 3 5 8 13 21 .....
tailrec fun getFibonacciNum(n: Int, a: BigInteger, b: BigInteger): BigInteger{  // using tailrec function you can find any Fibonacci Numbers
    return if (n == 0)
        b
    else
        getFibonacciNum(n-1,a+b,a)
}


