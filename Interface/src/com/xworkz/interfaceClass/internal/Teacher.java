package com.xworkz.interfaceClass.internal;

public interface Teacher {
    void teach();
    void gradePapers();
    void holdMeeting();

    default void prepare() {
        System.out.println("Running prepare in Teacher");
    }
}
