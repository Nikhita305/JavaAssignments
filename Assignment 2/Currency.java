class Currency {
    public static void rate() {
        System.out.println("Exchange rate");
        symbol();
        Lipstick.apply();
        Brand.show();
    }

    public static void symbol() {
        System.out.println("Currency symbol");
        value();
        type();
    }

    public static void value() {
        System.out.println("Currency value");
    }

    public static void type() {
        System.out.println("Currency type");
    }
}