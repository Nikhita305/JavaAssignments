package com.inheritance;

public class JuiceBar {
    public void serve(Juice juice) {
        juice.name();
        juice.fruitUsed();
        juice.taste();
        juice.temperature();
        juice.benefit();

        if (juice instanceof Mango) {
            Mango mango = (Mango) juice;
            mango.pulpContent();
        }
    }
}
