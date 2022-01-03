package com.chinmaybiswaltec.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGetExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();// Creating an ArrayList
        list.add("A");
        list.add("B");
        System.out.println(list); //[A, B]
        String elem = list.get(1); // Returns the element present at index 1
        System.out.println(elem); // B
        String nextElm = list.get(2); // IndexOutOfBoundsException Exception
        System.out.println(nextElm);
    }
}
