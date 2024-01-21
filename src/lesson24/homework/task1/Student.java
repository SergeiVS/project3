package task1;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String SurName;

    public Student(String firstName, String surName) {
        this.firstName = firstName;
        SurName = surName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", SurName='" + SurName + '\'' +
                '}';
    }
}
