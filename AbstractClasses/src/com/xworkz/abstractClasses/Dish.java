package com.xworkz.abstractClasses;

public class Dish extends Food {
    Dish(String name, String type, int calories) {
        super(name, type, calories);
    }

    void displayInfo() {
        System.out.println("Food Name: " + name);
        System.out.println("Food Type: " + type);
    }
}

