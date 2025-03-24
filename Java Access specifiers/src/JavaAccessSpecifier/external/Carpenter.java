package JavaAccessSpecifier.external;

import JavaAccessSpecifier.internal.Cupboard;

public class Carpenter {
    public void repairCupboard() {
        Cupboard cupboard = new Cupboard();
        System.out.println("Public: " + cupboard.material);
        cupboard.openCupboard();
    }
}
