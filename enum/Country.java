class AEmail {
    public static void printEmails() {
        for (Emails email : Emails.values()) {
            if (email == Emails.NIKHITA) {
                System.out.println("nikhita123@gmail.com");
            }
            if (email == Emails.VAISHNAVI) {
                System.out.println("vaishnavi_xyz@gmail.com");
            }
            if (email == Emails.SIVALI) {
                System.out.println("sivali_456@gmail.com");
            }
        }
    }
}

class Country {
    public static void Countries() {
        for (Countries country : Countries.values()) {
            if (country.name().endsWith("A")) {
                System.out.println(country);
            }
        }
    }
}

class Alphabet {
    public static void Alphabets() {
        for (Alphabets alphabet : Alphabets.values()) {
            System.out.print(alphabet + " ");
        }
        System.out.println();
    }
}

class Food {
    public static String getIngredients(String foodItem) {
        if (foodItem.equals("PIZZA")) {
            return "Dough, Cheese, Tomato Sauce, Toppings";
        } else if (foodItem.equals("PASTA")) {
            return "Pasta, Olive Oil, Garlic, Parmesan";
        } else if (foodItem.equals("BIRYANI")) {
            return "Rice, Spices, Meat, Yogurt";
        } else {
            return "Unknown Ingredients";
        }
    }
}
