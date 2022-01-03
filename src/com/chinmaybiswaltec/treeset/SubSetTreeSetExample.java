package com.chinmaybiswaltec.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class SubSetTreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Ball");
        treeSet.add("Egg");
        treeSet.add("Ant");
        treeSet.add("Cat");
        System.out.println(treeSet);//[Ant, Ball, Cat, Egg]
        SortedSet<String> subSet = treeSet.subSet("Ball","Egg");
        System.out.println(subSet);//[Ball, Cat]
        SortedSet<String> subSet2 = treeSet.subSet("A","B");
        System.out.println(subSet2);//[Ant]
    }
}
