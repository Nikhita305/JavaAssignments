package com.inheritance;

public class Yoga extends Activity {
    public Yoga() {
        System.out.println("Yoga constructor called");
    }

    @Override
    public void start() {
        System.out.println("Begin with deep breathing and focus.");
    }

    @Override
    public void perform() {
        System.out.println("Flow through asanas like Surya Namaskar.");
    }

    @Override
    public void benefit() {
        System.out.println("Improves flexibility, strength, and peace of mind.");
    }

    @Override
    public void duration() {
        System.out.println("Typically lasts 30 to 60 minutes.");
    }

    @Override
    public void end() {
        System.out.println("Finish with Shavasana and meditation.");
    }
}
