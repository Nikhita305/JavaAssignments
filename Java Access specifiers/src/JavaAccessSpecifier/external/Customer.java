package JavaAccessSpecifier.external;

import JavaAccessSpecifier.internal.IceCream;

public class Customer {
    public void buyIceCream() {
        IceCream iceCream = new IceCream();
        System.out.println("Public: " + iceCream.flavor);
        iceCream.serveIceCream();
    }
}
