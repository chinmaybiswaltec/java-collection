package com.chinmaybiswaltec.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class CreateLinkedListAddElements {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        System.out.println(list);//[A, B]
        list.add(null); // Null value allowed
        System.out.println(list); // [A, B, null]
        list.add("A");// Duplicate values allowed
        System.out.println(list); //[A, B, null, A]
        String s = list.set(2,"C");// replaces the element at that index
        System.out.println(s);// returns the element at that index
        System.out.println(list);//[A, B, C, A]
    }
}
