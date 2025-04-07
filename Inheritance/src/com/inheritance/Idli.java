package com.inheritance;

public class Idli {
    public void quality(Breakfast breakfast){
        breakfast.eat();
        breakfast.cleanUp();
        breakfast.prepare();
        breakfast.serve();
        breakfast.price();

        if(breakfast instanceof Dosa){
            Dosa dosa = (Dosa)breakfast;
            dosa.color();
        }
    }
}
