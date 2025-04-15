package com.xworkz.abstractClasses;

public abstract class Food {
    String name;
    String type;
    int price;

    Food(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    void showPrice() {
        System.out.println("Price: " + price);
    }
}

