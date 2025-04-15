package com.xworkz.inheritanceTypes.heirarchical;

public class Superhero extends Cartoon {
    private String superpower;

    public Superhero(String name, int releaseYear, String superpower) {
        super(name, releaseYear);
        this.superpower = superpower;
    }

    public String getSuperpower() {
        return superpower;
    }
}

