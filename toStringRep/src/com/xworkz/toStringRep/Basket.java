package com.xworkz.toStringRep;

public class Basket {
    private String material;
    private String color;
    private int size;

    public Basket(String material, String color, int size) {
        this.material = material;
        this.color = color;
        this.size = size;
        System.out.println("Basket Constructor");
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Color: " + this.color + ", Size: " + this.size;
    }

    @Override
    public int hashCode() {
        return 55;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Basket) {
                System.out.println("Ref,compare");
                Basket basket = this;
                Basket basket1 = (Basket) obj;
                if (basket.material.equals(basket1.material) && basket.color.equals(basket1.color)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
