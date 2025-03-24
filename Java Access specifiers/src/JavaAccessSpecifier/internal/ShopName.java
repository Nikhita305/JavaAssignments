package JavaAccessSpecifier.internal;

public class ShopName {
    public void displayIceCreamInfo() {
        IceCream iceCream = new IceCream();
        System.out.println("Public: " + iceCream.flavor);
        iceCream.serveIceCream();
        System.out.println("Default: " + iceCream.size);
        iceCream.showSize();
    }
}
