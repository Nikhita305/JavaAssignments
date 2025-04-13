package com.xworkz.toStringRep;

public class Soil {
    private String type;
    private String color;
    private boolean isFertile;

    public Soil(String type, String color, boolean isFertile) {
        this.type = type;
        this.color = color;
        this.isFertile = isFertile;
        System.out.println("Soil Constructor");
    }

    @Override
    public String toString() {
        return "Type: " + this.type + ", Color: " + this.color + ", Is Fertile: " + this.isFertile;
    }

    @Override
    public int hashCode() {
        return 43;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Soil) {
                System.out.println("Ref,compare");
                Soil soil = this;
                Soil soil1 = (Soil) obj;
                if (soil.type.equals(soil1.type) && soil.color.equals(soil1.color)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
