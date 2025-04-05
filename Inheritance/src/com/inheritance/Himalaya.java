package com.inheritance;

public class Himalaya extends Mountain {
    public Himalaya() {
        System.out.println("Running no-arg constructor of Himalaya");
    }

    @Override
    public void name() {
        System.out.println("Himalaya is the highest mountain range in the world");
    }

    @Override
    public void height() {
        System.out.println("Himalayas contain Mount Everest, 8,848 meters high");
    }

    @Override
    public void location() {
        System.out.println("Himalayas stretch across India, Nepal, Bhutan, and China");
    }

    @Override
    public void climate() {
        System.out.println("Himalayas have alpine to arctic climates at higher altitudes");
    }

    @Override
    public void importance() {
        System.out.println("Himalayas regulate monsoons and are a source of major rivers");
    }
}
