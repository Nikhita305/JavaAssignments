package com.inheritance;

public class Vanilla extends Scent {
    public Vanilla() {
        System.out.println("🍦 Vanilla scent is in the air...");
    }

    @Override
    public void aroma() {
        System.out.println("Sweet, warm, and comforting fragrance.");
    }

    @Override
    public void origin() {
        System.out.println("Extracted from vanilla beans of the orchid plant.");
    }

    @Override
    public void strength() {
        System.out.println("Mild to moderate intensity.");
    }

    @Override
    public void moodEffect() {
        System.out.println("Calms the mind and evokes nostalgia.");
    }

    @Override
    public void use() {
        System.out.println("Popular in candles, body mists, and cozy perfumes.");
    }
}
