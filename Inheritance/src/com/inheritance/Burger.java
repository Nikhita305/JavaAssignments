package com.inheritance;

public class Burger {
    public void price(Food food){
        food.eat();
        food.serve();
        food.prepare();
        food.cleanUp();
        food.cook();

        if(food instanceof Pizza){
            Pizza pizza = (Pizza) food;
            pizza.taste();
        }
    }
}
