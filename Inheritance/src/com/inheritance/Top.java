package com.inheritance;

public class Top {
    public void design(Dress dress){
        dress.fold();
        dress.iron();
        dress.pack();
        dress.wash();
        dress.wear();

        if(dress instanceof Jeans){
            Jeans jeans = (Jeans) dress;
            jeans.unPack();
        }
    }
}
