package com.chinmaybiswaltec.linkedlist;

import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;

public class IteratingLinkedListEnumerationExamples {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A"); list.add("B"); list.add("C");
        Enumeration<String> enm = Collections.enumeration(list);
        while(enm.hasMoreElements()){
            System.out.println(enm.nextElement());//A //B //C
        }
    }
}
