package com.inheritance;

public class Refridgerator {
    public void on(Appliance appliance){
        appliance.consumePower();
        appliance.setTimer();
        appliance.showStatus();
        appliance.turnOff();
        appliance.turnOn();

        if(appliance instanceof WashingMachine){
            WashingMachine washingMachine = (WashingMachine) appliance;
            washingMachine.loadClothes();
        }
    }
}
