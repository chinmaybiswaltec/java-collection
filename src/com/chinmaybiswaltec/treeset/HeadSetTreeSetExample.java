package com.chinmaybiswaltec.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class HeadSetTreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Ball");
        treeSet.add("Egg");
        treeSet.add("Ant");
        treeSet.add("Cat");
        System.out.println(treeSet);//[Ant, Ball, Cat, Egg]
        System.out.println(treeSet.headSet("Ball"));//[Ant]
        System.out.println(treeSet.tailSet("Ball"));//[Ball, Cat, Egg]
    }
}
