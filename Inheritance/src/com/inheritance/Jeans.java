package com.inheritance;

public class Jeans extends Dress {
    public Jeans() {
        System.out.println("Running no-arg constructor of Jeans");
    }

    @Override
    public void wear() {
        System.out.println("Wearing the jeans");
    }

    @Override
    public void wash() {
        System.out.println("Washing the jeans in cold water");
    }

    @Override
    public void fold() {
        System.out.println("Folding the jeans neatly");
    }

    @Override
    public void iron() {
        System.out.println("Ironing the jeans at medium heat");
    }

    @Override
    public void pack() {
        System.out.println("Packing the jeans in a travel bag");
    }

    public void unPack() {
        System.out.println("Unpacking the jeans in a travel bag");
    }


}
