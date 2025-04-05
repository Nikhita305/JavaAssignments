package com.inheritance;

public class Pastel extends Wallpaper {
    public Pastel() {
        System.out.println("🎨 Pastel wallpaper gives soft, dreamy vibes...");
    }

    @Override
    public void design() {
        System.out.println("Design: Minimal, soft colors like baby pink, lavender, mint.");
    }

    @Override
    public void material() {
        System.out.println("Usually lightweight vinyl or matte paper.");
    }

    @Override
    public void purpose() {
        System.out.println("Adds calm and soothing energy to the space.");
    }

    @Override
    public void durability() {
        System.out.println("Delicate but can last long with care.");
    }

    @Override
    public void application() {
        System.out.println("Often peel-and-stick for easy use.");
    }
}
