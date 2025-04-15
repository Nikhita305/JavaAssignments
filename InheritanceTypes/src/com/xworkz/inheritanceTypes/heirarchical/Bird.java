package com.xworkz.inheritanceTypes.heirarchical;

public class Bird {
    private String name;
    private double wingspan;

    public Bird(String name, double wingspan) {
        this.name = name;
        this.wingspan = wingspan;
    }

    public String getName() {
        return name;
    }

    public double getWingspan() {
        return wingspan;
    }
}
