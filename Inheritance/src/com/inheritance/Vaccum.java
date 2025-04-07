package com.inheritance;

public class Vaccum {
    public void clean(Machine machine){
        machine.maintain();
        machine.stop();
        machine.start();
        machine.process();
        machine.status();

        if(machine instanceof Robot){
            Robot robot =(Robot) machine;
            robot.clean();
        }
    }

}
