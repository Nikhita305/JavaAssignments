package com.xworkz.toStringRep;

public class Chats {
    private String sender;
    private String message;
    private String time;

    public Chats(String sender, String message, String time) {
        this.sender = sender;
        this.message = message;
        this.time = time;
        System.out.println("Chats Constructor");
    }

    @Override
    public String toString() {
        return "Sender: " + this.sender + ", Message: \"" + this.message + "\", Time: " + this.time;
    }
}
