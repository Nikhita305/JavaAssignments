package com.xworkz.toStringRep;

public class Satellite {
    private String name;
    private String country;
    private int launchYear;

    public Satellite(String name, String country, int launchYear) {
        this.name = name;
        this.country = country;
        this.launchYear = launchYear;
        System.out.println("Satellite Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Country: " + this.country + ", Launch Year: " + this.launchYear;
    }

    @Override
    public int hashCode() {
        return 35;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Satellite) {
                System.out.println("Ref,compare");
                Satellite satellite = this;
                Satellite satellite1 = (Satellite) obj;
                if (satellite.name.equals(satellite1.name) && satellite.country.equals(satellite1.country)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
