package com.xworkz.toStringRep;

public class Bubbles {
    private String size;
    private String color;
    private int count;

    public Bubbles(String size, String color, int count) {
        this.size = size;
        this.color = color;
        this.count = count;
        System.out.println("Bubbles Constructor");
    }

    @Override
    public String toString() {
        return "Size: " + this.size + ", Color: " + this.color + ", Count: " + this.count;
    }

    @Override
    public int hashCode() {
        return 42;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Bubbles) {
                System.out.println("Ref,compare");
                Bubbles bubble1 = this;
                Bubbles bubble2 = (Bubbles) obj;
                if (bubble1.size.equals(bubble2.size) && bubble1.color.equals(bubble2.color)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
