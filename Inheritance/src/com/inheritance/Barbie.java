package com.inheritance;

public class Barbie {
    public void dressUp(Cartoon cartoon){
        cartoon.display();
        cartoon.run();
        cartoon.entertain();
        cartoon.speak();
        cartoon.jump();

        if(cartoon instanceof Doremon){
            Doremon doremon = (Doremon) cartoon;
            doremon.jump();
        }
    }
}
