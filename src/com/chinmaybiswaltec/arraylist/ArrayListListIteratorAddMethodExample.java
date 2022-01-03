package com.chinmaybiswaltec.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListListIteratorAddMethodExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();// Creating an ArrayList
        list.add("A");
        list.add("B");
        list.add("C");
        ListIterator<String> listIterator = list.listIterator();
        listIterator.add("E");
        System.out.println(listIterator.previous()); //E
        }
    }
