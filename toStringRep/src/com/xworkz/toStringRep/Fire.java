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

    @Override
    public int hashCode() {
        return 9;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Fire) {
                System.out.println("Ref,compare");
                Fire fire = this;
                Fire fire1 = (Fire) obj;
                if (fire.source.equals(fire1.source)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
