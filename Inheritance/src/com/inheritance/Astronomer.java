package com.inheritance;

public class Astronomer {
    public void study(Galaxy galaxy) {
        galaxy.rotate();
        galaxy.expand();
        galaxy.containStars();
        galaxy.emitLight();
        galaxy.hasBlackHole();

        if (galaxy instanceof MilkyWay) {
            MilkyWay milkyWay = (MilkyWay) galaxy;
            milkyWay.nameOrigin();
        }
    }
}
