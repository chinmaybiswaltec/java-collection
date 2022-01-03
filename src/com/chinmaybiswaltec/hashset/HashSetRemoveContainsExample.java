package com.chinmaybiswaltec.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetRemoveContainsExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();// creating HashSet
        set.add("A");
        set.add("B");
        System.out.println(set);//[A, B]
        System.out.println(set.contains("C"));//false
        System.out.println(set.contains("B"));//true
        boolean isRemoved = set.remove("B");
        System.out.println(isRemoved);//true
        System.out.println(set);//[A]
    }
}

