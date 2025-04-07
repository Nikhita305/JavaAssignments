package com.inheritance;

public class Onam {
    public void eat(Festival festival){
        festival.celebrate();
        festival.decorate();
        festival.eat();
        festival.enjoy();
        festival.gather();

        if(festival instanceof Diwali){
            Diwali diwali = (Diwali) festival;
            diwali.fire();
        }
    }
}
