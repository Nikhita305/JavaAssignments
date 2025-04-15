package com.xworkz.inheritanceTypes.heirarchical;

public class Goldfish extends Fish {
    private String color;

    public Goldfish(String species, int age, String color) {
        super(species, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

