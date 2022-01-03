package com.chinmaybiswaltec.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratingLinkedListExamples {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A"); list.add("B"); list.add("C");
        ListIterator<String> listIterator = list.listIterator();
        listIterator.next();listIterator.next(); //moves two steps
        while(listIterator.hasNext()){
            System.out.println(listIterator.next()); //C
            System.out.println(listIterator.nextIndex()); //3
        }
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
            System.out.println(listIterator.previousIndex());
            //C 1 B 0 A -1
            // previousIndex() returns index of the element that would be returned
            // subsequent call to previous.
        }
    }
}
