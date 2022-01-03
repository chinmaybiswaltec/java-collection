package com.chinmaybiswaltec.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class ForEachTreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Ball");
        treeSet.add("Egg");
        treeSet.add("Ant");
        treeSet.add("Cat");
        for(String s: treeSet){
            System.out.println(s);
        }
    }
}

