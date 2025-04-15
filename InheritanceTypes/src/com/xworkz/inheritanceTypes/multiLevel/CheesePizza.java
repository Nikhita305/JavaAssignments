package com.xworkz.inheritanceTypes.multiLevel;

public class CheesePizza  extends Pizza {
    private boolean extraCheese;

    public CheesePizza(String name, String size, boolean extraCheese) {
        super(name, size);
        this.extraCheese = extraCheese;
    }

    public boolean hasExtraCheese() {
        return extraCheese;
    }
}
