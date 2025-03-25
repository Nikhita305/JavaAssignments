package accesorsandmutators.external;

import accesorsandmutators.internal.Satellite;

public class Operations {

    public Operations() {
        System.out.println("No-argument constructor running in Operations");
    }

    public void displaySatellites(Satellite[] satellites) {
        System.out.println("Displaying satellite details...");
        if (satellites != null) {
            for (Satellite satellite : satellites) {
                System.out.println("Type: " + satellite.getType());
                System.out.println("Cost: " + satellite.getCost());
                System.out.println("Weight: " + satellite.getWeight());
                System.out.println("Load Capacity: " + satellite.getLoadCapacity());
                System.out.println("---------------------------");
            }
        }
    }

    public void displaySatellite(Satellite satellite) {
        System.out.println("Displaying");
        if (satellite != null) {
            System.out.println("Type: " + satellite.getType());
            System.out.println("Cost: " + satellite.getCost());
            System.out.println("Weight: " + satellite.getWeight());
            System.out.println("Load Capacity: " + satellite.getLoadCapacity());
        }
    }

    public void schedule() {
        System.out.println("Satellite");
    }

    public void test() {
        System.out.println("satellite components.");
    }

    public void operate(Satellite[] satellites) {
        System.out.println("Operating satellite");
        displaySatellites(satellites);
    }

    public void improvise(Satellite satellite) {
        System.out.println("Improvising satellite");
        displaySatellite(satellite);
    }
}
