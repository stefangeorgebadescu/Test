package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Exercitiu7 {
    public static void main(String[] args){
        // generate 10 hundred random numbers into an array
        // because when the seeds of the same time, it generates a random number sequence as (it is the pseudo-random number), so we use the current time as a pseudo-random number seed
        Random rand=new Random(System.currentTimeMillis());

        int[] arr=new int[10];
        ArrayList arrayList=new ArrayList();

        for(int i=0;i<10;i++){
            arr[i]=rand.nextInt(100);
            if (arr[i]>=10){
                arrayList.add(arr[i]);
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arrayList);



        }
    }

