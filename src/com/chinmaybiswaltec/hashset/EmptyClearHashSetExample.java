package com.chinmaybiswaltec.hashset;

import java.util.HashSet;
import java.util.Set;

public class EmptyClearHashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        System.out.println(set.isEmpty());//false
        set.clear();//removes all elements
        System.out.println(set.isEmpty());//true
    }
}
