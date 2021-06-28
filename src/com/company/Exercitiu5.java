package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercitiu5
    {
        public static void main(String[] args)
        {
            // Let us create a list of strings
            List<String> mylist = new ArrayList<String>();
            mylist.add("1");
            mylist.add("2");
            mylist.add("3");
            mylist.add("4");

            System.out.println("Original List : " + mylist);

            // Here we are using reverse() method
            // to reverse the element order of mylist
            Collections.reverse(mylist);

            System.out.println("Modified List: " + mylist);
        }
    }

