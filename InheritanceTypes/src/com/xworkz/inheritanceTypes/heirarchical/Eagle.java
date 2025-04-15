package com.xworkz.inheritanceTypes.heirarchical;

public class Eagle extends Bird {
    private boolean canHunt;

    public Eagle(String name, double wingspan, boolean canHunt) {
        super(name, wingspan);
        this.canHunt = canHunt;
    }

    public boolean canHunt() {
        return canHunt;
    }
}
