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

    @Override
    public int hashCode() {
        return 34;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Metro) {
                System.out.println("Ref,compare");
                Metro metro = this;
                Metro metro1 = (Metro) obj;
                if (metro.city.equals(metro1.city) && metro.coaches == metro1.coaches) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
