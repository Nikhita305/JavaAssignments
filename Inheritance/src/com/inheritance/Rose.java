package com.inheritance;

public class Rose extends Flower {
    public Rose() {
        System.out.println("Running no-arg constructor of Rose");
    }

    @Override
    public void bloom() {
        System.out.println("Rose blooms beautifully with layered petals");
    }

    @Override
    public void smell() {
        System.out.println("Rose emits a strong and sweet fragrance");
    }

    @Override
    public void photosynthesize() {
        System.out.println("Rose converts sunlight into energy using green leaves");
    }

    @Override
    public void attractBees() {
        System.out.println("Rose attracts bees with its bright colors and scent");
    }

    @Override
    public void wilt() {
        System.out.println("Rose wilts after a few days if not cared for");
    }
}
