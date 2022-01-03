package com.chinmaybiswaltec.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListForEachExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();// Creating an ArrayList
        list.add("A");
        list.add("B");
       for(String e: list){
           System.out.println(e);//A //B
       }
    }
}
