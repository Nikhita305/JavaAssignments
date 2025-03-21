public class Runner {
    public static void main(String[] args) {
        Ladder ladder = new Ladder();
        FoodItem foodItem = new FoodItem();
        Paper paper = new Paper();
        Mask mask = new Mask();
        TeddyBear teddyBear = new TeddyBear();
        Beer beer = new Beer();
        WhiteBoard whiteBoard = new WhiteBoard();

        ladder.step(10);
        ladder.climb(ladder);
        ladder.hold("Metal");

        foodItem.eat("Pizza");
        foodItem.taste(foodItem);
        foodItem.smell("Spicy");

        paper.write("Hello World");
        paper.fold(paper);
        paper.color("Blue");

        mask.wear("Surgical");
        mask.remove(mask);
        mask.adjust("Medium");

        teddyBear.hug("Large");
        teddyBear.gift(teddyBear);
        teddyBear.cuddle("Soft");

        beer.drink("Lager");
        beer.chill(beer);
        beer.pour("Glass");
        beer.sip(beer, 5);
        beer.store(4, "Fridge");
        beer.party(beer, 10, true);
        beer.waste(beer, false, 250);

        whiteBoard.draw("Black Marker");
        whiteBoard.erase(whiteBoard);
        whiteBoard.write("Hello, Java!");
        whiteBoard.clean(whiteBoard, 3);
        whiteBoard.replace(36, "Expo");
        whiteBoard.damage(whiteBoard, false, 2);
        whiteBoard.fix(whiteBoard, "Glue", 100);
		
		mask.wear("Surgical");
        mask.remove(mask);
        mask.adjust("Medium");
        mask.clean(mask, true);
        mask.store(10, "Drawer");
        mask.dispose(mask, false, 5);
        mask.filter(mask, "N95", 95);

        teddyBear.hug("Large");
        teddyBear.gift(teddyBear);
        teddyBear.cuddle("Soft");
        teddyBear.place(teddyBear, "Bed");
        teddyBear.wash(30, "Detergent");
        teddyBear.decorate(teddyBear, "Red Ribbon", true);
        teddyBear.pack(teddyBear, "Gift Box", 2);
    }
}
