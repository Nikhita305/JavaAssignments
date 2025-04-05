package com.inheritance;

public class Planet {
    public Planet() {
        System.out.println("Running no-arg constructor of Planet");
    }

    public void rotate() {
        System.out.println("Planet is rotating on its axis");
    }

    public void revolve() {
        System.out.println("Planet is revolving around a star");
    }

    public void supportLife() {
        System.out.println("Unknown if planet supports life");
    }

    public void temperature() {
        System.out.println("Temperature varies on the planet");
    }

    public void atmosphere() {
        System.out.println("Planet has a unique atmosphere");
    }
}
