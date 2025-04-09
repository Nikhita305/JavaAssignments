package com.xworkz.toStringRep;

public class Astronut {
    private String name;
    private String mission;
    private int age;

    public Astronut(String name, String mission, int age) {
        this.name = name;
        this.mission = mission;
        this.age = age;
        System.out.println("Astronut Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Mission: " + this.mission + ", Age: " + this.age;
    }
}
