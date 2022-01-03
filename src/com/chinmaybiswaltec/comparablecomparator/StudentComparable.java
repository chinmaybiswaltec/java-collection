package com.chinmaybiswaltec.comparablecomparator;

public class StudentComparable implements Comparable<StudentComparable>{
  private String firstName;
  private String lastName;
  private int mark;
  public StudentComparable(String firstName, String lastName, int mark) {
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
    public int compareTo(StudentComparable o) {
        return this.mark - o.mark;
    }
}
