package com.chinmaybiswaltec.treeset;

import java.util.Set;
import java.util.TreeSet;

public class FirstLastTreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Ball");
        treeSet.add("Egg");
        treeSet.add("Ant");
        System.out.println(treeSet);//[Ant, Ball, Egg]
        System.out.println(treeSet.first());//Ant
        System.out.println(treeSet.last());//Egg
    }
}
