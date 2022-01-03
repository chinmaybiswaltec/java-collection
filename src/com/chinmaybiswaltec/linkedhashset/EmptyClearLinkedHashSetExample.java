package com.chinmaybiswaltec.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class EmptyClearLinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> linkSet = new LinkedHashSet<>();
        linkSet.add("A");
        linkSet.add("B");
        System.out.println(linkSet.isEmpty());//false
        linkSet.clear();// removes all the elements
        System.out.println(linkSet.isEmpty());//true
    }
}
