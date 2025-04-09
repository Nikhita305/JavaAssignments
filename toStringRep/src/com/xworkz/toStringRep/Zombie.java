package com.xworkz.toStringRep;

public class Zombie {
    private String name;
    private int speed;
    private String origin;

    public Zombie(String name, int speed, String origin) {
        this.name = name;
        this.speed = speed;
        this.origin = origin;
        System.out.println("Zombie Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Speed: " + this.speed + " km/h, Origin: " + this.origin;
    }
}
