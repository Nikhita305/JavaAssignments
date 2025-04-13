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

    @Override
    public int hashCode() {
        return 41;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Sky) {
                System.out.println("Ref,compare");
                Sky sky = this;
                Sky sky1 = (Sky) obj;
                if (sky.color.equals(sky1.color) && sky.time.equals(sky1.time)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
