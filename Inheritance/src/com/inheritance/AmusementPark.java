package com.inheritance;

public class AmusementPark {
    public void enjoy(Ride ride) {
        ride.name();
        ride.speed();
        ride.duration();
        ride.thrillLevel();
        ride.safety();

        if (ride instanceof RollerCoaster) {
            RollerCoaster coaster = (RollerCoaster) ride;
            coaster.loopCount();
        }
    }
}
