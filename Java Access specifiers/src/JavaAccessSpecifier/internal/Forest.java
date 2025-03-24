package JavaAccessSpecifier.internal;

public class Forest {
    public void displayTreeInfo() {
        Tree tree = new Tree();
        System.out.println("Public: " + tree.treeName);
        tree.grow();
        System.out.println("Default: " + tree.location);
        tree.showLocation();
    }
}
