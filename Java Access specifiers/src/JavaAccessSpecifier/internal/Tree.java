package JavaAccessSpecifier.internal;

public class Tree {
    public String treeName = "Coconut";
    private int age = 100;
    String location = "Amazon";

    public void grow() {
        System.out.println("Public:  " + treeName );
    }

    private void ageOfTree() {
        System.out.println("Private: " + age );
    }

    void showLocation() {
        System.out.println("Default: " + location);
    }
}
