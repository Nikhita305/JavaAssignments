package com.inheritance;

public class Oregano extends Herb {
    public Oregano() {
        System.out.println("Oregano constructor called");
    }

    @Override
    public void grow() {
        System.out.println("Oregano is spreading as ground cover...");
    }

    @Override
    public void smell() {
        System.out.println("Oregano has a spicy, earthy aroma...");
    }

    @Override
    public void harvest() {
        System.out.println("Harvesting fresh oregano leaves...");
    }

    @Override
    public void dry() {
        System.out.println("Drying oregano in the shade...");
    }

    @Override
    public void use() {
        System.out.println("Sprinkling oregano on pizza and pasta!");
    }
}
