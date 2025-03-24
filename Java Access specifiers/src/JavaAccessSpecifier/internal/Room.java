package JavaAccessSpecifier.internal;

public class Room {
    public void displayCupboardInfo() {
        Cupboard cupboard = new Cupboard();
        System.out.println("Public: " + cupboard.material);
        cupboard.openCupboard();
        System.out.println("Default: " + cupboard.color);
        cupboard.showColor();
    }
}
