package com.xworkz.toStringRep;

public class Mars {
    private String color;
    private double distance;
    private boolean hasLife;

    public Mars(String color, double distance, boolean hasLife) {
        this.color = color;
        this.distance = distance;
        this.hasLife = hasLife;
        System.out.println("Mars Constructor");
    }

    @Override
    public String toString() {
        return "Color: " + this.color + ", Distance from Earth: " + this.distance + " million km, Has Life: " + this.hasLife;
    }

    @Override
    public int hashCode() {
        return 61;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Mars) {
                System.out.println("Ref is Mars, compare");
                Mars mars1 = this;
                Mars mars2 = (Mars) obj;
                if (mars1.color.equals(mars2.color) && mars1.distance == mars2.distance && mars1.hasLife == mars2.hasLife) {
                    System.out.println("Both Mars objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
