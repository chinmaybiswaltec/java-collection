package com.chinmaybiswaltec.arraylist;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();// Creating an ArrayList
        list.add("A");
        list.add("B");
        System.out.println(list); //[A, B]
        String removedElement = list.remove(1); //remove the element from index 1
        System.out.println(removedElement); // B the removed element
        System.out.println(list); // [A]
        list.add("B");
        boolean isRemoved = list.remove("A");
        System.out.println(list); // [B]
        System.out.println(isRemoved); // true
    }
}
