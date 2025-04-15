package com.xworkz.inheritanceTypes.heirarchical;

public class Villain extends Cartoon {
    private String evilPlan;

    public Villain(String name, int releaseYear, String evilPlan) {
        super(name, releaseYear);
        this.evilPlan = evilPlan;
    }

    public String getEvilPlan() {
        return evilPlan;
    }
}

