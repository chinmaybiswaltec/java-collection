package com.chinmaybiswaltec.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveExceptionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();// Creating an ArrayList
        list.add("A");
        list.add("B");
        System.out.println(list); //[A, B]
        String removedElement = list.remove(3); //index not in range
        System.out.println(removedElement);
        //xception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 2
        //	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //	at java.base/java.util.ArrayList.remove(ArrayList.java:536)
        //	at com.chinmaybiswaltec.ArrayListRemoveExceptionExample.main(ArrayListRemoveExceptionExample.java:12)
    }
}
