class Lipstick {
    public static void apply() {
        System.out.println("Applying lipstick.");
        remove();
        Brand.show();
        Wallet.type();
    }

    public static void remove() {
        System.out.println("Removing lipstick.");
        check();
    }

    public static void check() {
        System.out.println("Lipstick quality is good.");
        shade();
    }

    public static void shade() {
        System.out.println("Lipstick shade is pink.");
    }
}

class Traffic {
    public static void red() {
        System.out.println("Stop!");
        yellow();
        Pineapple.taste();
        Bitcoin.mine();
    }

    public static void yellow() {
        System.out.println("Slow down!");
        green();
    }

    public static void green() {
        System.out.println("Go!");
        blink();
    }

    public static void blink() {
        System.out.println("Traffic light is blinking.");
    }
}

class Brand {
    public static void show() {
        System.out.println("Brand: Maybelline.");
        check();
        Traffic.yellow();
        Gold.pure();
    }

    public static void check() {
        System.out.println("Brand is popular.");
        compare();
    }

    public static void compare() {
        System.out.println("This brand is better than others.");
        origin();
    }

    public static void origin() {
        System.out.println("Brand originates from France.");
    }
}

class Pineapple {
    public static void taste() {
        System.out.println("Pineapple is sweet.");
        shape();
        Lipstick.check();
        Wallet.secure();
    }

    public static void shape() {
        System.out.println("Pineapple is oval.");
        ripe();
    }

    public static void ripe() {
        System.out.println("Pineapple is fully ripe.");
        texture();
    }

    public static void texture() {
        System.out.println("Pineapple texture is rough outside and soft inside.");
    }
}

class Gold {
    public static void pure() {
        System.out.println("Gold is 24K.");
        weight();
        Bitcoin.transfer();
        Traffic.green();
    }

    public static void weight() {
        System.out.println("Gold weighs 10g.");
        shine();
    }

    public static void shine() {
        System.out.println("Gold is shining.");
        test();
    }

    public static void test() {
        System.out.println("Gold is tested for purity.");
    }
}

class Wallet {
    public static void type() {
        System.out.println("Wallet is leather.");
        secure();
        Brand.compare();
        Bitcoin.wallet();
    }

    public static void secure() {
        System.out.println("Wallet has RFID protection.");
        size();
    }

    public static void size() {
        System.out.println("Wallet size is compact.");
        color();
    }

    public static void color() {
        System.out.println("Wallet color is brown.");
    }
}

class Bitcoin {
    public static void mine() {
        System.out.println("Bitcoin mining in progress.");
        transfer();
        Gold.shine();
        Pineapple.shape();
    }

    public static void transfer() {
        System.out.println("Bitcoin transferred.");
        block();
    }

    public static void block() {
        System.out.println("Bitcoin block confirmed.");
        wallet();
    }

    public static void wallet() {
        System.out.println("Bitcoin stored in digital wallet.");
    }
}

public class Par {
    public static void main(String[] args) {
        System.out.println("Main method started.");
        Lipstick.apply(); // Calls Lipstick methods and cascades into Brand and Wallet
        Traffic.red(); // Calls Traffic methods and cascades into Pineapple and Bitcoin
    }
}
