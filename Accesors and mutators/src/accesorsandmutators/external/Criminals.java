package accesorsandmutators.external;

import accesorsandmutators.internal.Jail;

public class Criminals {

    public Criminals() {
        System.out.println("No-argument constructor");
    }

    public void displayJails(Jail[] jails) {
        System.out.println("Displaying jail details...");
        if (jails != null) {
            for (Jail jail : jails) {
                System.out.println("Name: " + jail.getName());
                System.out.println("Location: " + jail.getLocation());
                System.out.println("Jailer: " + jail.getJailerName());
                System.out.println("Total Cells: " + jail.getTotalCells());
                System.out.println("---------------------------");
            }
        }
    }

    public void displayJail(Jail jail) {
        System.out.println("Displaying a single jail detail...");
        if (jail != null) {
            System.out.println("Name: " + jail.getName());
            System.out.println("Location: " + jail.getLocation());
            System.out.println("Jailer: " + jail.getJailerName());
            System.out.println("Total Cells: " + jail.getTotalCells());
        }
    }

    public void corruption() {
        System.out.println("Running corruption case...");
        Jail jail = new Jail("MCD", "Mysuru", "Tina", 50);
        displayJail(jail);
    }

    public void murder() {
        System.out.println("Running murder case...");

        Jail jail1 = new Jail("Central Jail", "Bengaluru", "Rampa", 100);
        Jail jail2 = new Jail("District Jail", "Bengaluru", "Rampa", 100);

        Jail[] jails = { jail1, jail2 };
        displayJails(jails);
    }
}
