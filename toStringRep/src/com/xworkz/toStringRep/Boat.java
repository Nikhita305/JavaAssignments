package com.xworkz.toStringRep;

public class Boat {
    private String type;
    private String color;
    private int capacity;

    public Boat(String type, String color, int capacity) {
        this.type = type;
        this.color = color;
        this.capacity = capacity;
        System.out.println("Boat Constructor");
    }

    @Override
    public String toString() {
        return "Type: " + this.type + ", Color: " + this.color + ", Capacity: " + this.capacity + " people";
    }

    @Override
    public int hashCode() {
        return 17;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Boat) {
                System.out.println("Ref,compare");
                Boat boat = this;
                Boat boat1 = (Boat) obj;
                if (boat.type.equals(boat1.type)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
