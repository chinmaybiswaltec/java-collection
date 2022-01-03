package com.chinmaybiswaltec.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorRemoveExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();// Creating an ArrayList
        list.add("A");
        list.add("B");
        list.add("C");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            itr.remove(); // IllegalStateException As we haven't called next() before
            //remove
            System.out.println(itr.next());
        }
    }
}
