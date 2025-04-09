package com.xworkz.toStringRep;

public class Theater {
    private String name;
    private int screens;
    private String location;

    public Theater(String name, int screens, String location) {
        this.name = name;
        this.screens = screens;
        this.location = location;
        System.out.println("Theater Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Screens: " + this.screens + ", Location: " + this.location;
    }
}
