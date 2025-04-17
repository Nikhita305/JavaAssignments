package com.xworkz.interfaceClass.internal;

public interface School {
    void conductClasses();
    void organizeExams();
    void holdEvents();

    default void manage() {
        System.out.println("Running manage in School");
    }
}
