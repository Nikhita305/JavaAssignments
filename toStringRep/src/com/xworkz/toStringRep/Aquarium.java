package com.xworkz.toStringRep;

public class Aquarium {
    private String name;
    private int capacity;
    private String location;

    public Aquarium(String name, int capacity, String location) {
        this.name = name;
        this.capacity = capacity;
        this.location = location;
        System.out.println("Aquarium Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Capacity: " + this.capacity + " liters, Location: " + this.location;
    }

    @Override
    public int hashCode() {
        return 78;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Aquarium) {
                System.out.println("Ref is Aquarium, compare");
                Aquarium aquarium1 = this;
                Aquarium aquarium2 = (Aquarium) obj;
                if (aquarium1.name.equals(aquarium2.name)
                        && aquarium1.capacity == aquarium2.capacity
                        && aquarium1.location.equals(aquarium2.location)) {
                    System.out.println("Both Aquarium objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
