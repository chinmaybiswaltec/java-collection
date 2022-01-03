package com.chinmaybiswaltec.hashset;

import java.util.HashSet;
import java.util.Set;

public class AddingNullValueHashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();// creating HashSet
        set.add("A");
        set.add("B");
        set.add(null);
        System.out.println(set);//[null, A, B]
        System.out.println(set.size());//3
        set.add(null);
        System.out.println(set);//[null, A, B]
        System.out.println(set.size());//3
    }
}
