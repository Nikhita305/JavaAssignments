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

    @Override
    public int hashCode() {
        return 26;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Chats) {
                System.out.println("Ref,compare");
                Chats chats = this;
                Chats chats1 = (Chats) obj;
                if (chats.sender.equals(chats1.sender)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
