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

    @Override
    public int hashCode() {
        return 94;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Scale) {
                System.out.println("Ref is Scale, compare");
                Scale Scale = this;
                Scale scale1 = (Scale) obj;
                if (Scale.material.equals(scale1.material)
                        && Scale.length == scale1.length
                        && Scale.brand.equals(scale1.brand)) {
                    System.out.println("Both Scale objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
