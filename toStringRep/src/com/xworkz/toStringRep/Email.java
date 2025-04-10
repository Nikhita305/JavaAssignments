package com.xworkz.toStringRep;

public class Email {
    private String sender;
    private String receiver;
    private String subject;

    public Email(String sender, String receiver, String subject) {
        this.sender = sender;
        this.receiver = receiver;
        this.subject = subject;
        System.out.println("Email Constructor");
    }

    @Override
    public String toString() {
        return "Sender: " + this.sender + ", Receiver: " + this.receiver + ", Subject: " + this.subject;
    }

    public int hashCode() {
        return 66;
    }
}
