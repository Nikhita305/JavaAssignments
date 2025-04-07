package com.inheritance;

public class Hydrologist {
    public void research(River river) {
        river.name();
        river.length();
        river.origin();
        river.flowDirection();
        river.importance();

        if (river instanceof Ganga) {
            Ganga ganga = (Ganga) river;
            ganga.cleanUpMission();
        }
    }
}
