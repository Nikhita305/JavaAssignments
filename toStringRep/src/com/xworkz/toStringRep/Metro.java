package com.xworkz.toStringRep;

public class Metro {
    private String city;
    private int coaches;
    private double fare;

    public Metro(String city, int coaches, double fare) {
        this.city = city;
        this.coaches = coaches;
        this.fare = fare;
        System.out.println("Metro Constructor");
    }

    @Override
    public String toString() {
        return "City: " + this.city + ", Coaches: " + this.coaches + ", Fare: ₹" + this.fare;
    }
}
