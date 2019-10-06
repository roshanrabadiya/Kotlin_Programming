package com.java;
import com.kotlin.MyCustomKotlinFileName;

// Interoperability in java
// In java there is no concept of default Arguments. but in kotlin using Annotation we use the default function in java

public class MyJavaClass {
    public static void main(String[] args){

        // here you can pass only 2 parameters
        int result= MyCustomKotlinFileName.findVolume(4,5);
        System.out.println("Volume is "+result);

        // here you can pass 3 parameters
        int result2= MyCustomKotlinFileName.findVolume(4,5,20);
        System.out.println("Volume is "+result2);
    }
}
