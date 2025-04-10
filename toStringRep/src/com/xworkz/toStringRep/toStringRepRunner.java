package com.xworkz.toStringRep;

public class toStringRepRunner {
    public static void main(String[] args) {
        Bottle bottle = new Bottle("Black",5,"Round");
        System.out.println("1" +bottle);
        System.out.println(bottle.hashCode());
        System.out.println(System.identityHashCode(bottle));
        System.out.println("**************************************");

        Shoe shoe = new Shoe("Nike", 9, "White");
        System.out.println("2"+shoe);
        System.out.println(shoe.hashCode());
        System.out.println(System.identityHashCode(shoe));
        System.out.println("**************************************");

        Watch watch = new Watch("Titan", "Analog", 2499.0);
        System.out.println("3" + watch);
        System.out.println(watch);
        System.out.println(System.identityHashCode(watch));
        System.out.println("**************************************");

        Laptop laptop = new Laptop("Dell", 16, 68999.99);
        System.out.println("4" + laptop);
        System.out.println(laptop.hashCode());
        System.out.println(System.identityHashCode(laptop));
        System.out.println("**************************************");

        Mobile mobile = new Mobile("Samsung", "Galaxy S23", 74999.0);
        System.out.println("5" + mobile);
        System.out.println(mobile.hashCode());
        System.out.println(System.identityHashCode(mobile));
        System.out.println("**************************************");

        Car car = new Car("Toyota", "Fortuner", 2023);
        System.out.println("6" + car);
        System.out.println(car.hashCode());
        System.out.println(System.identityHashCode(car));
        System.out.println("**************************************");

        Parachute parachute = new Parachute("Nylon", "Red", 5.5);
        System.out.println("7" + parachute);
        System.out.println(parachute.hashCode());
        System.out.println(System.identityHashCode(parachute));
        System.out.println("**************************************");

        Fan fan = new Fan("Havells", 1200, "Ceiling");
        System.out.println("8" + fan);
        System.out.println(fan.hashCode());
        System.out.println(System.identityHashCode(fan));
        System.out.println("**************************************");

        Fire fire = new Fire("Wood", "Orange", 600);
        System.out.println("9" + fire);
        System.out.println(fire.hashCode());
        System.out.println(System.identityHashCode(fire));
        System.out.println("**************************************");

        Robot robot = new Robot("XJ9", "Humanoid", 24);
        System.out.println("10" + robot);
        System.out.println(robot.hashCode());
        System.out.println(System.identityHashCode(robot));
        System.out.println("**************************************");

        System.out.println("**************************************");

        Candy candy = new Candy("Strawberry", "Pink", 15.0);
        System.out.println("11" + candy);
        System.out.println(candy.hashCode());
        System.out.println(System.identityHashCode(candy));
        System.out.println("**************************************");

        Camera camera = new Camera("Canon", 24.2, "DSLR");
        System.out.println("12" + camera);
        System.out.println(camera.hashCode());
        System.out.println(System.identityHashCode(camera));
        System.out.println("**************************************");

        Clip clip = new Clip("Metal", "Silver", 3.5);
        System.out.println("13" + clip);
        System.out.println(clip.hashCode());
        System.out.println(System.identityHashCode(clip));
        System.out.println("**************************************");

        Tubelight tubelight = new Tubelight("Philips", 48, 36);
        System.out.println("14" + tubelight);
        System.out.println(tubelight.hashCode());
        System.out.println(System.identityHashCode(tubelight));
        System.out.println("**************************************");

        Balloon balloon = new Balloon("Red", "Heart", 12.5);
        System.out.println("15" + balloon);
        System.out.println(balloon.hashCode());
        System.out.println(System.identityHashCode(balloon));
        System.out.println("**************************************");

        Airpods airpods = new Airpods("Apple", "AirPods Pro", 6);
        System.out.println("16" + airpods);
        System.out.println(airpods.hashCode());
        System.out.println(System.identityHashCode(airpods));
        System.out.println("**************************************");

        Boat boat = new Boat("Speedboat", "White", 8);
        System.out.println("17" + boat);
        System.out.println(boat.hashCode());
        System.out.println(System.identityHashCode(boat));
        System.out.println("**************************************");

        Lipstick lipstick = new Lipstick("Lakme", "Cherry Red", 299.0);
        System.out.println("18" + lipstick);
        System.out.println(lipstick.hashCode());
        System.out.println(System.identityHashCode(lipstick));
        System.out.println("**************************************");

        Zudio zudio = new Zudio("T-Shirt", "M", 499.0);
        System.out.println("19" + zudio);
        System.out.println(zudio.hashCode());
        System.out.println(System.identityHashCode(zudio));
        System.out.println("**************************************");

        Sandal sandal = new Sandal("Bata", "8", "Brown");
        System.out.println("20" + sandal);
        System.out.println(sandal.hashCode());
        System.out.println(System.identityHashCode(sandal));
        System.out.println("**************************************");

        DreamCatcher dreamCatcher = new DreamCatcher("Turquoise", 8.5, "Feathers & Beads");
        System.out.println("21" + dreamCatcher);
        System.out.println(dreamCatcher.hashCode());
        System.out.println(System.identityHashCode(dreamCatcher));
        System.out.println("**************************************");

        Skirt skirt = new Skirt("Zara", "Knee-length", "Beige");
        System.out.println("22" + skirt);
        System.out.println(skirt.hashCode());
        System.out.println(System.identityHashCode(skirt));
        System.out.println("**************************************");

        Cream cream = new Cream("Nivea", "Moisturizing", 199.0);
        System.out.println("23" + cream);
        System.out.println(cream.hashCode());
        System.out.println(System.identityHashCode(cream));
        System.out.println("**************************************");

        Weather weather = new Weather("Cloudy", 27.5, "Bangalore");
        System.out.println("24" + weather);
        System.out.println(weather.hashCode());
        System.out.println(System.identityHashCode(weather));
        System.out.println("**************************************");

        Coin coin = new Coin("Nickel", 5.0, 2020);
        System.out.println("25" + coin);
        System.out.println(coin.hashCode());
        System.out.println(System.identityHashCode(coin));
        System.out.println("**************************************");

        Chats chats = new Chats("Shashank", "Hey, how's it going?", "10:45 AM");
        System.out.println("26" + chats);
        System.out.println(chats.hashCode());
        System.out.println(System.identityHashCode(chats));
        System.out.println("**************************************");

        BathTub bathTub = new BathTub("Oval", "Acrylic", 5.5);
        System.out.println("27" + bathTub);
        System.out.println(bathTub.hashCode());
        System.out.println(System.identityHashCode(bathTub));
        System.out.println("**************************************");

        Candle candle = new Candle("Lavender", "Purple", 20);
        System.out.println("28" + candle);
        System.out.println(candle.hashCode());
        System.out.println(System.identityHashCode(candle));
        System.out.println("**************************************");

        Socks socks = new Socks("Nike", "Free Size", "Black");
        System.out.println("29" + socks);
        System.out.println(socks.hashCode());
        System.out.println(System.identityHashCode(socks));
        System.out.println("**************************************");

        Chain chain = new Chain("Gold", 22.0, "Curb");
        System.out.println("30" + chain);
        System.out.println(chain.hashCode());
        System.out.println(System.identityHashCode(chain));
        System.out.println("**************************************");

        Bank bank = new Bank("SBI", "MG Road", "SBIN0000426");
        System.out.println("31" + bank);
        System.out.println(bank.hashCode());
        System.out.println(System.identityHashCode(bank));
        System.out.println("**************************************");

        Shark shark = new Shark("Great White", 15.0, "Pacific");
        System.out.println("32" + shark);
        System.out.println(shark.hashCode());
        System.out.println(System.identityHashCode(shark));
        System.out.println("**************************************");

        Google google = new Google("Search Engine", "Larry Page", 1998);
        System.out.println("33" + google);
        System.out.println(google.hashCode());
        System.out.println(System.identityHashCode(google));
        System.out.println("**************************************");

        Metro metro = new Metro("Delhi", 6, 35.0);
        System.out.println("34" + metro);
        System.out.println(metro.hashCode());
        System.out.println(System.identityHashCode(metro));
        System.out.println("**************************************");

        Satellite satellite = new Satellite("Chandrayaan-3", "India", 2023);
        System.out.println("35" + satellite);
        System.out.println(satellite.hashCode());
        System.out.println(System.identityHashCode(satellite));
        System.out.println("**************************************");

        Hippopotamus hippo = new Hippopotamus("Happy", 1500.0, "River");
        System.out.println("36" + hippo);
        System.out.println(hippo.hashCode());
        System.out.println(System.identityHashCode(hippo));
        System.out.println("**************************************");

        Crackers crackers = new Crackers("Flowerpot", "Standard", 199.0);
        System.out.println("37" + crackers);
        System.out.println(crackers.hashCode());
        System.out.println(System.identityHashCode(crackers));
        System.out.println("**************************************");

        Gun gun = new Gun("Glock 17", "Pistol", 17);
        System.out.println("38" + gun);
        System.out.println(gun.hashCode());
        System.out.println(System.identityHashCode(gun));
        System.out.println("**************************************");

        Restaurant restaurant = new Restaurant("Spice Villa", "Indian", 4.5);
        System.out.println("39" + restaurant);
        System.out.println(restaurant.hashCode());
        System.out.println(System.identityHashCode(restaurant));
        System.out.println("**************************************");

        Banner banner = new Banner("Welcome", "Red", 10);
        System.out.println("40" + banner);
        System.out.println(banner.hashCode());
        System.out.println(System.identityHashCode(banner));
        System.out.println("**************************************");

        Sky sky = new Sky("Blue", "Morning", true);
        System.out.println("41" + sky);
        System.out.println(sky.hashCode());
        System.out.println(System.identityHashCode(sky));
        System.out.println("**************************************");

        Bubbles bubbles = new Bubbles("Small", "Transparent", 100);
        System.out.println("42" + bubbles);
        System.out.println(bubbles.hashCode());
        System.out.println(System.identityHashCode(bubbles));
        System.out.println("**************************************");

        Soil soil = new Soil("Loamy", "Brown", true);
        System.out.println("43" + soil);
        System.out.println(soil.hashCode());
        System.out.println(System.identityHashCode(soil));
        System.out.println("**************************************");

        Lenskart lenskart = new Lenskart("Full Rim", "Blue Light Filter", 2499.0);
        System.out.println("44" + lenskart);
        System.out.println(lenskart.hashCode());
        System.out.println(System.identityHashCode(lenskart));
        System.out.println("**************************************");

        House house = new House("Modern", 2, true);
        System.out.println("45" + house);
        System.out.println(house.hashCode());
        System.out.println(System.identityHashCode(house));
        System.out.println("**************************************");

        Mat mat = new Mat("Rubber", "Green", 6.0);
        System.out.println("46" + mat);
        System.out.println(mat.hashCode());
        System.out.println(System.identityHashCode(mat));
        System.out.println("**************************************");

        Wallpaper wallpaper = new Wallpaper("Floral", "Beige", 899.0);
        System.out.println("47" + wallpaper);
        System.out.println(wallpaper.hashCode());
        System.out.println(System.identityHashCode(wallpaper));
        System.out.println("**************************************");

        Ring ring = new Ring("Gold", "Classic Band", 15999.0);
        System.out.println("48" + ring);
        System.out.println(ring.hashCode());
        System.out.println(System.identityHashCode(ring));
        System.out.println("**************************************");

        Dustbin dustbin = new Dustbin("Plastic", "Green", 25);
        System.out.println("49" + dustbin);
        System.out.println(dustbin.hashCode());
        System.out.println(System.identityHashCode(dustbin));
        System.out.println("**************************************");

        Movie movie = new Movie("Inception", "Sci-Fi", 8.8);
        System.out.println("50" + movie);
        System.out.println(movie.hashCode());
        System.out.println(System.identityHashCode(movie));
        System.out.println("**************************************");


        Needle needle = new Needle("Sewing", 3.5, true);
        System.out.println("51" + needle);
        System.out.println(needle.hashCode());
        System.out.println(System.identityHashCode(needle));
        System.out.println("**************************************");

        Cotton cotton = new Cotton("Premium", "India", 250.0);
        System.out.println("52" + cotton);
        System.out.println(cotton.hashCode());
        System.out.println(System.identityHashCode(cotton));
        System.out.println("**************************************");

        Projector projector = new Projector("Epson", "LED", 35999.0);
        System.out.println("53" + projector);
        System.out.println(projector.hashCode());
        System.out.println(System.identityHashCode(projector));
        System.out.println("**************************************");

        Zepto zepto = new Zepto("Milk", "Grocery", 52.0);
        System.out.println("54" + zepto);
        System.out.println(zepto.hashCode());
        System.out.println(System.identityHashCode(zepto));
        System.out.println("**************************************");

        Basket basket = new Basket("Wicker", "Brown", 12);
        System.out.println("55" + basket);
        System.out.println(basket.hashCode());
        System.out.println(System.identityHashCode(basket));
        System.out.println("**************************************");

        Thread thread = new Thread("Red", "Cotton", 100.0);
        System.out.println("56" + thread);
        System.out.println(thread.hashCode());
        System.out.println(System.identityHashCode(thread));
        System.out.println("**************************************");

        Keyboard keyboard = new Keyboard("Logitech", "Mechanical", 2499.0);
        System.out.println("57" + keyboard);
        System.out.println(keyboard.hashCode());
        System.out.println(System.identityHashCode(keyboard));
        System.out.println("**************************************");

        Song song = new Song("Perfect", "Ed Sheeran", 4.2);
        System.out.println("58" + song);
        System.out.println(song.hashCode());
        System.out.println(System.identityHashCode(song));
        System.out.println("**************************************");

        Wire wire = new Wire("Copper", "Red", 15.0);
        System.out.println("59" + wire);
        System.out.println(wire.hashCode());
        System.out.println(System.identityHashCode(wire));
        System.out.println("**************************************");

        Bangle bangle = new Bangle("Gold", "Yellow", 6.5);
        System.out.println("60" + bangle);
        System.out.println(bangle.hashCode());
        System.out.println(System.identityHashCode(bangle));
        System.out.println("**************************************");


        Mars mars = new Mars("Red", 225.0, false);
        System.out.println("61" + mars);
        System.out.println(mars.hashCode());
        System.out.println(System.identityHashCode(mars));
        System.out.println("**************************************");

        Astronut astronut = new Astronut("Neil", "MarsX", 35);
        System.out.println("62" + astronut);
        System.out.println(astronut.hashCode());
        System.out.println(System.identityHashCode(astronut));
        System.out.println("**************************************");

        Telescope telescope = new Telescope("Celestron", "Reflector", 150.0);
        System.out.println("63" + telescope);
        System.out.println(telescope.hashCode());
        System.out.println(System.identityHashCode(telescope));
        System.out.println("**************************************");

        River river = new River("Ganga", 2525.0, "Gangotri");
        System.out.println("64" + river);
        System.out.println(river.hashCode());
        System.out.println(System.identityHashCode(river));
        System.out.println("**************************************");

        Vicks vicks = new Vicks("Vaporub", "Menthol", 45.0);
        System.out.println("65" + vicks);
        System.out.println(vicks.hashCode());
        System.out.println(System.identityHashCode(vicks));
        System.out.println("**************************************");

        Email email = new Email("nik@example.com", "vaish@example.com", "Meeting");
        System.out.println("66" + email);
        System.out.println(email.hashCode());
        System.out.println(System.identityHashCode(email));
        System.out.println("**************************************");

        Wonderla wonderla = new Wonderla("Bangalore", 55, 1350.0);
        System.out.println("67" + wonderla);
        System.out.println(wonderla.hashCode());
        System.out.println(System.identityHashCode(wonderla));
        System.out.println("**************************************");

        Powerbank powerbank = new Powerbank("Mi", 20000, 1499.0);
        System.out.println("68" + powerbank);
        System.out.println(powerbank.hashCode());
        System.out.println(System.identityHashCode(powerbank));
        System.out.println("**************************************");

        Towel towel = new Towel("Cotton", "White", 150.0);
        System.out.println("69" + towel);
        System.out.println(towel.hashCode());
        System.out.println(System.identityHashCode(towel));
        System.out.println("**************************************");

        Cooler cooler = new Cooler("Bajaj", "Air Cooler", 5999.0);
        System.out.println("70" + cooler);
        System.out.println(cooler.hashCode());
        System.out.println(System.identityHashCode(cooler));
        System.out.println("**************************************");

        Gym gym = new Gym("Gold's Gym", "Bangalore", 120);
        System.out.println("71" + gym);
        System.out.println(gym.hashCode());
        System.out.println(System.identityHashCode(gym));
        System.out.println("**************************************");

        BookStall bookStall = new BookStall("The Book Nook", "MG Road", 500);
        System.out.println("72" + bookStall);
        System.out.println(bookStall.hashCode());
        System.out.println(System.identityHashCode(bookStall));
        System.out.println("**************************************");

        Airport airport = new Airport("Kempegowda International", "Bangalore", 3);
        System.out.println("73" + airport);
        System.out.println(airport.hashCode());
        System.out.println(System.identityHashCode(airport));
        System.out.println("**************************************");

        Kidney kidney = new Kidney("Human", "Filter blood", 10.5);
        System.out.println("74" + kidney);
        System.out.println(kidney.hashCode());
        System.out.println(System.identityHashCode(kidney));
        System.out.println("**************************************");

        Belt belt = new Belt("Leather", "Black", 799.0);
        System.out.println("75" + belt);
        System.out.println(belt.hashCode());
        System.out.println(System.identityHashCode(belt));
        System.out.println("**************************************");

        Auditorium auditorium = new Auditorium("Ravindra Auditorium", 1000, "Bangalore");
        System.out.println("76" + auditorium);
        System.out.println(auditorium.hashCode());
        System.out.println(System.identityHashCode(auditorium));
        System.out.println("**************************************");

        Theater theater = new Theater("PVR Cinemas", 10, "Koramangala");
        System.out.println("77" + theater);
        System.out.println(theater.hashCode());
        System.out.println(System.identityHashCode(theater));
        System.out.println("**************************************");

        Aquarium aquarium = new Aquarium("Siam Ocean World", 5000, "Bangkok");
        System.out.println("78" + aquarium);
        System.out.println(aquarium.hashCode());
        System.out.println(System.identityHashCode(aquarium));
        System.out.println("**************************************");

        ATM atm = new ATM("HDFC", "Bangalore", 100000.0);
        System.out.println("79" + atm);
        System.out.println(atm.hashCode());
        System.out.println(System.identityHashCode(atm));
        System.out.println("**************************************");

        HoneyBee honeyBee = new HoneyBee("Apis mellifera", 2.5, "Tree");
        System.out.println("80" + honeyBee);
        System.out.println(honeyBee.hashCode());
        System.out.println(System.identityHashCode(honeyBee));
        System.out.println("**************************************");

        Umbrella umbrella = new Umbrella("Red", "Medium", 349.0);
        System.out.println("81" + umbrella);
        System.out.println(umbrella.hashCode());
        System.out.println(System.identityHashCode(umbrella));
        System.out.println("**************************************");

        Zombie zombie = new Zombie("Walker", 2, "Haunt");
        System.out.println("82" + zombie);
        System.out.println(zombie.hashCode());
        System.out.println(System.identityHashCode(zombie));
        System.out.println("**************************************");

        Shampoo shampoo = new Shampoo("Dove", "Anti-Dandruff", 180.0);
        System.out.println("83" + shampoo);
        System.out.println(shampoo.hashCode());
        System.out.println(System.identityHashCode(shampoo));
        System.out.println("**************************************");

        Alien alien = new Alien("Zeb", 300, "Zygon");
        System.out.println("84" + alien);
        System.out.println(alien.hashCode());
        System.out.println(System.identityHashCode(alien));
        System.out.println("**************************************");

        Box box = new Box("Plastic", "Brown", 1.2);
        System.out.println("85" + box);
        System.out.println(box.hashCode());
        System.out.println(System.identityHashCode(box));
        System.out.println("**************************************");

        Cupboard cupboard = new Cupboard("Wood", 4, "Walnut Brown");
        System.out.println("86" + cupboard);
        System.out.println(cupboard.hashCode());
        System.out.println(System.identityHashCode(cupboard));
        System.out.println("**************************************");

        Pillow pillow = new Pillow("Cotton", "Standard", 299.0);
        System.out.println("87" + pillow);
        System.out.println(pillow.hashCode());
        System.out.println(System.identityHashCode(pillow));
        System.out.println("**************************************");

        Ironbox ironBox = new Ironbox("Philips", 1.5, 1299.0);
        System.out.println("88" + ironBox);
        System.out.println(ironBox.hashCode());
        System.out.println(System.identityHashCode(ironBox));
        System.out.println("**************************************");

        Bucket bucket = new Bucket("Plastic", 10.0, "Blue");
        System.out.println("89" + bucket);
        System.out.println(bucket.hashCode());
        System.out.println(System.identityHashCode(bucket));
        System.out.println("**************************************");

        Sticker sticker = new Sticker("Smiley", "Round", 15.0);
        System.out.println("90" + sticker);
        System.out.println(sticker.hashCode());
        System.out.println(System.identityHashCode(sticker));
        System.out.println("**************************************");


        Keychain keychain = new Keychain("Metal", "Heart", 49.0);
        System.out.println("91" + keychain);
        System.out.println(keychain.hashCode());
        System.out.println(System.identityHashCode(keychain));
        System.out.println("**************************************");

        AngryBird angryBird = new AngryBird("Red", "Red", "Explosive Launch");
        System.out.println("92" + angryBird);
        System.out.println(angryBird.hashCode());
        System.out.println(System.identityHashCode(angryBird));
        System.out.println("**************************************");

        Pizza pizza = new Pizza("Margherita", "Medium", 299.0);
        System.out.println("93" + pizza);
        System.out.println(pizza.hashCode());
        System.out.println(System.identityHashCode(pizza));
        System.out.println("**************************************");

        Scale scale = new Scale("Plastic", 30, "Camlin");
        System.out.println("94" + scale);
        System.out.println(scale.hashCode());
        System.out.println(System.identityHashCode(scale));
        System.out.println("**************************************");

        Rainbow rainbow = new Rainbow(7, "Arc", "After Rain");
        System.out.println("95" + rainbow);
        System.out.println(rainbow.hashCode());
        System.out.println(System.identityHashCode(rainbow));
        System.out.println("**************************************");

        Barbie barbie = new Barbie("Party Dress", "Blonde", 799.0);
        System.out.println("96" + barbie);
        System.out.println(barbie.hashCode());
        System.out.println(System.identityHashCode(barbie));
        System.out.println("**************************************");

        Fanta fanta = new Fanta("Orange", 500, 45);
        System.out.println("97" + fanta);
        System.out.println(fanta.hashCode());
        System.out.println(System.identityHashCode(fanta));
        System.out.println("**************************************");

        Festival festival = new Festival("Diwali", "November", "Lamps");
        System.out.println("98" + festival);
        System.out.println(festival.hashCode());
        System.out.println(System.identityHashCode(festival));
        System.out.println("**************************************");

        Currency currency = new Currency("India", "Rupee", 1.0);
        System.out.println("99" + currency);
        System.out.println(currency.hashCode());
        System.out.println(System.identityHashCode(currency));
        System.out.println("**************************************");

        Pillar pillar = new Pillar("Concrete", 4.5, "Temple");
        System.out.println("100" + pillar);
        System.out.println(pillar.hashCode());
        System.out.println(System.identityHashCode(pillar));
    }
}
