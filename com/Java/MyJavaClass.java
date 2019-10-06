package com.java;
import com.kotlin.MyCustomKotlinFileName;

// Interoperability in java
public class MyJavaClass {
    public static void main(String[] args){
        int myClass = MyCustomKotlinFileName.add(10,33);
        System.out.println("Printing sum from the Java File:"+myClass);
    }

    public static int area(int l, int b){
        return l * b;
    }
}
