class Farmer {
    public static void farm(String vegetable, int quantity) {
        System.out.println("Farmer grows " + quantity + " " " + vegetable);
    }
}

class Broker {
    public static void brokerage(String vegetable, int quantity) {
        System.out.println("Broker arranges " + quantity + "  " + vegetable);
        Farmer.farm(vegetable, quantity);
    }
}

class Agent {
    public static void purchase(String vegetable, int quantity) {
        System.out.println("Agent purchases " + quantity + "  " + vegetable);
        Broker.brokerage(vegetable, quantity);
    }
}

class Shop {
    public static void sell(String vegetable, int quantity) {
        System.out.println("Shop sells " + quantity + "  " + vegetable);
        Agent.purchase(vegetable, quantity);
    }
}

class Customer {
    public static void buy(String vegetable, int quantity) {
        System.out.println("Customer buys " + quantity + "  " + vegetable);
        Shop.sell(vegetable, quantity);
    }
}

class Runner {
    public static void main(String[] args) {
        Customer.buy("Tomato", 10);
    }
}
