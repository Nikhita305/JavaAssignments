package com.xworkz.interfaceClass.internal;

public interface Chats {
    void sendMessage();
    void receiveMessage();
    void shareFile();

    default void videoCall() {
        System.out.println("Making a video call on the chat app");
    }
}
