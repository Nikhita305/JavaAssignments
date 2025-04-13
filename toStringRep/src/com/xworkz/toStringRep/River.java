package com.xworkz.toStringRep;

public class River {
    private String name;
    private double length;
    private String origin;

    public River(String name, double length, String origin) {
        this.name = name;
        this.length = length;
        this.origin = origin;
        System.out.println("River Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Length: " + this.length + " km, Origin: " + this.origin;
    }

    @Override
    public int hashCode() {
        return 64;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof River) {
                System.out.println("Ref is River, compare");
                River river1 = this;
                River river2 = (River) obj;
                if (river1.name.equals(river2.name)
                        && river1.length == river2.length
                        && river1.origin.equals(river2.origin)) {
                    System.out.println("Both River objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
