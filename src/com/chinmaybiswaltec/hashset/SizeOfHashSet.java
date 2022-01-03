package com.chinmaybiswaltec.hashset;

import java.util.HashSet;
import java.util.Set;

public class SizeOfHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        System.out.println("Size "+ set.size());//2
    }
}
