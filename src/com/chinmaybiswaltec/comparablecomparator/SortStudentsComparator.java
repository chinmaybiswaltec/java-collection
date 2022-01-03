package com.chinmaybiswaltec.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudentsComparator {
    public static void main(String[] args) {
        {
            List<StudentComparable> students = new ArrayList<>();
            StudentComparable s1 = new StudentComparable("A","B",50);
            StudentComparable s2 = new StudentComparable("AA","BB",10);
            StudentComparable s3 = new StudentComparable("AAA","BBB",90);
            StudentComparable s4 = new StudentComparable("AAAA","BBBB",60);
            students.add(s1);students.add(s2);students.add(s3);students.add(s4);
            System.out.println("Before sorting");
            for (StudentComparable s: students){
                System.out.print("Name>>"+s.getFirstName()+">>mark>>"+s.getMark());
            }
            Collections.sort(students);
            System.out.println("After sorting");
            for (StudentComparable s: students){
                System.out.print("Name>>"+s.getFirstName()+">>mark>>"+s.getMark());
            }
        }
    }
}
