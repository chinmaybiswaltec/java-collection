package com.chinmaybiswaltec.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();// creating HashSet
        set.add("A");
        set.add("B");
        System.out.println(set);//[A, B]
        boolean isDuplicateAdded = set.add("A");
        System.out.println(isDuplicateAdded);//false
        System.out.println(set);//[B, A]
    }
}

