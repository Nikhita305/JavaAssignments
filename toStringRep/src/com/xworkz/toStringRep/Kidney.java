package com.xworkz.toStringRep;

public class Kidney {
    private String type;
    private String function;
    private double size;

    public Kidney(String type, String function, double size) {
        this.type = type;
        this.function = function;
        this.size = size;
        System.out.println("Kidney Constructor");
    }

    @Override
    public String toString() {
        return "Type: " + this.type + ", Function: " + this.function + ", Size: " + this.size + " cm";
    }

    @Override
    public int hashCode() {
        return 74;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Kidney) {
                System.out.println("Ref is Kidney, compare");
                Kidney kidney1 = this;
                Kidney kidney2 = (Kidney) obj;
                if (kidney1.type.equals(kidney2.type)
                        && kidney1.function.equals(kidney2.function)
                        && kidney1.size == kidney2.size) {
                    System.out.println("Both Kidney objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
