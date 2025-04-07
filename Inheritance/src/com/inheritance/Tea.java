package com.inheritance;

public class Tea {
    public void taste(Drink drink){
        drink.taste();
        drink.pack();
        drink.prepare();
        drink.serve();
        drink.temperature();

        if(drink instanceof Coffee){
            Coffee coffee = (Coffee) drink;
            coffee.unPack();
        }
    }
}
