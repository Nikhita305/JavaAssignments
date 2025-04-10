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

    public int hashCode() {
        return 52;
    }
}
