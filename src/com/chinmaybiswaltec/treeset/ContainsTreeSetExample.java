package com.chinmaybiswaltec.treeset;

import java.util.Set;
import java.util.TreeSet;

public class ContainsTreeSetExample {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Ball");
        treeSet.add("Egg");
        treeSet.add("Ant");
        System.out.println(treeSet);//[Ant, Ball, Egg]
        boolean contains = treeSet.contains("Egg");
        System.out.println(contains);//true
    }
}
