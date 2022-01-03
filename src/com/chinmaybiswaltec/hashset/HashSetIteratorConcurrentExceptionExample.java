package com.chinmaybiswaltec.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIteratorConcurrentExceptionExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next());
            set.add("C");
        }
    }
}
//A
// Exception in thread "main" java.util.ConcurrentModificationException