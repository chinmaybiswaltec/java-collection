package com.chinmaybiswaltec.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveExceptionExample2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();// Creating an ArrayList
        list.add("A");
        list.add("B");
        System.out.println(list); //[A, B]
        boolean isRemoved = list.remove("E"); //E is not present in list
        System.out.println(isRemoved);// false
        System.out.println(list); // //[A, B]
    }
}
