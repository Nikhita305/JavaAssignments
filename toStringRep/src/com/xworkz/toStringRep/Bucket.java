package com.xworkz.toStringRep;

public class Bucket {
    private String material;
    private double capacity;
    private String color;

    public Bucket(String material, double capacity, String color) {
        this.material = material;
        this.capacity = capacity;
        this.color = color;
        System.out.println("Bucket Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Capacity: " + this.capacity + " L, Color: " + this.color;
    }

    @Override
    public int hashCode() {
        return 89;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Bucket) {
                System.out.println("Ref is Bucket, compare");
                Bucket Bucket = this;
                Bucket bucket1 = (Bucket) obj;
                if (Bucket.material.equals(bucket1.material)
                        && Bucket.capacity == bucket1.capacity
                        && Bucket.color.equals(bucket1.color)) {
                    System.out.println("Both Bucket objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
