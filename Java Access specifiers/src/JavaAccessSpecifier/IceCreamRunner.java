package JavaAccessSpecifier;

import JavaAccessSpecifier.external.Customer;
import JavaAccessSpecifier.internal.ShopName;

public class IceCreamRunner {
    public static void main(String[] args) {
        System.out.println("*******");
        ShopName shop = new ShopName();
        shop.displayIceCreamInfo();

        System.out.println("*********");
        Customer customer = new Customer();
        customer.buyIceCream();
    }
}
