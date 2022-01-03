package com.chinmaybiswaltec.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class SizeOfLinkedHashSet {
    public static void main(String[] args) {
        Set<String> linkSet = new LinkedHashSet<>();
        linkSet.add("A");
        linkSet.add("B");
        System.out.println(linkSet.size());//2
    }
}
