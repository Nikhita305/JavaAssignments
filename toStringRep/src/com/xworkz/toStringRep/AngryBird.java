package com.xworkz.toStringRep;

public class AngryBird {
    private String name;
    private String color;
    private String power;

    public AngryBird(String name, String color, String power) {
        this.name = name;
        this.color = color;
        this.power = power;
        System.out.println("AngryBird Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Color: " + this.color + ", Power: " + this.power;
    }
}
