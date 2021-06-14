package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public class CheckOddEven {

        public static void main(String[] args) {
            int number = 49;
            System.out.println("The number is " + number);
            if (odd number ){
                System.out.println( odd number );
            } else{
                System.out.println( Even number );
            }
            System.out.println( bye );
        }
    }

    public static void SumAverageInt(){
        int nr;
        int total = 0;

        for (nr = 1; nr <= 100; nr++) {
            total = total + nr;
        }
        System.out.println(total);

        int initialSum = 0;
        double averageSum;
        for (int number = 1; number <= nr-1; ++number) {
            initialSum += number;
        }
        averageSum= initialSum/nr-1;
        System.out.println("The sum = "+initialSum);
        System.out.println("The average = "+ averageSum);

    }


    public class CheckPerfectSquare
    {

        static boolean checkPerfectSquare(double number)
        {

            double sqrt=Math.sqrt(number);

            return ((sqrt - Math.floor(sqrt)) == 0);
        }

        public static void main(String[] args)
        {
            System.out.print("6");
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
