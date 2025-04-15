package com.xworkz.inheritanceTypes.heirarchical;

public class Wood {
    private String type;
    private double weight;

    public Wood(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }
}
