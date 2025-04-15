package com.xworkz.inheritanceTypes.heirarchical;

public class Wall {
    private String material;
    private double height;

    public Wall(String material, double height) {
        this.material = material;
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public double getHeight() {
        return height;
    }
}
