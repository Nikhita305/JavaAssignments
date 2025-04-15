package com.xworkz.inheritanceTypes.multiLevel;

public class StormySky extends CloudySky {
    private boolean isThunderstorm;

    public StormySky(String color, int cloudDensity, boolean isThunderstorm) {
        super(color, cloudDensity);
        this.isThunderstorm = isThunderstorm;
    }

    public boolean isThunderstorm() {
        return isThunderstorm;
    }
}
