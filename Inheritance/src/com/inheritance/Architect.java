package com.inheritance;

public class Architect {
    public void design(Building building) {
        building.construct();
        building.open();
        building.renovate();
        building.clean();
        building.lock();

        if (building instanceof Temple) {
            Temple temple = (Temple) building;
            temple.pray();
        }
    }
}
