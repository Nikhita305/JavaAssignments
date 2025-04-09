package com.xworkz.toStringRep;

public class Weather {
    private String condition;
    private double temperature;
    private String location;

    public Weather(String condition, double temperature, String location) {
        this.condition = condition;
        this.temperature = temperature;
        this.location = location;
        System.out.println("Weather Constructor");
    }

    @Override
    public String toString() {
        return "Condition: " + this.condition + ", Temperature: " + this.temperature + "°C, Location: " + this.location;
    }
}
