package com.xworkz.inheritanceTypes.heirarchical;

public class Shark extends Fish {
    private boolean isDangerous;

    public Shark(String species, int age, boolean isDangerous) {
        super(species, age);
        this.isDangerous = isDangerous;
    }

    public boolean isDangerous() {
        return isDangerous;
    }
}

