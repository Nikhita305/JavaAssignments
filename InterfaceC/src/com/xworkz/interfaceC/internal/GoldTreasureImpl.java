package com.xworkz.interfaceC.internal;

public class GoldTreasureImpl implements Treasure {
    public GoldTreasureImpl() {
        super();
        System.out.println("no-arg constr in GoldTreasureImpl");
    }

    @Override
    public void discover() {
        System.out.println("Discovering Gold Treasure in GoldTreasureImpl");
    }
}
