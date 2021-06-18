package com.company;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    //Exercitiu 1

        public static void CheckOddEven () {
            Scanner scan = new Scanner(System.in);
            System.out.println("The number is ");
            int num = scan.nextInt();
            if (num % 2 == 0) {
                System.out.println("EvenNumber");   // even number
            } else {
                System.out.println("OddNumber");   // odd number
            }
            System.out.println("bye");
        }


    // Exercitiu 2
    public static void SumAverageInt () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        double sum = 0;
        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        double avg;
        avg = sum / num;
        System.out.println("Sum is: " + (int) sum);
        System.out.println("Avg is: " + avg);
    }


    //Exercitiu 3

       static boolean checkPerfectSquare(double number) {
            double sqrt = Math.sqrt(number);
            if(sqrt - Math.floor(sqrt) == 0){
            return true;}
            else return false;
        }

    //Exercitiu 4
    public static void SumProductMinMax ()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int firstInt = in.nextInt();
        System.out.print("Input 2nd integer: ");
        int secondInt = in.nextInt();
        System.out.print("Input third integer: ");
        int thirdInt = in.nextInt();
        System.out.printf("Sum of three integers: %d%n", firstInt + secondInt+thirdInt);

        System.out.printf("Product of three integers: %d%n", firstInt * secondInt*thirdInt);


        System.out.printf("Max integer: %d%n", Math.max(Math.max(firstInt, secondInt),thirdInt));
        System.out.printf("Min integer: %d%n", Math.min(Math.min(firstInt, secondInt),thirdInt));
    }


    //Exercitiu 5
    public static void PositiveInteger ()
    {
        Scanner console = new Scanner(System.in);

        int number;
        int reverse = 0;

        System.out.print("Enter the number ");
        number = console.nextInt();

        int temp = number;
        int remainder = 0;

        while (temp > 0) {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }

        System.out.println("Reverse of " + number + " is " + reverse);
    }

    //Exercitiu 6

    public static void CountVowelsDigits ()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.next();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] digits = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        int vowelsNo = 0;
        int digitsNo = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (str.toLowerCase().charAt(i) == vowels[j]) {
                    vowelsNo++;
                }
            }
            for (int j = 0; j < digits.length; j++) {
                if (str.charAt(i) == digits[j]) {
                    digitsNo++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelsNo);
        System.out.println("Number of digits : " + digitsNo);
    }


    //Exercitiu 7


    public static void InsertArrayElement (){


            int count, i, num, index;
            int input[] = new int[100];

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Number of Elements in Array");
            count = scanner.nextInt();
            System.out.println("Enter " + count + " Numbers");
            for (i = 0; i < count; i++) {
                input[i] = scanner.nextInt();
            }

            System.out.println("Enter Number to be Inserted");
            num = scanner.nextInt();
            System.out.println("Enter Index of Insertion");
            index = scanner.nextInt();
            for (i = count; i > index; i--) {
                input[i] = input[i - 1];
                input[index] = num;
                count++;
                System.out.println("Final Array");
                for (i = 0; i < count; i++) {
                    System.out.print(input[i] + " ");

                }
            }}

   //Exercitiu 8
             public static int[] remove(int[] a, int key)
            {
             return Arrays.stream(a)    // IntStream
               .filter(val -> val != key)
               .toArray();

             }
//Exercitiu 9

   public static void bubbleSort(){

        int nums[] = {7, -5, 3, 2, 1, 0, 45};
        int n = nums.length;
       System.out.println("Original Array:");
       System.out.println(Arrays.toString(nums));
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (nums[j] > nums[j+1])
                {
                    // swap temp and nums[i]
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }


       // ob.bubbleSort(nums);
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(nums));

    }

            //Exercitiu 10

    public static void AverageValue(){


            int[] array_nums = {331, 7, 123,89, 4, 9};
            System.out.println("Original Array: "+ Arrays.toString(array_nums));
            int max = array_nums[0];
            int min = array_nums[0];
            float sum = array_nums[0];
            for(int i = 1; i < array_nums.length; i++)
            {
                sum  += array_nums[i];
                if(array_nums[i] > max)
                    max = array_nums[i];
                else if(array_nums[i] < min)
                    min = array_nums[i];
            }
            float x = ((sum-max-min) / (array_nums.length - 2));
            System.out.printf("Compute the average value of an array of integers except the largest and smallest values: %.2f",x);
            System.out.print("\n");
        }

        public static void main (String[] args) {

            //ex1
            //CheckOddEven();

            //ex2
            //SumAverageInt();

            //ex3

         /*   System.out.print("Enter any number: ");
            Scanner sc = new Scanner(System.in);
            int num= sc.nextInt();
        System.out.println("Check perfect sqare " + checkPerfectSquare(num));*/

            //ex4
            // SumProductMinMax();

            //ex5
            // PositiveInteger();

            //ex6
            //CountVowelsDigits();

            //ex7
            //InsertArrayElement();
            //ex8

           /* int[] a = { 1, 2, 3, 2, 4, 2, 4, 5 };
            int key = 2;

            a = remove(a, key);
            System.out.println(Arrays.toString(a));*/

            // ex9
          // bubbleSort();

            //ex10
            AverageValue();
        }}















