package com.xworkz.toStringRep;

public class Gun {
    private String model;
    private String type;
    private int capacity;

    public Gun(String model, String type, int capacity) {
        this.model = model;
        this.type = type;
        this.capacity = capacity;
        System.out.println("Gun Constructor");
    }

    @Override
    public String toString() {
        return "Model: " + this.model + ", Type: " + this.type + ", Capacity: " + this.capacity + " rounds";
    }

    @Override
    public int hashCode() {
        return 38;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Gun) {
                System.out.println("Ref,compare");
                Gun gun = this;
                Gun gun1 = (Gun) obj;
                if (gun.model.equals(gun1.model) && gun.type.equals(gun1.type)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
