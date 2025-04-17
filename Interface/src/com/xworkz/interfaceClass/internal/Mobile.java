package com.xworkz.interfaceClass.internal;

public interface Mobile {
    void makeCall();
    void sendMessage();
    void browseInternet();

    default void charge() {
        System.out.println("Running charge in Mobile");
    }
}
