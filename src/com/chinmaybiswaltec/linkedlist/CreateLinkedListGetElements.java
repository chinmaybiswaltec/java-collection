package com.chinmaybiswaltec.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class CreateLinkedListGetElements {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        System.out.println(list);//[A, B]
        String s = list.get(1);
        System.out.println(s); //B
        String s1 = list.get(4);// Throws IndexOutOfBoundException here
    }
}
