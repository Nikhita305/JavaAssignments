package com.xworkz.toStringRep;

public class Sky {
    private String color;
    private String time;
    private boolean hasClouds;

    public Sky(String color, String time, boolean hasClouds) {
        this.color = color;
        this.time = time;
        this.hasClouds = hasClouds;
        System.out.println("Sky Constructor");
    }

    @Override
    public String toString() {
        return "Color: " + this.color + ", Time: " + this.time + ", Has Clouds: " + this.hasClouds;
    }
}
