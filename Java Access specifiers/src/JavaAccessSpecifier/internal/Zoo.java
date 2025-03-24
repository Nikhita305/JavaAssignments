package JavaAccessSpecifier.internal;

public class Zoo {
    public String zooName = "Wild Safari Zoo";
    private int totalAnimals = 150;
    String caretaker = "Mr. Robert";

    public void openZoo() {
        System.out.println("Public: " + zooName );
    }

    private void countAnimals() {
        System.out.println("Private:" + totalAnimals);
    }

    void showCaretaker() {
        System.out.println("Default:" + caretaker);
    }
}
