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
//Exercitiu 3

    public static class CheckPerfectSquare
    {
        //user-defined method that checks the number is perfect square or not
        static boolean checkPerfectSquare(double number)
        {
//calculating the square root of the given number
            double sqrt=Math.sqrt(number);
//finds the floor value of the square root and comparing it with zero
            return ((sqrt - Math.floor(sqrt)) == 0);
        }
        //main method
        public static void main(String[] args)
        {
            System.out.print("Enter any number: ");
//object of the Scanner class
            Scanner sc=new Scanner(System.in);
//reading a number of type double from the user
            double number=sc.nextDouble();
//calling the user defined method
            if (checkPerfectSquare(number))
                System.out.print("Yes, the given number is perfect square.");
            else
                System.out.print("No, the given number is not perfect square.");
        }
    }

}
