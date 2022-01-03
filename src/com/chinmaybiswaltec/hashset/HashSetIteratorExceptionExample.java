package com.chinmaybiswaltec.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIteratorExceptionExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        Iterator<String> iterator = set.iterator();
        iterator.remove();
    }
}
//Exception in thread "main" java.lang.IllegalStateException