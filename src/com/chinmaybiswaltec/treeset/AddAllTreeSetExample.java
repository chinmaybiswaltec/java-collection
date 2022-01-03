package com.chinmaybiswaltec.treeset;

import java.util.Set;
import java.util.TreeSet;

public class AddAllTreeSetExample {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Ball");
        treeSet.add("Egg");
        treeSet.add("Ant");
        System.out.println(treeSet);//[Ant, Ball, Egg]
        Set<String> treeSet2 = new TreeSet<>();
        treeSet2.add("Belt");
        treeSet2.add("Eat");
        treeSet2.add("Any");
        treeSet.addAll(treeSet2);
        System.out.println(treeSet);//[Ant, Any, Ball, Belt, Eat, Egg]
    }
}
