package com.inheritance;

public class Plant {
    public Plant() {
        System.out.println("Running no-arg constructor of Plant");
    }

    public void grow() {
        System.out.println("Plant is growing towards the sunlight");
    }

    public void absorbWater() {
        System.out.println("Plant absorbs water through roots");
    }

    public void photosynthesize() {
        System.out.println("Plant performs photosynthesis");
    }

    public void reproduce() {
        System.out.println("Plant reproduces via seeds or spores");
    }

    public void survive() {
        System.out.println("Plant adapts to its environment to survive");
    }
}
