package com.inheritance;

public class Galaxy {
    public Galaxy() {
        System.out.println("Running no-arg constructor of Galaxy");
    }

    public void rotate() {
        System.out.println("Galaxy rotates around its center");
    }

    public void expand() {
        System.out.println("Galaxy is expanding over time");
    }

    public void containStars() {
        System.out.println("Galaxy contains billions of stars");
    }

    public void emitLight() {
        System.out.println("Galaxy emits light from its stars");
    }

    public void hasBlackHole() {
        System.out.println("Galaxy may contain a supermassive black hole");
    }
}
