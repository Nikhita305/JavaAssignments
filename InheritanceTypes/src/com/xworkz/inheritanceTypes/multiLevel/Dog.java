package com.xworkz.inheritanceTypes.multiLevel;

public class Dog extends Mammal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
