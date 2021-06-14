package com.company;

import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        int number = 56;
        CheckOddEven(number);
    }
public  static void CheckOddEven(int number) {   // Save as "CheckOddEven.java"
              // Set the value of "number" here!
        System.out.println("The number is " + number);
        if ( number % 2 ==0) {
            System.out.println( "EvenNumber" );   // even number
        } else {
            System.out.println("OddNumber" );   // odd number
        }
        System.out.println( "bye" );
    }


}
