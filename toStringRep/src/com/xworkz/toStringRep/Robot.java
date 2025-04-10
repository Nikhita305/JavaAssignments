package com.xworkz.toStringRep;

public class Robot {
    private String name;
    private String type;
    private int batteryLife;

    public Robot(String name, String type, int batteryLife) {
        this.name = name;
        this.type = type;
        this.batteryLife = batteryLife;
        System.out.println("Robot Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Type: " + this.type + ", Battery Life: " + this.batteryLife + " hours";
    }

    @Override
    public int hashCode() {
        return 10;
    }
}
