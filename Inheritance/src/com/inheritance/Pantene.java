package com.inheritance;

public class Pantene {
    public void smell(Shampoo shampoo){
        shampoo.pack();
        shampoo.apply();
        shampoo.foam();
        shampoo.fragrance();
        shampoo.rinse();

        if(shampoo instanceof BBlunt){
            BBlunt bBlunt = (BBlunt) shampoo;
            bBlunt.unPack();
        }
    }
}
