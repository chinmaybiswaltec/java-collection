package com.chinmaybiswaltec.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIForEachExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        for(String s: set){
            System.out.print(s);//AB
        }
    }
}
