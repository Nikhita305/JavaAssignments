package com.xworkz.toStringRep;

public class Auditorium {
    private String name;
    private int capacity;
    private String location;

    public Auditorium(String name, int capacity, String location) {
        this.name = name;
        this.capacity = capacity;
        this.location = location;
        System.out.println("Auditorium Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Capacity: " + this.capacity + " seats, Location: " + this.location;
    }

    @Override
    public int hashCode() {
        return 76;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Auditorium) {
                System.out.println("Ref is Auditorium, compare");
                Auditorium auditorium1 = this;
                Auditorium auditorium2 = (Auditorium) obj;
                if (auditorium1.name.equals(auditorium2.name)
                        && auditorium1.capacity == auditorium2.capacity
                        && auditorium1.location.equals(auditorium2.location)) {
                    System.out.println("Both Auditorium objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
