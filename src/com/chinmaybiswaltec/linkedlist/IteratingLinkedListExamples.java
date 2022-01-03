package com.chinmaybiswaltec.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratingLinkedListExamples {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A"); list.add("B"); list.add("C");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()); //A //B //C
        }
    }
}
