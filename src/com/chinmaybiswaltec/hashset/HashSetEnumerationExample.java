package com.chinmaybiswaltec.hashset;

import java.util.*;

public class HashSetEnumerationExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        Enumeration<String> enm = Collections.enumeration(set);
        while(enm.hasMoreElements()){
            System.out.print(enm.nextElement()); //AB
        }
    }
}
