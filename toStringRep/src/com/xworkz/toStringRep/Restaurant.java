package com.xworkz.toStringRep;

public class Restaurant {
    private String name;
    private String cuisine;
    private double rating;

    public Restaurant(String name, String cuisine, double rating) {
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
        System.out.println("Restaurant Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Cuisine: " + this.cuisine + ", Rating: " + this.rating + "⭐";
    }
}
