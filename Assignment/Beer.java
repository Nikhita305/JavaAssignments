class Ladder {
    public void step(int height) {
        System.out.println("Step height: " + height);
    }
    public void climb(Ladder ladder) {
        System.out.println("Climbing: " + ladder);
    }
    public void hold(String material) {
        System.out.println("Material: " + material);
    }
    public void reach(Ladder ladder, String material) {
        System.out.println("Reach: " + material + " - " + ladder);
    }
    public void extend(int height, int weight) {
        System.out.println("Extended: " + height + "cm, Supports: " + weight + "kg");
    }
    public void stabilize(Ladder ladder, String material, int weight) {
        System.out.println("Stabilizing: " + ladder + ", Material: " + material + ", Weight: " + weight);
    }
    public void fold(Ladder ladder, int steps, String type) {
        System.out.println("Folding: " + ladder + ", Steps: " + steps + ", Type: " + type);
    }
}

class FoodItem {
    public void eat(String name) {
        System.out.println("Eating: " + name);
    }
    public void taste(FoodItem foodItem) {
        System.out.println("Tasting: " + foodItem);
    }
    public void smell(String aroma) {
        System.out.println("Smelling: " + aroma);
    }
    public void consume(FoodItem foodItem, int quantity) {
        System.out.println("Consuming " + quantity + " of " + foodItem);
    }
    public void cook(int time, String method) {
        System.out.println("Cooking: " + time + " min, Method: " + method);
    }
    public void enjoy(FoodItem foodItem, int quantity, boolean isSpicy) {
        System.out.println("Enjoying " + quantity + " of " + foodItem + " - Spicy: " + isSpicy);
    }
    public void store(FoodItem foodItem, String location, int duration) {
        System.out.println("Storing " + foodItem + " in " + location + " for " + duration + " days");
    }
}

class Paper {
    public void write(String text) {
        System.out.println("Writing: " + text);
    }
    public void fold(Paper paper) {
        System.out.println("Folding: " + paper);
    }
    public void color(String shade) {
        System.out.println("Color: " + shade);
    }
    public void draft(Paper paper, int pages) {
        System.out.println("Drafting: " + pages + " pages, " + paper);
    }
    public void print(int copies, String size) {
        System.out.println("Printing: " + copies + " copies, Size: " + size);
    }
    public void sketch(Paper paper, int pages, String color) {
        System.out.println("Sketching: " + pages + " pages, Color: " + color + " - Paper: " + paper);
    }
    public void recycle(Paper paper, boolean isRecyclable, int weight) {
        System.out.println("Recycling: " + paper + ", Recyclable: " + isRecyclable + ", Weight: " + weight + "g");
    }
}

class Beer {
    public void drink(String type) {
        System.out.println("Drinking: " + type);
    }
    public void chill(Beer beer) {
        System.out.println("Chilling: " + beer);
    }
    public void pour(String container) {
        System.out.println("Pouring into: " + container);
    }
    public void sip(Beer beer, int sips) {
        System.out.println("Sipping: " + sips + " times " + beer);
    }
    public void store(int temperature, String place) {
        System.out.println("Stored at " + temperature + " degrees in " + place);
    }
    public void party(Beer beer, int bottles, boolean isCold) {
        System.out.println("Party with " + bottles + " bottles of " + beer + " - Cold: " + isCold);
    }
    public void waste(Beer beer, boolean isSpilled, int amount) {
        System.out.println("Wasted " + amount + " ml of " + beer + " - Spilled: " + isSpilled);
    }
}

class WhiteBoard {
    public void draw(String marker) {
        System.out.println("Drawing with: " + marker);
    }
    public void erase(WhiteBoard board) {
        System.out.println("Erasing: " + board);
    }
    public void write(String message) {
        System.out.println("Writing: " + message);
    }
    public void clean(WhiteBoard board, int times) {
        System.out.println("Cleaning " + board + " " + times + " times");
    }
    public void replace(int size, String brand) {
        System.out.println("Replacing board of size: " + size + " brand: " + brand);
    }
    public void damage(WhiteBoard board, boolean isBroken, int years) {
        System.out.println("Board damaged: " + board + " - Broken: " + isBroken + " after " + years + " years");
    }
    public void fix(WhiteBoard board, String method, int cost) {
        System.out.println("Fixing " + board + " with " + method + " costing " + cost);
    }
}

class Mask {
    public void wear(String type) {
        System.out.println("Wearing: " + type);
    }
    public void remove(Mask mask) {
        System.out.println("Removing: " + mask);
    }
    public void adjust(String size) {
        System.out.println("Adjusting: " + size);
    }
    public void clean(Mask mask, boolean isReusable) {
        System.out.println("Cleaning: " + mask + " - Reusable: " + isReusable);
    }
    public void store(int quantity, String location) {
        System.out.println("Storing " + quantity + " masks in " + location);
    }
    public void dispose(Mask mask, boolean isBioDegradable, int count) {
        System.out.println("Disposing: " + count + " masks - BioDegradable: " + isBioDegradable);
    }
    public void filter(Mask mask, String material, int efficiency) {
        System.out.println("Filtering with: " + material + " - Efficiency: " + efficiency + "%");
    }
}

class TeddyBear {
    public void hug(String size) {
        System.out.println("Hugging a " + size + " teddy bear");
    }
    public void gift(TeddyBear bear) {
        System.out.println("Gifting: " + bear);
    }
    public void cuddle(String softness) {
        System.out.println("Cuddling: " + softness);
    }
    public void place(TeddyBear bear, String location) {
        System.out.println("Placing: " + bear + " in " + location);
    }
    public void wash(int duration, String detergent) {
        System.out.println("Washing for " + duration + " minutes with " + detergent);
    }
    public void decorate(TeddyBear bear, String ribbon, boolean isWrapped) {
        System.out.println("Decorating: " + bear + " with " + ribbon + " - Wrapped: " + isWrapped);
    }
    public void pack(TeddyBear bear, String box, int layers) {
        System.out.println("Packing: " + bear + " in " + box + " with " + layers + " layers");
    }
}