package com.xworkz.toStringRep;

public class toStringRepRunner {
    public static void main(String[] args) {
        Bottle bottle = new Bottle("Black",5,"Round");
        System.out.println("1" +bottle);
        System.out.println(bottle.hashCode());
        System.out.println(System.identityHashCode(bottle));
        Bottle bottle1 = new Bottle("Blue",9,"Round");
        System.out.println("Check location "+(bottle==bottle1));
        System.out.println("Both are same? "+bottle1.equals(bottle));
        System.out.println("**************************************");

        Shoe shoe = new Shoe("Nike", 9, "White");
        System.out.println("2"+shoe);
        System.out.println(shoe.hashCode());
        System.out.println(System.identityHashCode(shoe));
        Shoe shoe1 = new Shoe("Adidas", 8, "White");
        System.out.println("Check location: " + (shoe == shoe1));
        System.out.println("Both are same? " + shoe1.equals(shoe));
        System.out.println("**************************************");

        Watch watch = new Watch("Titan", "Analog", 2499.0);
        System.out.println("3" + watch);
        System.out.println(watch);
        System.out.println(System.identityHashCode(watch));
        Watch watch1 = new Watch("Fossil", "Analog", 5000.00);
        System.out.println("Check location: " + (watch == watch1));
        System.out.println("Both are same? " + watch.equals(watch1));


        System.out.println("**************************************");

        Laptop laptop = new Laptop("Dell", 16, 68999.99);
        System.out.println("4" + laptop);
        System.out.println(laptop.hashCode());
        System.out.println(System.identityHashCode(laptop));
        Laptop laptop1 = new Laptop("HP", 8, 54999.00);
        System.out.println("Check location: " + (laptop == laptop1));
        System.out.println("Both are same? " + laptop1.equals(laptop));
        System.out.println("**************************************");

        Mobile mobile = new Mobile("Samsung", "Galaxy S23", 74999.0);
        System.out.println("5" + mobile);
        System.out.println(mobile.hashCode());
        System.out.println(System.identityHashCode(mobile));
        Mobile mobile1 = new Mobile("Apple", "iPhone 14", 79999.00);
        System.out.println("Check location: " + (mobile == mobile1));
        System.out.println("Both are same? " + mobile1.equals(mobile));
        System.out.println("**************************************");

        Car car = new Car("Toyota", "Fortuner", 2023);
        System.out.println("6" + car);
        System.out.println(car.hashCode());
        System.out.println(System.identityHashCode(car));
        Car car1 = new Car("Hyundai", "Creta", 2022);
        System.out.println("Check location: " + (car == car1));
        System.out.println("Both are same? " + car1.equals(car));
        System.out.println("**************************************");

        Parachute parachute = new Parachute("Nylon", "Red", 5.5);
        System.out.println("7" + parachute);
        System.out.println(parachute.hashCode());
        System.out.println(System.identityHashCode(parachute));
        Parachute parachute1 = new Parachute("Silk", "Blue", 6.0);
        System.out.println("Check location: " + (parachute == parachute1));
        System.out.println("Both are same? " + parachute1.equals(parachute));
        System.out.println("**************************************");

        Fan fan = new Fan("Havells", 1200, "Ceiling");
        System.out.println("8" + fan);
        System.out.println(fan.hashCode());
        System.out.println(System.identityHashCode(fan));
        Fan fan1 = new Fan("Crompton", 1300, "Table");
        System.out.println("Check location: " + (fan == fan1));
        System.out.println("Both are same? " + fan1.equals(fan));
        System.out.println("**************************************");

        Fire fire = new Fire("Wood", "Orange", 600);
        System.out.println("9" + fire);
        System.out.println(fire.hashCode());
        System.out.println(System.identityHashCode(fire));
        Fire fire1 = new Fire("Gas", "Blue", 1000);
        System.out.println("Check location: " + (fire == fire1));
        System.out.println("Both are same? " + fire1.equals(fire));
        System.out.println("**************************************");

        Robot robot = new Robot("XJ9", "Humanoid", 24);
        System.out.println("10" + robot);
        System.out.println(robot.hashCode());
        System.out.println(System.identityHashCode(robot));
        Robot robot1 = new Robot("MechaZ", "Security", 18);
        System.out.println("Check location: " + (robot == robot1));
        System.out.println("Both are same? " + robot1.equals(robot));
        System.out.println("**************************************");

        System.out.println("**************************************");

        Candy candy = new Candy("Strawberry", "Pink", 15.0);
        System.out.println("11" + candy);
        System.out.println(candy.hashCode());
        System.out.println(System.identityHashCode(candy));
        Candy candy1 = new Candy("Mango", "Yellow", 8.0);
        System.out.println("Check location: " + (candy == candy1));
        System.out.println("Both are same? " + candy1.equals(candy));
        System.out.println("**************************************");

        Camera camera = new Camera("Canon", 24.2, "DSLR");
        System.out.println("12" + camera);
        System.out.println(camera.hashCode());
        System.out.println(System.identityHashCode(camera));
        Camera camera1 = new Camera("Nikon", 20.1, "Mirrorless");
        System.out.println("Check location: " + (camera == camera1));
        System.out.println("Both are same? " + camera1.equals(camera));
        System.out.println("**************************************");

        Clip clip = new Clip("Metal", "Silver", 3.5);
        System.out.println("13" + clip);
        System.out.println(clip.hashCode());
        System.out.println(System.identityHashCode(clip));
        Clip clip1 = new Clip("Metal", "Silver", 5.0);
        System.out.println("Check location: " + (clip == clip1));
        System.out.println("Both are same? " + clip1.equals(clip));
        System.out.println("**************************************");

        Tubelight tubelight = new Tubelight("Philips", 48, 36);
        System.out.println("14" + tubelight);
        System.out.println(tubelight.hashCode());
        System.out.println(System.identityHashCode(tubelight));
        Tubelight tube1 = new Tubelight("Syska", 42, 28);
        System.out.println("Check location: " + (tubelight == tube1));
        System.out.println("Both are same? " + tube1.equals(tubelight));
        System.out.println("**************************************");

        Balloon balloon = new Balloon("Red", "Heart", 12.5);
        System.out.println("15" + balloon);
        System.out.println(balloon.hashCode());
        System.out.println(System.identityHashCode(balloon));
        Balloon balloon1 = new Balloon("Blue", "Oval", 10.0);
        System.out.println("Check location: " + (balloon == balloon1));
        System.out.println("Both are same? " + balloon1.equals(balloon));
        System.out.println("**************************************");

        Airpods airpods = new Airpods("Apple", "AirPods Pro", 6);
        System.out.println("16" + airpods);
        System.out.println(airpods.hashCode());
        System.out.println(System.identityHashCode(airpods));
        Airpods airpods1 = new Airpods("Samsung", "Buds", 5);
        System.out.println("Check location: " + (airpods == airpods1));
        System.out.println("Both are same? " + airpods1.equals(airpods));
        System.out.println("**************************************");

        Boat boat = new Boat("Speedboat", "White", 8);
        System.out.println("17" + boat);
        System.out.println(boat.hashCode());
        System.out.println(System.identityHashCode(boat));
        Boat boat1 = new Boat("Yacht", "White", 10);
        System.out.println("Check location: " + (boat == boat1));
        System.out.println("Both are same? " + boat1.equals(boat));
        System.out.println("**************************************");

        Lipstick lipstick = new Lipstick("Lakme", "Cherry Red", 299.0);
        System.out.println("18" + lipstick);
        System.out.println(lipstick.hashCode());
        System.out.println(System.identityHashCode(lipstick));
        Lipstick lipstick1 = new Lipstick("Lakme", "Ruby Red", 550);
        System.out.println("Check location: " + (lipstick == lipstick1));
        System.out.println("Both are same? " + lipstick1.equals(lipstick));
        System.out.println("**************************************");

        Zudio zudio = new Zudio("T-Shirt", "M", 499.0);
        System.out.println("19" + zudio);
        System.out.println(zudio.hashCode());
        System.out.println(System.identityHashCode(zudio));
        Zudio zudio1 = new Zudio("T-Shirt", "L", 899);
        System.out.println("Check location: " + (zudio == zudio1));
        System.out.println("Both are same? " + zudio1.equals(zudio));
        System.out.println("**************************************");

        Sandal sandal = new Sandal("Bata", "8", "Brown");
        System.out.println("20" + sandal);
        System.out.println(sandal.hashCode());
        System.out.println(System.identityHashCode(sandal));
        Sandal sandal1 = new Sandal("Bata", "9", "Brown");
        System.out.println("Check location: " + (sandal == sandal1));
        System.out.println("Both are same? " + sandal1.equals(sandal));
        System.out.println("**************************************");

        DreamCatcher dreamCatcher = new DreamCatcher("Turquoise", 8.5, "Feathers & Beads");
        System.out.println("21" + dreamCatcher);
        System.out.println(dreamCatcher.hashCode());
        System.out.println(System.identityHashCode(dreamCatcher));
        DreamCatcher d2 = new DreamCatcher("Blue", 7.0, "Beads");
        System.out.println("Check location: " + (dreamCatcher == d2));
        System.out.println("Both are same? " + dreamCatcher.equals(d2));
        System.out.println("**************************************");

        Skirt skirt = new Skirt("Zara", "Knee-length", "Beige");
        System.out.println("22" + skirt);
        System.out.println(skirt.hashCode());
        System.out.println(System.identityHashCode(skirt));
        Skirt skirt1= new Skirt("H&M", "Mini", "Blue");
        System.out.println("Check location (skirt1 == skirt2): " + (skirt == skirt1));
        System.out.println("Both are same? (skirt1.equals(skirt2)): " + skirt.equals(skirt1));
        System.out.println("**************************************");

        Cream cream = new Cream("Nivea", "Moisturizing", 199.0);
        System.out.println("23" + cream);
        System.out.println(cream.hashCode());
        System.out.println(System.identityHashCode(cream));
        Cream cream1 = new Cream("Ponds", "Sunscreen", 149.0);
        System.out.println("Check location: " + (cream == cream1));
        System.out.println("Both are same? " + cream1.equals(cream));
        System.out.println("**************************************");

        Weather weather = new Weather("Cloudy", 27.5, "Bangalore");
        System.out.println("24" + weather);
        System.out.println(weather.hashCode());
        System.out.println(System.identityHashCode(weather));
        Weather weather1 = new Weather("Rainy", 24.0, "Mangalore");
        System.out.println("Check location: " + (weather == weather1));
        System.out.println("Both are same? " + weather1.equals(weather));
        System.out.println("**************************************");

        Coin coin = new Coin("Nickel", 5.0, 2020);
        System.out.println("25" + coin);
        System.out.println(coin.hashCode());
        System.out.println(System.identityHashCode(coin));
        Coin coin1 = new Coin("Gold", 10.0, 2020);
        System.out.println("Check location: " + (coin == coin1));
        System.out.println("Both are same? " + coin1.equals(coin));
        System.out.println("**************************************");

        Chats chats = new Chats("Shashank", "Hey, how's it going?", "10:45 AM");
        System.out.println("26" + chats);
        System.out.println(chats.hashCode());
        System.out.println(System.identityHashCode(chats));
        Chats chats1 = new Chats("Bob", "What's up?", "10:20 AM");
        System.out.println("Check location: " + (chats == chats1));
        System.out.println("Both are same? " + chats1.equals(chats));
        System.out.println("**************************************");

        BathTub bathTub = new BathTub("Oval", "Acrylic", 5.5);
        System.out.println("27" + bathTub);
        System.out.println(bathTub.hashCode());
        System.out.println(System.identityHashCode(bathTub));
        BathTub bathTub1 = new BathTub("Round", "Ceramic", 6.0);
        System.out.println("Check location: " + (bathTub == bathTub1));
        System.out.println("Both are same? " + bathTub1.equals(bathTub));
        System.out.println("**************************************");

        Candle candle = new Candle("Lavender", "Purple", 20);
        System.out.println("28" + candle);
        System.out.println(candle.hashCode());
        System.out.println(System.identityHashCode(candle));
        Candle candle1 = new Candle("Vanilla", "White", 6);
        System.out.println("Check location: " + (candle == candle1));
        System.out.println("Both are same? " + candle1.equals(candle));
        System.out.println("**************************************");

        Socks socks = new Socks("Nike", "Free Size", "Black");
        System.out.println("29" + socks);
        System.out.println(socks.hashCode());
        System.out.println(System.identityHashCode(socks));
        Socks socks1 = new Socks("Puma", "L", "White");
        System.out.println("Check location: " + (socks == socks1));
        System.out.println("Both are same? " + socks1.equals(socks));
        System.out.println("**************************************");

        Chain chain = new Chain("Gold", 22.0, "Curb");
        System.out.println("30" + chain);
        System.out.println(chain.hashCode());
        System.out.println(System.identityHashCode(chain));
        Chain chain1 = new Chain("Silver", 20.0, "Bracelet");
        System.out.println("Check location: " + (chain == chain1));
        System.out.println("Both are same? " + chain1.equals(chain));
        System.out.println("**************************************");

        Bank bank = new Bank("SBI", "MG Road", "SBIN0000426");
        System.out.println("31" + bank);
        System.out.println(bank.hashCode());
        System.out.println(System.identityHashCode(bank));
        Bank bank1 = new Bank("SBI", "MG Road", "SBIN0001234");
        System.out.println("Check location: " + (bank == bank1));
        System.out.println("Both are same? " + bank1.equals(bank));
        System.out.println("**************************************");

        Shark shark = new Shark("Hammerhead", 15.0, "Indian Ocean");
        System.out.println("32" + shark);
        System.out.println(shark.hashCode());
        System.out.println(System.identityHashCode(shark));
        Shark shark1 = new Shark("Hammerhead", 15.0, "Pacific Ocean");
        System.out.println("Check location: " + (shark == shark1));
        System.out.println("Both are same? " + shark1.equals(shark));
        System.out.println("**************************************");

        Google google = new Google("Search Engine", "Larry Page", 1998);
        System.out.println("33" + google);
        System.out.println(google.hashCode());
        System.out.println(System.identityHashCode(google));
        Google google1 = new Google("Search Engine", "Larry Page", 1998);
        System.out.println("Check location: " + (google == google1));
        System.out.println("Both are same? " + google1.equals(google));
        System.out.println("**************************************");

        Metro metro = new Metro("Delhi", 6, 35.0);
        System.out.println("34" + metro);
        System.out.println(metro.hashCode());
        System.out.println(System.identityHashCode(metro));
        Metro metro1 = new Metro("Bangalore", 6, 30.0);
        System.out.println("Check location: " + (metro == metro1));
        System.out.println("Both are same? " + metro1.equals(metro));
        System.out.println("**************************************");

        Satellite satellite = new Satellite("Chandrayaan-3", "India", 2023);
        System.out.println("35" + satellite);
        System.out.println(satellite.hashCode());
        System.out.println(System.identityHashCode(satellite));
        Satellite satellite1 = new Satellite("INSAT-3D", "India", 2015);
        System.out.println("Check location: " + (satellite == satellite1));
        System.out.println("Both are same? " + satellite1.equals(satellite));
        System.out.println("**************************************");

        Hippopotamus hippo = new Hippopotamus("Happy", 1500.0, "River");
        System.out.println("36" + hippo);
        System.out.println(hippo.hashCode());
        System.out.println(System.identityHashCode(hippo));
        Hippopotamus hippo1 = new Hippopotamus("Harry", 1600.0, "River");
        System.out.println("Check location: " + (hippo == hippo1));
        System.out.println("Both are same? " + hippo1.equals(hippo));
        System.out.println("**************************************");

        Crackers crackers = new Crackers("Flowerpot", "Standard", 199.0);
        System.out.println("37" + crackers);
        System.out.println(crackers.hashCode());
        System.out.println(System.identityHashCode(crackers));
        Crackers crackers1 = new Crackers("Sparklers", "Standard", 250.0);
        System.out.println("Check location: " + (crackers == crackers1));
        System.out.println("Both are same? " + crackers1.equals(crackers));
        System.out.println("**************************************");

        Gun gun = new Gun("Glock 17", "Pistol", 17);
        System.out.println("38" + gun);
        System.out.println(gun.hashCode());
        System.out.println(System.identityHashCode(gun));
        Gun gun1 = new Gun("AK-47", "Assault Rifle", 60);
        System.out.println("Check location: " + (gun == gun1));
        System.out.println("Both are same? " + gun1.equals(gun));
        System.out.println("**************************************");

        Restaurant restaurant = new Restaurant("Spice Villa", "Indian", 4.5);
        System.out.println("39" + restaurant);
        System.out.println(restaurant.hashCode());
        System.out.println(System.identityHashCode(restaurant));Restaurant res1 = new Restaurant("Spice Hub", "Indian", 4.5);
        System.out.println("Check location: " + (restaurant == res1));
        System.out.println("Both are same? " + res1.equals(restaurant));
        System.out.println("**************************************");

        Banner banner = new Banner("Welcome", "Red", 10);
        System.out.println("40" + banner);
        System.out.println(banner.hashCode());
        System.out.println(System.identityHashCode(banner));
        Banner banner1 = new Banner("Welcome", "Red", 20);
        System.out.println("Check location: " + (banner == banner1));
        System.out.println("Both are same? " + banner1.equals(banner));
        System.out.println("**************************************");

        Sky sky = new Sky("Blue", "Morning", true);
        System.out.println("41" + sky);
        System.out.println(sky.hashCode());
        System.out.println(System.identityHashCode(sky));
        Sky sky1 = new Sky("Orange", "Evening", true);
        System.out.println("Check location: " + (sky == sky1));
        System.out.println("Both are same? " + sky1.equals(sky));
        System.out.println("**************************************");

        Bubbles bubbles = new Bubbles("Small", "Transparent", 100);
        System.out.println("42" + bubbles);
        System.out.println(bubbles.hashCode());
        System.out.println(System.identityHashCode(bubbles));
        Bubbles bubbles1 = new Bubbles("Large", "Blue", 30);
        System.out.println("Check location: " + (bubbles == bubbles1));
        System.out.println("Both are same? " + bubbles1.equals(bubbles));
        System.out.println("**************************************");

        Soil soil = new Soil("Loamy", "Brown", true);
        System.out.println("43" + soil);
        System.out.println(soil.hashCode());
        System.out.println(System.identityHashCode(soil));
        Soil soil1 = new Soil("Clay", "Brown", true);
        System.out.println("Check location: " + (soil == soil1));
        System.out.println("Both are same? " + soil1.equals(soil));
        System.out.println("**************************************");

        Lenskart lens = new Lenskart("Rimless", "Anti-glare", 2500.0);
        System.out.println("44" + lens);
        System.out.println(lens.hashCode());
        System.out.println(System.identityHashCode(lens));
        Lenskart lens1 = new Lenskart("Rimless", "Anti-glare", 2600.0);
        System.out.println("Check location: " + (lens == lens1));
        System.out.println("Both are same? " + lens1.equals(lens));
        System.out.println("**************************************");

        House house = new House("Victorian", 2, true);
        System.out.println("45" + house);
        System.out.println(house.hashCode());
        System.out.println(System.identityHashCode(house));
        House house1 = new House("Victorian", 2, false);
        System.out.println("Check location: " + (house == house1));
        System.out.println("Both are same? " + house1.equals(house));
        System.out.println("**************************************");

        Mat mat = new Mat("Rubber", "Green", 6.0);
        System.out.println("46" + mat);
        System.out.println(mat.hashCode());
        System.out.println(System.identityHashCode(mat));
        Mat mat1 = new Mat("Cotton", "Blue", 6.0);
        System.out.println("Check location: " + (mat == mat1));
        System.out.println("Both are same? " + mat1.equals(mat));
        System.out.println("**************************************");

        Wallpaper wall = new Wallpaper("Floral", "Green", 450.0);
        System.out.println("47" + wall);
        System.out.println(wall.hashCode());
        System.out.println(System.identityHashCode(wall));
        Wallpaper wall1 = new Wallpaper("Floral", "Green", 470.0);
        System.out.println("Check location: " + (wall == wall1));
        System.out.println("Both are same? " + wall1.equals(wall));
        System.out.println("**************************************");

        Ring ring = new Ring("Gold", "Classic Band", 15999.0);
        System.out.println("48" + ring);
        System.out.println(ring.hashCode());
        System.out.println(System.identityHashCode(ring));Ring ring1 = new Ring("Gold", "Floral", 25500.0);
        System.out.println("Check location: " + (ring == ring1));
        System.out.println("Both are same? " + ring1.equals(ring));
        System.out.println("**************************************");

        Dustbin bin = new Dustbin("Plastic", "Blue", 25);
        System.out.println("49" + bin);
        System.out.println(bin.hashCode());
        System.out.println(System.identityHashCode(bin));
        Dustbin bin1 = new Dustbin("Plastic", "Blue", 30);
        System.out.println("Check location: " + (bin == bin1));
        System.out.println("Both are same? " + bin1.equals(bin));
        System.out.println("**************************************");

        Movie movie = new Movie("Inception", "Sci-Fi", 8.8);
        System.out.println("50" + movie);
        System.out.println(movie.hashCode());
        System.out.println(System.identityHashCode(movie));
        Movie movie1 = new Movie("Inception", "Sci-Fi", 9.0);
        System.out.println("Check location: " + (movie == movie1));
        System.out.println("Both are same? " + movie1.equals(movie));
        System.out.println("**************************************");

        Needle needle = new Needle("Sewing", 3.5, true);
        System.out.println("51" + needle);
        System.out.println(needle.hashCode());
        System.out.println(System.identityHashCode(needle));
        Needle needle1 = new Needle("Sewing", 5.5, false);
        System.out.println("Check location: " + (needle == needle1));
        System.out.println("Both are same? " + needle1.equals(needle));
        System.out.println("**************************************");

        Cotton cotton = new Cotton("Premium", "India", 250.0);
        System.out.println("52" + cotton);
        System.out.println(cotton.hashCode());
        System.out.println(System.identityHashCode(cotton));
        Cotton cotton1 = new Cotton("Premium", "Egypt", 300.0);
        System.out.println("Check location: " + (cotton == cotton1));
        System.out.println("Both are same? " + cotton1.equals(cotton));
        System.out.println("**************************************");

        Projector projector = new Projector("Epson", "LED", 35999.0);
        System.out.println("53" + projector);
        System.out.println(projector.hashCode());
        System.out.println(System.identityHashCode(projector));
        Projector projector1 = new Projector("Epson", "LED", 48000.0);
        System.out.println("Check location: " + (projector == projector1));
        System.out.println("Both are same? " + projector1.equals(projector));
        System.out.println("**************************************");

        Zepto zepto = new Zepto("Milk", "Grocery", 52.0);
        System.out.println("54" + zepto);
        System.out.println(zepto.hashCode());
        System.out.println(System.identityHashCode(zepto));
        Zepto zepto1 = new Zepto("Milk", "Dairy", 42.0);
        System.out.println("Check location: " + (zepto == zepto1));
        System.out.println("Both are same? " + zepto1.equals(zepto));
        System.out.println("**************************************");

        Basket basket = new Basket("Wicker", "Brown", 12);
        System.out.println("55" + basket);
        System.out.println(basket.hashCode());
        System.out.println(System.identityHashCode(basket));
        Basket basket1 = new Basket("Plastic", "Red", 12);
        System.out.println("Check location: " + (basket == basket1));
        System.out.println("Both are same? " + basket1.equals(basket));
        System.out.println("**************************************");

        Thread thread = new Thread("Red", "Cotton", 100.0);
        System.out.println("56" + thread);
        System.out.println(thread.hashCode());
        System.out.println(System.identityHashCode(thread));
        Thread thread1 = new Thread("Red", "Cotton", 60.0);
        System.out.println("Check location: " + (thread == thread1));
        System.out.println("Both are same? " + thread1.equals(thread));
        System.out.println("**************************************");

        Keyboard keyboard = new Keyboard("Logitech", "Mechanical", 2499.0);
        System.out.println("57" + keyboard);
        System.out.println(keyboard.hashCode());
        System.out.println(System.identityHashCode(keyboard));
        Keyboard keyboard1 = new Keyboard("Logitech", "Mechanical", 2399.99);
        System.out.println("Check location: " + (keyboard == keyboard1));
        System.out.println("Both are same? " + keyboard1.equals(keyboard));
        System.out.println("**************************************");

        Song song = new Song("Perfect", "Ed Sheeran", 4.2);
        System.out.println("58" + song);
        System.out.println(song.hashCode());
        System.out.println(System.identityHashCode(song));
        Song song1 = new Song("Perfect", "Ed Sheeran", 4.23);
        System.out.println("Check location: " + (song == song1));
        System.out.println("Both are same? " + song1.equals(song));
        System.out.println("**************************************");

        Wire wire = new Wire("Copper", "Red", 15.0);
        System.out.println("59" + wire);
        System.out.println(wire.hashCode());
        System.out.println(System.identityHashCode(wire));
        Wire wire1 = new Wire("Copper", "Red", 15.0);
        System.out.println("Check location: " + (wire == wire1));
        System.out.println("Both are same? " + wire1.equals(wire));
        System.out.println("**************************************");

        Bangle bangle = new Bangle("Gold", "Yellow", 6.5);
        System.out.println("60" + bangle);
        System.out.println(bangle.hashCode());
        System.out.println(System.identityHashCode(bangle));
        Bangle bangle1 = new Bangle("Gold", "Red", 7.0);
        System.out.println("Check location: " + (bangle == bangle1));
        System.out.println("Both are same? " + bangle1.equals(bangle));
        System.out.println("**************************************");

        Mars mars = new Mars("Red", 225.0, false);
        System.out.println("61" + mars);
        System.out.println(mars.hashCode());
        System.out.println(System.identityHashCode(mars));
        Mars mars1 = new Mars("Red", 225.0, false);
        System.out.println("Check location: " + (mars == mars1));
        System.out.println("Both are same? " + mars1.equals(mars));
        System.out.println("**************************************");

        Astronut astronut = new Astronut("Neil", "MarsX", 35);
        System.out.println("62" + astronut);
        System.out.println(astronut.hashCode());
        System.out.println(System.identityHashCode(astronut));
        Astronut astronut1 = new Astronut("Neil Armstrong", "Apollo 11", 39);
        System.out.println("Check location: " + (astronut == astronut1));
        System.out.println("Both are same? " + astronut1.equals(astronut));
        System.out.println("**************************************");

        Telescope telescope = new Telescope("Celestron", "Reflector", 150.0);
        System.out.println("63" + telescope);
        System.out.println(telescope.hashCode());
        System.out.println(System.identityHashCode(telescope));
        Telescope telescope1 = new Telescope("Nikon", "Refractor", 20.0);
        System.out.println("Check location: " + (telescope == telescope1));
        System.out.println("Both are same? " + telescope1.equals(telescope));
        System.out.println("**************************************");

        River river = new River("Ganga", 2525.0, "Gangotri");
        System.out.println("64" + river);
        System.out.println(river.hashCode());
        System.out.println(System.identityHashCode(river));
        River river1 = new River("Ganga", 2525.0, "Gangotri");
        System.out.println("Check location: " + (river == river1));
        System.out.println("Both are same? " + river1.equals(river));
        System.out.println("**************************************");

        Vicks vicks = new Vicks("Vaporub", "Menthol", 45.0);
        System.out.println("65" + vicks);
        System.out.println(vicks.hashCode());
        System.out.println(System.identityHashCode(vicks));
        Vicks vicks1 = new Vicks("Inhaler", "Menthol", 45.0);
        System.out.println("Check location: " + (vicks == vicks1));
        System.out.println("Both are same? " + vicks1.equals(vicks));
        System.out.println("**************************************");

        Email email = new Email("nik@example.com", "vaish@example.com", "Meeting");
        System.out.println("66" + email);
        System.out.println(email.hashCode());
        System.out.println(System.identityHashCode(email));
        Email email1 = new Email("alice@example.com", "bob@example.com", "Meeting Reminder");
        System.out.println("Check location: " + (email == email1));
        System.out.println("Both are same? " + email1.equals(email));
        System.out.println("**************************************");

        Wonderla wonderla = new Wonderla("Bangalore", 55, 1350.0);
        System.out.println("67" + wonderla);
        System.out.println(wonderla.hashCode());
        System.out.println(System.identityHashCode(wonderla));
        Wonderla wonderla1 = new Wonderla("Bangalore", 55, 1450.0);
        System.out.println("Check location: " + (wonderla == wonderla1));
        System.out.println("Both are same? " + wonderla1.equals(wonderla));
        System.out.println("**************************************");

        Powerbank powerbank = new Powerbank("Mi", 20000, 1499.0);
        System.out.println("68" + powerbank);
        System.out.println(powerbank.hashCode());
        System.out.println(System.identityHashCode(powerbank));
        Powerbank powerbank1 = new Powerbank("Mi", 10000, 999.0);
        System.out.println("Check location: " + (powerbank == powerbank1));
        System.out.println("Both are same? " + powerbank1.equals(powerbank));
        System.out.println("**************************************");

        Towel towel = new Towel("Cotton", "White", 150.0);
        System.out.println("69" + towel);
        System.out.println(towel.hashCode());
        System.out.println(System.identityHashCode(towel));
        Towel towel1 = new Towel("Cotton", "Blue", 150.0);
        System.out.println("Check location: " + (towel == towel1));
        System.out.println("Both are same? " + towel1.equals(towel));
        System.out.println("**************************************");

        Cooler cooler = new Cooler("Bajaj", "Air Cooler", 5999.0);
        System.out.println("70" + cooler);
        System.out.println(cooler.hashCode());
        System.out.println(System.identityHashCode(cooler));
        Cooler cooler1 = new Cooler("Symphony", "Desert", 8500.0);
        System.out.println("Check location: " + (cooler == cooler1));
        System.out.println("Both are same? " + cooler1.equals(cooler));
        System.out.println("**************************************");

        Gym gym = new Gym("Gold's Gym", "Bangalore", 120);
        System.out.println("71" + gym);
        System.out.println(gym.hashCode());
        System.out.println(System.identityHashCode(gym));
        Gym gym1 = new Gym("FitnessPro", "Bangalore", 200);
        System.out.println("Check location: " + (gym == gym1));
        System.out.println("Both are same? " + gym1.equals(gym));
        System.out.println("**************************************");

        BookStall bookStall = new BookStall("The Book Nook", "MG Road", 500);
        System.out.println("72" + bookStall);
        System.out.println(bookStall.hashCode());
        System.out.println(System.identityHashCode(bookStall));
        BookStall bookStall1 = new BookStall("City Books", "MG Road", 300);
        System.out.println("Check location: " + (bookStall == bookStall1));
        System.out.println("Both are same? " + bookStall1.equals(bookStall));
        System.out.println("**************************************");

        Airport airport = new Airport("Kempegowda International", "Bangalore", 3);
        System.out.println("73" + airport);
        System.out.println(airport.hashCode());
        System.out.println(System.identityHashCode(airport));
        Airport airport1 = new Airport("Kempegowda", "Bangalore", 2);
        System.out.println("Check location: " + (airport == airport1));
        System.out.println("Both are same? " + airport1.equals(airport));
        System.out.println("**************************************");

        Kidney kidney = new Kidney("Human", "Filter blood", 10.5);
        System.out.println("74" + kidney);
        System.out.println(kidney.hashCode());
        System.out.println(System.identityHashCode(kidney));
        Kidney kidney1 = new Kidney("Left", "Filtration", 10.5);
        System.out.println("Check location: " + (kidney == kidney1));
        System.out.println("Both are same? " + kidney1.equals(kidney));
        System.out.println("**************************************");

        Belt belt = new Belt("Leather", "Black", 799.0);
        System.out.println("75" + belt);
        System.out.println(belt.hashCode());
        System.out.println(System.identityHashCode(belt));
        Belt belt1 = new Belt("Canvas", "Khaki", 299.0);
        System.out.println("Check location: " + (belt == belt1));
        System.out.println("Both are same? " + belt1.equals(belt));
        System.out.println("**************************************");

        Auditorium auditorium = new Auditorium("Ravindra Auditorium", 1000, "Bangalore");
        System.out.println("76" + auditorium);
        System.out.println(auditorium.hashCode());
        System.out.println(System.identityHashCode(auditorium));
        Auditorium auditorium1 = new Auditorium("Phoenix Hall", 800, "Downtown");
        System.out.println("Check location: " + (auditorium == auditorium1));
        System.out.println("Both are same? " + auditorium1.equals(auditorium));
        System.out.println("**************************************");

        Theater theater = new Theater("PVR Cinemas", 10, "Koramangala");
        System.out.println("77" + theater);
        System.out.println(theater.hashCode());
        System.out.println(System.identityHashCode(theater));
        Theater theater1 = new Theater("Cineplex", 5, "Mall Road");
        System.out.println("Check location: " + (theater == theater1));
        System.out.println("Both are same? " + theater1.equals(theater));
        System.out.println("**************************************");

        Aquarium aquarium = new Aquarium("Siam Ocean World", 5000, "Bangkok");
        System.out.println("78" + aquarium);
        System.out.println(aquarium.hashCode());
        System.out.println(System.identityHashCode(aquarium));
        Aquarium aquarium1 = new Aquarium("OceanView", 2000, "City Center");
        System.out.println("Check location: " + (aquarium == aquarium1));
        System.out.println("Both are same? " + aquarium1.equals(aquarium));
        System.out.println("**************************************");

        ATM atm = new ATM("HDFC", "Bangalore", 100000.0);
        System.out.println("79" + atm);
        System.out.println(atm.hashCode());
        System.out.println(System.identityHashCode(atm));
        ATM atm1 = new ATM("SBI", "MG Road", 500000.00);
        System.out.println("Check location: " + (atm == atm1));
        System.out.println("Both are same? " + atm1.equals(atm));
        System.out.println("**************************************");

        HoneyBee bee = new HoneyBee("Apis Mellifera", 1.2, "Forest Edge");
        System.out.println("80" + bee);
        System.out.println(bee.hashCode());
        System.out.println(System.identityHashCode(bee));
        HoneyBee bee1 = new HoneyBee("Apis Mellifera", 1.2, "Forest Edge");
        System.out.println("Check location: " + (bee == bee1));
        System.out.println("Both are same? " + bee1.equals(bee));
        System.out.println("**************************************");

        Umbrella umbrella = new Umbrella("Red", "Medium", 349.0);
        System.out.println("81" + umbrella);
        System.out.println(umbrella.hashCode());
        System.out.println(System.identityHashCode(umbrella));
        Umbrella umbrella1 = new Umbrella("Red", "Large", 499.99);
        System.out.println("Check location: " + (umbrella == umbrella1));
        System.out.println("Both are same? " + umbrella1.equals(umbrella));
        System.out.println("**************************************");

        Zombie zombie = new Zombie("Walker", 2, "Haunt");
        System.out.println("82" + zombie);
        System.out.println(zombie.hashCode());
        System.out.println(System.identityHashCode(zombie));
        Zombie zombie1 = new Zombie("Walker", 3, "Graveyard");
        System.out.println("Check location: " + (zombie == zombie1));
        System.out.println("Both are same? " + zombie1.equals(zombie));
        System.out.println("**************************************");

        Shampoo shampoo = new Shampoo("Dove", "Anti-dandruff", 180.0);
        System.out.println("83" + shampoo);
        System.out.println(shampoo.hashCode());
        System.out.println(System.identityHashCode(shampoo));
        Shampoo shampoo1 = new Shampoo("Dove", "Anti-dandruff", 180.0);
        System.out.println("Check location: " + (shampoo == shampoo1));
        System.out.println("Both are same? " + shampoo1.equals(shampoo));
        System.out.println("**************************************");

        Alien alien = new Alien("Zeb", 300, "Zygon");
        System.out.println("84" + alien);
        System.out.println(alien.hashCode());
        System.out.println(System.identityHashCode(alien));
        Alien alien1 = new Alien("Mars", 120, "Zygon");
        System.out.println("Check location: " + (alien == alien1));
        System.out.println("Both are same? " + alien1.equals(alien));
        System.out.println("**************************************");

        Box box = new Box("Plastic", "Brown", 1.2);
        System.out.println("85" + box);
        System.out.println(box.hashCode());
        System.out.println(System.identityHashCode(box));
        Box box1 = new Box("Plastic", "Blue", 2.5);
        System.out.println("Check location: " + (box == box1));
        System.out.println("Both are same? " + box1.equals(box));
        System.out.println("**************************************");

        Cupboard cupboard = new Cupboard("Wood", 4, "Walnut Brown");
        System.out.println("86" + cupboard);
        System.out.println(cupboard.hashCode());
        System.out.println(System.identityHashCode(cupboard));
        Cupboard cupboard1 = new Cupboard("Wood", 4, "Brown");
        System.out.println("Check location: " + (cupboard == cupboard1));
        System.out.println("Both are same? " + cupboard1.equals(cupboard));
        System.out.println("**************************************");

        Pillow pillow = new Pillow("Cotton", "Standard", 299.0);
        System.out.println("87" + pillow);
        System.out.println(pillow.hashCode());
        System.out.println(System.identityHashCode(pillow));
        Pillow pillow1 = new Pillow("Cotton", "Large", 399.0);
        System.out.println("Check location: " + (pillow == pillow1));
        System.out.println("Both are same? " + pillow1.equals(pillow));
        System.out.println("**************************************");

        Ironbox ironBox = new Ironbox("Philips", 1.5, 1299.0);
        System.out.println("88" + ironBox);
        System.out.println(ironBox.hashCode());
        System.out.println(System.identityHashCode(ironBox));
        Ironbox ironbox1 = new Ironbox("Philips", 1.2, 1499.0);
        System.out.println("Check location: " + (ironBox == ironbox1));
        System.out.println("Both are same? " + ironbox1.equals(ironBox));
        System.out.println("**************************************");

        Bucket bucket = new Bucket("Plastic", 10.0, "Blue");
        System.out.println("89" + bucket);
        System.out.println(bucket.hashCode());
        System.out.println(System.identityHashCode(bucket));
        Bucket bucket1 = new Bucket("Plastic", 10.0, "Blue");
        System.out.println("Check location: " + (bucket == bucket1));
        System.out.println("Both are same? " + bucket1.equals(bucket));
        System.out.println("**************************************");

        Sticker sticker = new Sticker("Smiley", "Round", 15.0);
        System.out.println("90" + sticker);
        System.out.println(sticker.hashCode());
        System.out.println(System.identityHashCode(sticker));
        Sticker sticker1 = new Sticker("Floral", "Round", 15.0);
        System.out.println("Check location: " + (sticker == sticker1));
        System.out.println("Both are same? " + sticker1.equals(sticker));
        System.out.println("**************************************");


        Keychain keychain = new Keychain("Metal", "Heart", 49.0);
        System.out.println("91" + keychain);
        System.out.println(keychain.hashCode());
        System.out.println(System.identityHashCode(keychain));
        Keychain keychain1 = new Keychain("Leather", "Oval", 50.0);
        System.out.println("Check location: " + (keychain == keychain1));
        System.out.println("Both are same? " + keychain1.equals(keychain));
        System.out.println("**************************************");

        AngryBird angryBird = new AngryBird("Red", "Red", "Explosive Launch");
        System.out.println("92" + angryBird);
        System.out.println(angryBird.hashCode());
        System.out.println(System.identityHashCode(angryBird));
        AngryBird angryBird1 = new AngryBird("Red", "Red", "Explode");
        System.out.println("Check location: " + (angryBird == angryBird1));
        System.out.println("Both are same? " + angryBird1.equals(angryBird));
        System.out.println("**************************************");

        Pizza pizza = new Pizza("Margherita", "Medium", 299.0);
        System.out.println("93" + pizza);
        System.out.println(pizza.hashCode());
        System.out.println(System.identityHashCode(pizza));
        Pizza pizza1 = new Pizza("Margherita", "Medium", 299.0);
        System.out.println("Check location: " + (pizza == pizza1));
        System.out.println("Both are same? " + pizza1.equals(pizza));
        System.out.println("**************************************");

        Scale scale = new Scale("Plastic", 30, "Camlin");
        System.out.println("94" + scale);
        System.out.println(scale.hashCode());
        System.out.println(System.identityHashCode(scale));
        Scale scale1 = new Scale("Plastic", 15, "Camlin");
        System.out.println("Check location: " + (scale == scale1));
        System.out.println("Both are same? " + scale1.equals(scale));
        System.out.println("**************************************");

        Rainbow rainbow = new Rainbow(7, "Arc", "After Rain");
        System.out.println("95" + rainbow);
        System.out.println(rainbow.hashCode());
        System.out.println(System.identityHashCode(rainbow));
        Rainbow rainbow1 = new Rainbow(7, "Arc", "Evening");
        System.out.println("Check location: " + (rainbow == rainbow1));
        System.out.println("Both are same? " + rainbow1.equals(rainbow));
        System.out.println("**************************************");

        Barbie barbie = new Barbie("Party Dress", "Blonde", 799.0);
        System.out.println("96" + barbie);
        System.out.println(barbie.hashCode());
        System.out.println(System.identityHashCode(barbie));
        Barbie barbie1 = new Barbie("Party Dress", "Blonde", 1499.99);
        System.out.println("Check location: " + (barbie == barbie1));
        System.out.println("Both are same? " + barbie1.equals(barbie));
        System.out.println("**************************************");

        Fanta fanta = new Fanta("Orange", 500, 45);
        System.out.println("97" + fanta);
        System.out.println(fanta.hashCode());
        System.out.println(System.identityHashCode(fanta));
        Fanta fanta1 = new Fanta("Orange", 500, 40);
        System.out.println("Check location: " + (fanta == fanta1));
        System.out.println("Both are same? " + fanta1.equals(fanta));
        System.out.println("**************************************");

        Festival festival = new Festival("Diwali", "November", "Lamps");
        System.out.println("98" + festival);
        System.out.println(festival.hashCode());
        System.out.println(System.identityHashCode(festival));
        Festival festival1 = new Festival("Diwali", "October", "Lighting lamps");
        System.out.println("Check location: " + (festival == festival1));
        System.out.println("Both are same? " + festival1.equals(festival));
        System.out.println("**************************************");

        Currency currency = new Currency("India", "Rupee", 1.0);
        System.out.println("99" + currency);
        System.out.println(currency.hashCode());
        System.out.println(System.identityHashCode(currency));
        Currency currency1 = new Currency("India", "Rupee", 1.0);
        System.out.println("Check location: " + (currency == currency1));
        System.out.println("Both are same? " + currency1.equals(currency));
        System.out.println("**************************************");

        Pillar pillar = new Pillar("Concrete", 4.5, "Temple");
        System.out.println("100" + pillar);
        System.out.println(pillar.hashCode());
        System.out.println(System.identityHashCode(pillar));
        Pillar pillar1 = new Pillar("Concrete", 12.5, "Bridge");
        System.out.println("Check location: " + (pillar == pillar1));
        System.out.println("Both are same? " + pillar1.equals(pillar));
    }
}
