package com.inheritance;

public class LG extends TV {
    public LG() {
        System.out.println("Running no-arg constructor of LG");
    }

    @Override
    public void brand() {
        System.out.println("This is an LG TV");
    }

    @Override
    public void screenType() {
        System.out.println("LG uses OLED and NanoCell screen technology");
    }

    @Override
    public void resolution() {
        System.out.println("LG TVs support 4K and 8K resolutions");
    }

    @Override
    public void smartFeatures() {
        System.out.println("LG Smart TVs support webOS, apps, and voice control");
    }

    @Override
    public void size() {
        System.out.println("LG TVs are available from 32 to 86 inches");
    }
}
