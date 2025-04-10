package com.xworkz.toStringRep;

public class Scale {
    private String material;
    private int length;
    private String brand;

    public Scale(String material, int length, String brand) {
        this.material = material;
        this.length = length;
        this.brand = brand;
        System.out.println("Scale Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Length: " + this.length + " cm, Brand: " + this.brand;
    }

    public int hashCode() {
        return 94;
    }
}
