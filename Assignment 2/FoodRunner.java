class Food {
    public static int getPrice(String foodItem) {
        if (foodItem == "Biryani") {
            return 250;
        } else if (foodItem == "Pizza") {
            return 300;
        } else if (foodItem == "Burger") {
            return 150;
        } else if (foodItem == "Pasta") {
            return 200;
        } else if (foodItem == "Sandwich") {
            return 120;
        } else if (foodItem == "Dosa") {
            return 100;
        } else if (foodItem == "Idli") {
            return 80;
        } else if (foodItem == "Pani Puri") {
            return 50;
        } else if (foodItem == "Samosa") {
            return 40;
        } else if (foodItem == "Chaat") {
            return 90;
        } else if (foodItem == "Noodles") {
            return 180;
        } else if (foodItem == "Fried Rice") {
            return 200;
        } else if (foodItem == "Paneer Tikka") {
            return 280;
        } else if (foodItem == "Chicken Curry") {
            return 350;
        } else if (foodItem == "Fish Fry") {
            return 400;
        } else if (foodItem == "Momos") {
            return 120;
        } else if (foodItem == "Paratha") {
            return 90;
        } else if (foodItem == "Gulab Jamun") {
            return 70;
        } else {
            return -1;
        }
    }
}

class FoodRunner {
    public static void main(String[] args) {
        String foodItem = "Biryani";
        int price = Food.getPrice(foodItem);
        System.out.println("Price: " + price);
    }
}
