package accesorsandmutators;

import accesorsandmutators.external.Operations;
import accesorsandmutators.internal.Satellite;
import accesorsandmutators.internal.Type;

public class SatelliteRunner {
    public static void main(String[] args) {
        Satellite satellite1 = new Satellite(Type.MILITARY, "30M", 5000, 3000);
        Satellite satellite2 = new Satellite(Type.SCIENTIFIC, "300M", 500000, 300000);

        Satellite[] satellites = {satellite1, satellite2};

        Operations operations = new Operations();
        operations.schedule();
        operations.test();
        operations.operate(satellites);
        operations.improvise(satellite1);
    }
}
