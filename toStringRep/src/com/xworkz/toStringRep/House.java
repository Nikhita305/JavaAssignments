package com.xworkz.toStringRep;

public class House {
    private String style;
    private int floors;
    private boolean hasGarden;

    public House(String style, int floors, boolean hasGarden) {
        this.style = style;
        this.floors = floors;
        this.hasGarden = hasGarden;
        System.out.println("House Constructor");
    }

    @Override
    public String toString() {
        return "Style: " + this.style + ", Floors: " + this.floors + ", Has Garden: " + this.hasGarden;
    }

    @Override
    public int hashCode() {
        return 45;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof House) {
                System.out.println("Ref,compare");
                House house = this;
                House house1 = (House) obj;
                if (house.style.equals(house1.style) && house.floors == house1.floors) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
