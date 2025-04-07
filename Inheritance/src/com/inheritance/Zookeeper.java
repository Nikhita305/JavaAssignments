package com.inheritance;

public class Zookeeper {
    public void observe(Animal animal) {
        animal.eat();
        animal.sleep();
        animal.move();
        animal.sound();
        animal.habitat();

        if (animal instanceof Tiger) {
            Tiger tiger = (Tiger) animal;
            tiger.stripePattern();
        }
    }
}
