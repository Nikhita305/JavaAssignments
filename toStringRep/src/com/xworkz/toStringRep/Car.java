package com.xworkz.toStringRep;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        System.out.println("Car Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Model: " + this.model + ", Year: " + this.year;
    }
}
