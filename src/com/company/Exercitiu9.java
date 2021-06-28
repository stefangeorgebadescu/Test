package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercitiu9 {


        public static void main(String[] args) {
            int[] integers = new int[]{1,4, 70, 9, 10};
            varArgs(integers);
        }

        public static void varArgs(int... integers) {
            List<Integer> list = new ArrayList<>();
            for (int i : integers) {
                Collections.addAll(list, i);
            }
            System.out.println("My list is : " + list);

            Collections.reverse(list);
            System.out.println("My reversed list is " + list);

        }
    }

