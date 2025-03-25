package accesorsandmutators.external;


import accesorsandmutators.internal.Alien;

public class Researcher {

    public Researcher() {
        System.out.println("No-argument constructor running in Researcher");
    }

    public void analyze(Alien alien) {
        System.out.println("Analyzing Alien Encounter...");
        if (alien != null) {
            alien.display();
        }
    }

    public void report(Alien[] aliens) {
        System.out.println("Generating Alien Encounter Reports...");
        if (aliens != null) {
            for (Alien alien : aliens) {
                alien.display();
            }
        }
    }
}
