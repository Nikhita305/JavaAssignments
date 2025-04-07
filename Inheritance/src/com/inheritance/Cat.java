package com.inheritance;

public class Cat extends Pet {
    public Cat() {
        System.out.println("Running no-arg constructor of Cat");
    }

    @Override
    public void name() {
        System.out.println("This pet is a Cat");
    }

    @Override
    public void sound() {
        System.out.println("Cat says Meow");
    }

    @Override
    public void food() {
        System.out.println("Cats like milk, fish, and cat food");
    }

    @Override
    public void activity() {
        System.out.println("Cats love to climb, scratch, and chase");
    }

    @Override
    public void sleep() {
        System.out.println("Cats sleep for around 12-16 hours a day");
    }

    public void purr() {
        System.out.println("Cat is purring softly");
    }

}
