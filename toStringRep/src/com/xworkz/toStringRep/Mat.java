package com.xworkz.toStringRep;

public class Mat {
    private String material;
    private String color;
    private double length;

    public Mat(String material, String color, double length) {
        this.material = material;
        this.color = color;
        this.length = length;
        System.out.println("Mat Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Color: " + this.color + ", Length: " + this.length + " ft";
    }

    @Override
    public int hashCode() {
        return 46;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Mat) {
                System.out.println("Ref,compare");
                Mat mat = this;
                Mat mat1 = (Mat) obj;
                if (mat.material.equals(mat1.material) && mat.color.equals(mat1.color)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
