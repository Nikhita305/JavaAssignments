package com.xworkz.toStringRep;

public class Box {
    private String material;
    private String color;
    private double weight;

    public Box(String material, String color, double weight) {
        this.material = material;
        this.color = color;
        this.weight = weight;
        System.out.println("Box Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Color: " + this.color + ", Weight: " + this.weight + " kg";
    }

    @Override
    public int hashCode() {
        return 85;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Box) {
                System.out.println("Ref is Box, compare");
                Box Box = this;
                Box box1 = (Box) obj;
                if (Box.material.equals(box1.material)
                        && Box.color.equals(box1.color)
                        && Box.weight == box1.weight) {
                    System.out.println("Both Box objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
