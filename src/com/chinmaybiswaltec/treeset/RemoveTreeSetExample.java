package com.chinmaybiswaltec.treeset;

import java.util.Set;
import java.util.TreeSet;

public class RemoveTreeSetExample {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Ball");
        treeSet.add("Egg");
        treeSet.add("Ant");
        System.out.println(treeSet);//[Ant, Ball, Egg]
        boolean isRemoved = treeSet.remove("Egg");
        System.out.println(isRemoved);//true
        System.out.println(treeSet);//[Ant, Ball]
    }
}
