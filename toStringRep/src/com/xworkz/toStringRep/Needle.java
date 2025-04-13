package com.xworkz.toStringRep;

public class Needle {
    private String type;
    private double length;
    private boolean isSharp;

    public Needle(String type, double length, boolean isSharp) {
        this.type = type;
        this.length = length;
        this.isSharp = isSharp;
        System.out.println("Needle Constructor");
    }

    @Override
    public String toString() {
        return "Type: " + this.type + ", Length: " + this.length + " cm, Is Sharp: " + this.isSharp;
    }

    @Override
    public int hashCode() {
        return 51;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Needle) {
                System.out.println("Ref,compare");
                Needle needle = this;
                Needle needle1 = (Needle) obj;
                if (needle.type.equals(needle1.type) && needle.length == needle1.length) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
