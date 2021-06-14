package com.company;

public class SumAverageInt {
     public static void main (String[]args){
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
}
