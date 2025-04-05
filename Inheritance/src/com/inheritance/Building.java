package com.inheritance;

public class Building {
    public Building() {
        System.out.println("Running no-arg constructor of Building");
    }

    public void construct() {
        System.out.println("Building is under construction");
    }

    public void open() {
        System.out.println("Building is now open");
    }

    public void renovate() {
        System.out.println("Building is being renovated");
    }

    public void clean() {
        System.out.println("Building is being cleaned");
    }

    public void lock() {
        System.out.println("Building is now locked");
    }
}
