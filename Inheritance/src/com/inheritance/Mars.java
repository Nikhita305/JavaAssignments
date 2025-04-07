package com.inheritance;

public class Mars {
    public void size(Planet planet){
        planet.temperature();
        planet.atmosphere();
        planet.revolve();
        planet.rotate();
        planet.supportLife();

        if(planet instanceof Earth){
            Earth earth = (Earth) planet;
            earth.humidity();
        }
    }
}
