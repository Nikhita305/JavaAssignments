package accesorsandmutators;

import accesorsandmutators.external.Researcher;
import accesorsandmutators.internal.Alien;

public class AlienRunner {
    public static void main(String[] args) {
        Alien alien1 = new Alien("Ram", "2025-03-25", "large eyes");
        Alien alien2 = new Alien("Sham", "2025-03-24", "Blue Color");

        Alien[] aliens = {alien1, alien2};

        Researcher researcher = new Researcher();
        researcher.analyze(alien1);
        researcher.report(aliens);
    }
}
