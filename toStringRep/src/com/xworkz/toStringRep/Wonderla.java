package com.xworkz.toStringRep;

public class Wonderla {
    private String location;
    private int rides;
    private double entryFee;

    public Wonderla(String location, int rides, double entryFee) {
        this.location = location;
        this.rides = rides;
        this.entryFee = entryFee;
        System.out.println("Wonderla Constructor");
    }

    @Override
    public String toString() {
        return "Location: " + this.location + ", Rides: " + this.rides + ", Entry Fee: ₹" + this.entryFee;
    }
}
