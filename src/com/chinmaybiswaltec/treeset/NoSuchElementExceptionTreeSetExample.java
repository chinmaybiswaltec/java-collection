package com.chinmaybiswaltec.treeset;

import java.util.TreeSet;

public class NoSuchElementExceptionTreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        //Exception in thread "main" java.util.NoSuchElementException
        System.out.println(treeSet.last());
    }
}
