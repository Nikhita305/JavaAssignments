package com.xworkz.inheritanceTypes.multiLevel;

public class CloudySky extends Sky {
    private int cloudDensity;

    public CloudySky(String color, int cloudDensity) {
        super(color);
        this.cloudDensity = cloudDensity;
    }

    public int getCloudDensity() {
        return cloudDensity;
    }
}
