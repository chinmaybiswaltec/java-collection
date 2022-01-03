package com.chinmaybiswaltec.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class ArrayListEnumerationExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();// Creating an ArrayList
        list.add("A");
        list.add("B");
        Enumeration<String> enm = Collections.enumeration(list);
        while(enm.hasMoreElements()){
            System.out.println(enm.nextElement());//A //B
        }
    }
}
