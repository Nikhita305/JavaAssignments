package com.inheritance;

public class Rasin {
    public void color(Fruit fruit){
        fruit.color();
        fruit.taste();
        fruit.benefits();
        fruit.season();
        fruit.shape();

        if(fruit instanceof Grape){
            Grape grape = (Grape) fruit;
            grape.shape();
        }
    }
}
