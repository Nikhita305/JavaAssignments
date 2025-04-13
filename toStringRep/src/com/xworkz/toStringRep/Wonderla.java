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

    @Override
    public int hashCode() {
        return 67;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Wonderla) {
                System.out.println("Ref is Wonderla, compare");
                Wonderla wonderla1 = this;
                Wonderla wonderla2 = (Wonderla) obj;
                if (wonderla1.location.equals(wonderla2.location)
                        && wonderla1.rides == wonderla2.rides
                        && wonderla1.entryFee == wonderla2.entryFee) {
                    System.out.println("Both Wonderla objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
