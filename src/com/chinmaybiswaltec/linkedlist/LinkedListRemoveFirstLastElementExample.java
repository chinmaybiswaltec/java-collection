package com.chinmaybiswaltec.linkedlist;

import java.util.LinkedList;

public class LinkedListRemoveFirstLastElementExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");list.add("B");list.add("C");list.add("D");
        System.out.println(list);//[A, B, C, D]
        String firstElement = list.removeFirst();
        System.out.println(firstElement); // A
        System.out.println(list);//[B, C, D]
        String lastElement = list.removeLast();
        System.out.println(lastElement); //D
        System.out.println(list);//[B, C]
    }
}
