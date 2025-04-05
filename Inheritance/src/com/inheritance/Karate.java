package com.inheritance;

public class Karate extends MartialArt {
    public Karate() {
        System.out.println("Karate constructor called");
    }

    @Override
    public void stance() {
        System.out.println("Uses kiba-dachi, zenkutsu-dachi, and more.");
    }

    @Override
    public void discipline() {
        System.out.println("Follows a strict code of respect and focus.");
    }

    @Override
    public void technique() {
        System.out.println("Includes punches, kicks, and katas.");
    }

    @Override
    public void training() {
        System.out.println("Practiced in dojos with belts ranking system.");
    }

    @Override
    public void purpose() {
        System.out.println("Promotes physical fitness, defense, and inner peace.");
    }
}
