package com.xworkz.inheritanceTypes.heirarchical;

public class Cat extends Animal {
    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
