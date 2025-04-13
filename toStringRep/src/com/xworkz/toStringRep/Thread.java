package com.xworkz.toStringRep;

public class Thread {
    private String color;
    private String type;
    private double length;

    public Thread(String color, String type, double length) {
        this.color = color;
        this.type = type;
        this.length = length;
        System.out.println("Thread Constructor");
    }

    @Override
    public String toString() {
        return "Color: " + this.color + ", Type: " + this.type + ", Length: " + this.length + " m";
    }

    @Override
    public int hashCode() {
        return 56;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Thread) {
                System.out.println("Ref,compare");
                Thread thread = this;
                Thread thread1 = (Thread) obj;
                if (thread.color.equals(thread1.color) && thread.type.equals(thread1.type)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
