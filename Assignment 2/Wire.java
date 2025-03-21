class Wire {
    public static void cond() {
        System.out.println("Copper wire is conductive");
        insulate();
        Perfume.scent();
        Wallet.type();
    }

    public static void insulate() {
        System.out.println("Wire is insulated");
        length();
        gauge();
    }

    public static void length() {
        System.out.println("Wire length is 10m");
    }

    public static void gauge() {
        System.out.println("Wire gauge is 16");
    }
}