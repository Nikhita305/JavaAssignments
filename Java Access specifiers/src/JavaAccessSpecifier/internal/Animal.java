package JavaAccessSpecifier.internal;

public class Animal {
    public void displayZooInfo() {
        Zoo zoo = new Zoo();
        System.out.println("Public: " + zoo.zooName);
        zoo.openZoo();
        System.out.println("Default: " + zoo.caretaker);
        zoo.showCaretaker();
    }
}
