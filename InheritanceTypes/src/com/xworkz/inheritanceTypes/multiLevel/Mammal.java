package com.xworkz.inheritanceTypes.multiLevel;

public class Mammal extends Animal {
    private int age;

    public Mammal(String name, int age) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

