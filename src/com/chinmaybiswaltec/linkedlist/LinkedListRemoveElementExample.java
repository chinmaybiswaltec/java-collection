package com.chinmaybiswaltec.linkedlist;

import java.util.LinkedList;

public class LinkedListRemoveElementExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");list.add("B");list.add("C");list.add("D");
        System.out.println(list);//[A, B, C, D]
        String removedElement = list.remove();
        System.out.println(removedElement); //A
        System.out.println(list);//[B, C, D]
        String removedElementInd = list.remove(2);
        System.out.println(removedElementInd);//D
        System.out.println(list);//[B, C]
        boolean isRemoved = list.remove("B");
        System.out.println(isRemoved); // true
        System.out.println(list);//[C]
    }
}
