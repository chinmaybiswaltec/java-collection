package com.chinmaybiswaltec.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddAtIndexExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();// Creating an ArrayList
        list.add("A");
        list.add("B");
        System.out.println(list); //[A, B]
        list.add(1, "E");// Adding element in an index
        System.out.println(list); //[A, E, B]
    }
}
