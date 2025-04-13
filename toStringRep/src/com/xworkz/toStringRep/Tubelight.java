package com.xworkz.toStringRep;

public class Tubelight {
    private String brand;
    private int length;
    private int wattage;

    public Tubelight(String brand, int length, int wattage) {
        this.brand = brand;
        this.length = length;
        this.wattage = wattage;
        System.out.println("Tubelight Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Length: " + this.length + " inches, Wattage: " + this.wattage + "W";
    }

    @Override
    public int hashCode() {
        return 14;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Tubelight) {
                System.out.println("Ref,compare");
                Tubelight t1 = this;
                Tubelight t2 = (Tubelight) obj;
                if (t1.brand.equals(t2.brand)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
