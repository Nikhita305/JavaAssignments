package com.xworkz.inheritanceTypes.heirarchical;

public class Sparrow extends Bird {
    private boolean canSing;

    public Sparrow(String name, double wingspan, boolean canSing) {
        super(name, wingspan);
        this.canSing = canSing;
    }

    public boolean canSing() {
        return canSing;
    }
}

