package com.chinmaybiswaltec.linkedhashset;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CreateLinkedHashSetAddElement {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("L");
        Set<String> linkSet = new LinkedHashSet<>();
        linkSet.add("A");
        linkSet.add("B");
        System.out.print(linkSet);//[A, B]
        Set<String> linkSet2 = new LinkedHashSet<>();
        linkSet.add("C");
        linkSet.add("D");
        linkSet.addAll(linkSet2);
        linkSet.addAll(list);
        System.out.print(linkSet);//[A, B, C, D, L]
    }
}
