package com.chinmaybiswaltec.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListListIteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();// Creating an ArrayList
        list.add("A");
        list.add("B");
        list.add("C");
        ListIterator<String> listIterator = list.listIterator();
        listIterator.next();listIterator.next();// Moves two steps
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previousIndex());
            System.out.println(listIterator.nextIndex());
            System.out.println(listIterator.previous());
            //1 //2 //B //0 //1 //A
            // Each element in one line
        }
    }
}
