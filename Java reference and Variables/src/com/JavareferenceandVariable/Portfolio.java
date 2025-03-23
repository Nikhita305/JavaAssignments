package com.JavareferenceandVariable;

public class Portfolio {
    String name;
    int id;
    String description;
    int budget;

    public Portfolio(String name, int id, String description, int budget) {
        System.out.println("Creating Portfolio object");
        this.name = name;
        this.id = id;
        this.description = description;
        this.budget = budget;
    }

    void display() {
        System.out.println("Portfolio Details:");
        System.out.println("Name: " + this.name + ", ID: " + this.id + ", Description: " + this.description + ", Budget: " + this.budget);
    }
}
