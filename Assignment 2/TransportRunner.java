class Transport {
    public static int getPrice(String source) {
        if (source == "Bangalore") {
            return 1800;
        } else if (source == "Mysore") {
            return 1150;
        } else if (source == "Hubli") {
            return 1400;
        } else if (source == "Belgaum") {
            return 1550;
        } else if (source == "Mangalore") {
            return 1650;
        } else if (source == "Dharwad") {
            return 1750;
        } else if (source == "Tumkur") {
            return 1250;
        } else if (source == "Bijapur") {
            return 1350;
        } else if (source == "Shimoga") {
            return 1450;
        } else if (source == "Gulbarga") {
            return 1950;
        } else if (source == "Raichur") {
            return 2050;
        } else if (source == "Bellary") {
            return 1500;
        } else if (source == "Bidar") {
            return 1600;
        } else if (source == "Chikmagalur") {
            return 1700;
        } else if (source == "Hassan") {
            return 1800;
        } else if (source == "Mandya") {
            return 1900;
        } else if (source == "Udupi") {
            return 2000;
        } else if (source == "Kodagu") {
            return 2100;
        } else if (source == "Davanagere") {
            return 2200;
        } else if (source == "Kolar") {
            return 2300;
        } else {
            return -1;
        }
    }
}

class TransportRunner {
    public static void main(String[] args) {
        String source = "Bangalore";
        int price = Transport.getPrice(source);
        System.out.println("Price: " + price);
    }
}
