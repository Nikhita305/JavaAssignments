package com.inheritance;

public class Arabian {
    public void wave(Ocean ocean){
        ocean.temperature();
        ocean.biodiversity();
        ocean.currents();
        ocean.waves();
        ocean.depth();

        if(ocean instanceof Pacific){
            Pacific pacific = (Pacific) ocean;
            pacific.color();
        }
    }
}
