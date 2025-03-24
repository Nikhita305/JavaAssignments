package JavaAccessSpecifier.external;

import JavaAccessSpecifier.internal.Tree;

public class Gardener {
    public void plantTree() {
        Tree tree = new Tree();
        System.out.println("Public: " + tree.treeName);
        tree.grow();
    }
}
