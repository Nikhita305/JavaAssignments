package com.xworkz.abstractClasses;

public class House extends Building {

    public House(String name, String type, int floors, double area) {
        super(name, type, floors, area);
    }

    public House(String name, String type) {
        super(name, type);
    }

    public House(int floors, double area) {
        super(floors, area);
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Floors: " + floors);
    }
}
