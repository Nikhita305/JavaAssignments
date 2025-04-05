package com.inheritance;

public class Max extends Brand {
    public Max() {
        System.out.println("🛍️ Welcome to Max Fashion!");
    }

    @Override
    public void name() {
        System.out.println("Brand Name: Max");
    }

    @Override
    public void products() {
        System.out.println("Products: Casual wear, ethnic, footwear, and accessories.");
    }

    @Override
    public void targetAudience() {
        System.out.println("Audience: Men, women, and kids.");
    }

    @Override
    public void quality() {
        System.out.println("Max offers affordable yet quality fashion.");
    }

    @Override
    public void popularity() {
        System.out.println("Max is popular across malls and cities.");
    }
}
