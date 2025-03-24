package JavaAccessSpecifier;

import JavaAccessSpecifier.external.Carpenter;
import JavaAccessSpecifier.internal.Room;

public class CupboardRunner {
    public static void main(String[] args) {
        System.out.println("**********");
        Room room = new Room();
        room.displayCupboardInfo();

        System.out.println("*********");
        Carpenter carpenter = new Carpenter();
        carpenter.repairCupboard();
    }
}
