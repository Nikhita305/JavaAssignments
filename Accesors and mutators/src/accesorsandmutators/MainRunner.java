package accesorsandmutators;

import accesorsandmutators.external.Criminals;
import accesorsandmutators.internal.Jail;

public class MainRunner {

    public static void main(String[] args) {
        Jail jail1 = new Jail("Av", "Mandya", "Bhima", 30);
        Jail jail2 = new Jail("Av", "Kolara", "Pina", 40);

        Jail[] jails = { jail1, jail2 };

        Criminals criminals = new Criminals();
        criminals.displayJails(jails);
        criminals.displayJail(jail1);
        criminals.corruption();
        criminals.murder();
    }
}