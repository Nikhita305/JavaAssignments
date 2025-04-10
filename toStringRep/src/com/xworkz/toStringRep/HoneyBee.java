package com.xworkz.toStringRep;

public class HoneyBee {
    private String species;
    private double wingSpan;
    private String hiveLocation;

    public HoneyBee(String species, double wingSpan, String hiveLocation) {
        this.species = species;
        this.wingSpan = wingSpan;
        this.hiveLocation = hiveLocation;
        System.out.println("HoneyBee Constructor");
    }

    @Override
    public String toString() {
        return "Species: " + this.species + ", Wing Span: " + this.wingSpan + " cm, Hive Location: " + this.hiveLocation;
    }

    public int hashCode() {
        return 80;
    }
}
