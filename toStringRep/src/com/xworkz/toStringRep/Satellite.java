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
}
