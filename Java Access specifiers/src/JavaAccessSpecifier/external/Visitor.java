package JavaAccessSpecifier.external;

import JavaAccessSpecifier.internal.Zoo;

public class Visitor {
    public void visitZoo() {
        Zoo zoo = new Zoo();
        System.out.println("Public: " + zoo.zooName);
        zoo.openZoo();
    }
}