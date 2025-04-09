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
}
