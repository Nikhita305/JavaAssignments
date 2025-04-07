package com.inheritance;

public class Gardener {
    public void care(Flower flower) {
        flower.bloom();
        flower.smell();
        flower.photosynthesize();
        flower.attractBees();
        flower.wilt();

        if (flower instanceof Rose) {
            Rose rose = (Rose) flower;
            rose.thorns();
        }
    }
}
