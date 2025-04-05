package com.inheritance;

public class Engineering extends Profession {
    public Engineering() {
        System.out.println("Running no-arg constructor of Engineering");
    }

    @Override
    public void type() {
        System.out.println("Engineering is a technical profession");
    }

    @Override
    public void skill() {
        System.out.println("Engineers need analytical and problem-solving skills");
    }

    @Override
    public void workHours() {
        System.out.println("Engineers typically work 9 to 6 or in shifts");
    }

    @Override
    public void income() {
        System.out.println("Engineering offers varied income based on field");
    }

    @Override
    public void responsibility() {
        System.out.println("Engineers are responsible for designing and building systems");
    }
}
