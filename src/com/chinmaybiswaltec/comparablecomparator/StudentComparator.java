package com.chinmaybiswaltec.comparablecomparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<StudentComparator> {
  private String firstName;
  private String lastName;
  private int mark;
  public StudentComparator(String firstName, String lastName, int mark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mark = mark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public int compare(StudentComparator o1, StudentComparator o2) {
        return o1.mark - o2.mark;
    }
}
