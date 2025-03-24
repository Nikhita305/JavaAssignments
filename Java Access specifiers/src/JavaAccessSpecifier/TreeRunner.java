package JavaAccessSpecifier;

import JavaAccessSpecifier.external.Gardener;
import JavaAccessSpecifier.internal.Forest;

public class TreeRunner {
    public static void main(String[] args) {
        System.out.println("********");
        Forest forest = new Forest();
        forest.displayTreeInfo();

        System.out.println("*******");
        Gardener gardener = new Gardener();
        gardener.plantTree();
    }
}
