package com.chinmaybiswaltec.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddSetExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();// Creating an ArrayList
        list.add("A"); // Adding an element to ArrayList
        list.add("B");
        System.out.println(list); //[A, B]
        // add A again
        list.add("A");
        System.out.println(list); //[A, B, A]
        // Set an element at index 1
        String s = list.set(1,"D");
        System.out.println(s); //B
        System.out.println(list); //[A, D, A]
    }
}
