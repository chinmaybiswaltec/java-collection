package com.chinmaybiswaltec.treeset;

import java.util.Set;
import java.util.TreeSet;

public class ClearEmptySizeTreeSetExample {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Ball");
        treeSet.add("Egg");
        treeSet.add("Ant");
        System.out.println(treeSet);//[Ant, Ball, Egg]
        System.out.println("Size is "+treeSet.size());//Size is 3
        System.out.println("Is empty ? "+treeSet.isEmpty());//Is empty ? false
        treeSet.clear();// Removes all the elements
        System.out.println("Size is "+treeSet.size());//Size is 0
        System.out.println("Is empty ? "+treeSet.isEmpty());//Is empty ? true
    }
}
