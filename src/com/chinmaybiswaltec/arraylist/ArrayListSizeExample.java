package com.chinmaybiswaltec.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSizeExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();// Creating an ArrayList
        list.add("A");
        list.add("B");
        System.out.println(list); //[A, B]
        System.out.println(list.size());//2
    }
}
