package com.chinmaybiswaltec.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class NullValuesInLinkedHashSet {
    public static void main(String[] args) {
        Set<String> linkSet = new LinkedHashSet<>();
        linkSet.add("A");
        linkSet.add("B");
        linkSet.add(null);
        System.out.println(linkSet);//[A, B, null]
        linkSet.add(null);
        System.out.println(linkSet);//[A, B, null]
    }
}
