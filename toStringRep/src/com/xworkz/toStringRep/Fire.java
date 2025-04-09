package com.xworkz.toStringRep;

public class Fire {
    private String source;
    private String color;
    private int temperature;

    public Fire(String source, String color, int temperature) {
        this.source = source;
        this.color = color;
        this.temperature = temperature;
        System.out.println("Fire Constructor");
    }

    @Override
    public String toString() {
        return "Source: " + this.source + ", Color: " + this.color + ", Temperature: " + this.temperature + "°C";
    }
}
