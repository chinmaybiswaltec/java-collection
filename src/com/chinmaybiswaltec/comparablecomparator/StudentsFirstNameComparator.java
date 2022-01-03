package com.chinmaybiswaltec.comparablecomparator;

import java.util.Comparator;

public class StudentsFirstNameComparator implements Comparator<StudentComparable> {

    @Override
    public int compare(StudentComparable o1, StudentComparable o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
