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

    @Override
    public int hashCode() {
        return 66;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Email) {
                System.out.println("Ref is Email, compare");
                Email email1 = this;
                Email email2 = (Email) obj;
                if (email1.sender.equals(email2.sender)
                        && email1.receiver.equals(email2.receiver)
                        && email1.subject.equals(email2.subject)) {
                    System.out.println("Both Email objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
