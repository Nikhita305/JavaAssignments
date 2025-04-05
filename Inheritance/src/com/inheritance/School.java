package com.inheritance;

public class School {
    public School() {
        System.out.println("Running no-arg constructor of School");
    }

    public void open() {
        System.out.println("School opens at 8 AM");
    }

    public void teach() {
        System.out.println("School teaches all grades");
    }

    public void breakTime() {
        System.out.println("School gives students a lunch break");
    }

    public void exam() {
        System.out.println("School conducts regular exams");
    }

    public void close() {
        System.out.println("School closes by 4 PM");
    }
}
