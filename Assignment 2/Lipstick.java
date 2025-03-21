class Lipstick {
    public static void apply1() {
        System.out.println("Apply lipstick");
        remove2();
        Brand.show1();
        Wallet.type1();
    }

    public static void remove2() {
        System.out.println("Remove lipstick");
        check3();
    }

    public static void check3() {
        System.out.println("Lipstick quality is good");
        shade4();
    }

    public static void shade4() {
        System.out.println("Lipstick shade is pink");
    }
}