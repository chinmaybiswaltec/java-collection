package com.chinmaybiswaltec.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveContainsLinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> linkSet = new LinkedHashSet<>();
        linkSet.add("A");
        linkSet.add("B");
        boolean isRemoved = linkSet.remove("B");
        System.out.println(isRemoved);//true
        System.out.println(linkSet);//[A]
        System.out.println(linkSet.contains("A"));//true
    }
}
