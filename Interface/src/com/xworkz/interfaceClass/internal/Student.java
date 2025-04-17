package com.xworkz.interfaceClass.internal;
public interface Student {
    void study();
    void attendClass();
    void writeExam();
    default void participate() {
        System.out.println("Student is participating");
    }

}
