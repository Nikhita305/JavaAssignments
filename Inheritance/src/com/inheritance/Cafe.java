package com.inheritance;

public class Cafe {
    public void serve(Beverage beverage) {
        beverage.name();
        beverage.temperature();
        beverage.ingredients();
        beverage.taste();
        beverage.occasion();

        if (beverage instanceof BubbleTea) {
            BubbleTea bubbleTea = (BubbleTea) beverage;
            bubbleTea.strawType();
        }
    }
}
