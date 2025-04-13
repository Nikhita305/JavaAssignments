package com.xworkz.toStringRep;

public class Cotton {
    private String quality;
    private String origin;
    private double weight;

    public Cotton(String quality, String origin, double weight) {
        this.quality = quality;
        this.origin = origin;
        this.weight = weight;
        System.out.println("Cotton Constructor");
    }

    @Override
    public String toString() {
        return "Quality: " + this.quality + ", Origin: " + this.origin + ", Weight: " + this.weight + " grams";
    }

    @Override
    public int hashCode() {
        return 52;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Cotton) {
                System.out.println("Ref,compare");
                Cotton cotton = this;
                Cotton cotton1 = (Cotton) obj;
                if (cotton.quality.equals(cotton1.quality) && cotton.origin.equals(cotton1.origin)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
