package com.company;

import java.util.ArrayList;

public class Exercitiu6 {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        c1.removeAll(c1);
        System.out.println("Array list after remove all elements "+c1);
        boolean ans = c1.isEmpty();
        if (ans == true)
            System.out.println("The ArrayList is empty");
        else
            System.out.println("The ArrayList is not empty");
    }
}
