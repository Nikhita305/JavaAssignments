package com.xworkz.toStringRep;

public class Fan {
    private String brand;
    private int speed;
    private String type;

    public Fan(String brand, int speed, String type) {
        this.brand = brand;
        this.speed = speed;
        this.type = type;
        System.out.println("Fan Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Speed: " + this.speed + " RPM, Type: " + this.type;
    }

    @Override
    public int hashCode() {
        return 8;
    }
}
