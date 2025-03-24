package JavaAccessSpecifier;

import JavaAccessSpecifier.external.Visitor;
import JavaAccessSpecifier.internal.Animal;

public class ZooRunner {
    public static void main(String[] args) {
        System.out.println("*********");
        Animal animal = new Animal();
        animal.displayZooInfo();

        System.out.println("***********");
        Visitor visitor = new Visitor();
        visitor.visitZoo();
    }
}
