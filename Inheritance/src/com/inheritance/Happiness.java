package com.inheritance;

public class Happiness extends Emotion {
    public Happiness() {
        System.out.println("Running no-arg constructor of Happiness");
    }

    @Override
    public void type() {
        System.out.println("Happiness is a positive emotion");
    }

    @Override
    public void expression() {
        System.out.println("Happiness is shown by smiling, laughing, and joy");
    }

    @Override
    public void impact() {
        System.out.println("Happiness boosts health and relationships");
    }

    @Override
    public void duration() {
        System.out.println("Happiness can be momentary or long-lasting");
    }

    @Override
    public void intensity() {
        System.out.println("Happiness can range from contentment to euphoria");
    }
}
