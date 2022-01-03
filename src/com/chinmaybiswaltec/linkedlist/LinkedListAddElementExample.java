package com.chinmaybiswaltec.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListAddElementExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        System.out.println(list);//[A, B]
        list.add(1, "D");
        System.out.println(list);//[A, D, B]
        list.addFirst("F");
        System.out.println(list);// [F, A, D, B]
        list.addLast("E");
        System.out.println(list); //[F, A, D, B, E]
    }
}
