package com.inheritance;

public class Jasmin {
    public void smell(Plant plant){
        plant.absorbWater();
        plant.grow();
        plant.photosynthesize();
        plant.reproduce();
        plant.reproduce();

        if(plant instanceof Sunflower){
            Sunflower sunflower= (Sunflower) plant;
            sunflower.color();
        }
    }
}
