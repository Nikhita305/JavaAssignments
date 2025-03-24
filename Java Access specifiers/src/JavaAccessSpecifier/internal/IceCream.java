package JavaAccessSpecifier.internal;

public class IceCream {
    public String flavor = "Chocolate";
    private int price = 100;
    String size = "Medium";

    public void serveIceCream() {
        System.out.println("Public: " + flavor);
    }

    private void showPrice() {
        System.out.println("Private: " + price);
    }

    void showSize() {
        System.out.println("Default: " + size);
    }
}
