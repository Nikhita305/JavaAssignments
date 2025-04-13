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

    @Override
    public int hashCode() {
        return 24;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Weather) {
                System.out.println("Ref,compare");
                Weather weather = this;
                Weather weather1 = (Weather) obj;
                if (weather.condition.equals(weather1.condition)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }

}
