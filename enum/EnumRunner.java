class EnumRunner {
    public static void main(String[] args) {
		 AEmail.printEmails();
        Country.Countries();
        Alphabet.Alphabets();
        String ingredients = Food.getIngredients("PIZZA");
        System.out.println("Ingredients for Pizza: " + ingredients);
    }
}