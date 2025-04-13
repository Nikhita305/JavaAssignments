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

    @Override
    public int hashCode() {
        return 39;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Restaurant) {
                System.out.println("Ref,compare");
                Restaurant res1 = this;
                Restaurant res2 = (Restaurant) obj;
                if (res1.name.equals(res2.name) && res1.cuisine.equals(res2.cuisine)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
