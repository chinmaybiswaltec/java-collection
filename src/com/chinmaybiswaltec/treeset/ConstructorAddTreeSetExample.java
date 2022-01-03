package com.chinmaybiswaltec.treeset;

import java.util.Set;
import java.util.TreeSet;

public class ConstructorAddTreeSetExample {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Ball");
        treeSet.add("Egg");
        treeSet.add("Ant");
        System.out.println(treeSet);//[Ant, Ball, Egg]
        //Sorted according to their natural order
    }
}
