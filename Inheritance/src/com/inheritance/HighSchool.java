package com.inheritance;

public class HighSchool extends School {
    public HighSchool() {
        System.out.println("Running no-arg constructor of HighSchool");
    }

    @Override
    public void open() {
        System.out.println("HighSchool starts with assembly at 8:15 AM");
    }

    @Override
    public void teach() {
        System.out.println("HighSchool focuses on science and math streams");
    }

    @Override
    public void breakTime() {
        System.out.println("HighSchool students get break at 12:30 PM");
    }

    @Override
    public void exam() {
        System.out.println("HighSchool conducts board exams");
    }

    @Override
    public void close() {
        System.out.println("HighSchool ends at 3:30 PM");
    }
}
