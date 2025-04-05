package com.inheritance;

public class Food {
    public Food() {
        System.out.println("Running no-arg constructor of Food");
    }

    public void prepare() {
        System.out.println("Preparing food");
    }

    public void cook() {
        System.out.println("Cooking food");
    }

    public void serve() {
        System.out.println("Serving food");
    }

    public void eat() {
        System.out.println("Eating food");
    }

    public void cleanUp() {
        System.out.println("Cleaning up after eating");
    }
}
