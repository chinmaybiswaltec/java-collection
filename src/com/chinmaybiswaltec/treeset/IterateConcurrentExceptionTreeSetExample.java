package com.chinmaybiswaltec.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class IterateConcurrentExceptionTreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Ball");
        treeSet.add("Egg");
        treeSet.add("Ant");
        treeSet.add("Cat");
        System.out.println(treeSet);
        Iterator<String> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next());//Ant
            treeSet.add("Dog");
            //Exception in thread "main" java.util.ConcurrentModificationException
        }
    }
}

