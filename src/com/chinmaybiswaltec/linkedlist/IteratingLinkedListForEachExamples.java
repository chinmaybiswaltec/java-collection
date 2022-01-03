package com.chinmaybiswaltec.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratingLinkedListForEachExamples {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A"); list.add("B"); list.add("C");
        for(String s : list){
            System.out.println(s); //A //B //C
        }
    }
}
