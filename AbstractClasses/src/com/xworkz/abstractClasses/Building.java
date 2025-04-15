package com.xworkz.abstractClasses;

public abstract class Building {
    String name;
    String type;
    int floors;
    double area;

    Building(String name, String type, int floors, double area) {
        this.name = name;
        this.type = type;
        this.floors = floors;
        this.area = area;
    }

    Building(String name, String type) {
        this.name = name;
        this.type = type;
        this.floors = 0;
        this.area = 0.0;
    }

    Building(int floors, double area) {
        this.name = "Unknown";
        this.type = "Unknown";
        this.floors = floors;
        this.area = area;
    }

    void displayArea() {
        System.out.println("Area: " + area);
    }
}

