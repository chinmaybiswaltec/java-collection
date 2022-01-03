package com.chinmaybiswaltec.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudentsFirstNameComparator {
    public static void main(String[] args) {
        {
            List<StudentComparable> students = new ArrayList<>();
            StudentComparable s1 = new StudentComparable("B","C",50);
            StudentComparable s2 = new StudentComparable("D","A",10);
            StudentComparable s3 = new StudentComparable("A","D",90);
            StudentComparable s4 = new StudentComparable("C","B",60);
            students.add(s1);students.add(s2);students.add(s3);students.add(s4);
            System.out.println("Before sorting");
            for (StudentComparable s: students){
                System.out.print("Name>>"+s.getFirstName()+">>mark>>"+s.getMark());
            }
            Collections.sort(students, new StudentsFirstNameComparator());
            System.out.println("After sorting");
            for (StudentComparable s: students){
                System.out.print("Name>>"+s.getFirstName()+">>mark>>"+s.getMark());
            }
        }
    }
}
//Output
//Before sorting
//Name>>B>>mark>>50Name>>D>>mark>>10Name>>A>>mark>>90Name>>C>>mark>>60
//After sorting
//Name>>A>>mark>>90Name>>B>>mark>>50Name>>C>>mark>>60Name>>D>>mark>>10