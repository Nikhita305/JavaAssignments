package com.inheritance;

public class InheritanceRunner {

    public static void main(String[] args) {
        System.out.println("*********** 1 ***********");

        Instrument instrument = new Instrument();
        instrument.play();
        instrument.tune();
        instrument.store();
        instrument.polish();
        instrument.carry();

        System.out.println();

        Instrument instrument1 = new Guitar();
        instrument1.play();
        instrument1.tune();
        instrument1.store();
        instrument1.polish();
        instrument1.carry();

        System.out.println();

        Guitar guitar = new Guitar();
        guitar.play();
        guitar.tune();
        guitar.store();
        guitar.polish();
        guitar.carry();

        System.out.println();

        Violin violin = new Violin();
        violin.play(instrument);
        violin.play(instrument1);
        violin.play(guitar);

        System.out.println("*********** 2 ***********");

        Appliance appliance = new Appliance();
        appliance.turnOn();
        appliance.turnOff();
        appliance.setTimer();
        appliance.consumePower();
        appliance.showStatus();

        System.out.println();

        Appliance appliance1 = new WashingMachine();
        appliance1.turnOn();
        appliance1.turnOff();
        appliance1.setTimer();
        appliance1.consumePower();
        appliance1.showStatus();

        System.out.println();

        WashingMachine wm = new WashingMachine();
        wm.turnOn();
        wm.turnOff();
        wm.setTimer();
        wm.consumePower();
        wm.showStatus();

        Refridgerator ref = new Refridgerator();
        ref.on(appliance);
        ref.on(wm);
        ref.on(appliance1);

        System.out.println("********* 3 ***********");

        Breakfast breakfast = new Breakfast();
        breakfast.prepare();
        breakfast.serve();
        breakfast.eat();
        breakfast.cleanUp();

        System.out.println();

        System.out.println("**********************");

        Breakfast breakfast1 = new Dosa();
        breakfast1.prepare();
        breakfast1.serve();
        breakfast1.eat();
        breakfast1.cleanUp();

        System.out.println();

        System.out.println("************************");

        Dosa dosa = new Dosa();
        dosa.prepare();
        dosa.serve();
        dosa.eat();
        dosa.cleanUp();

        System.out.println();

        Idli idli = new Idli();
        idli.quality(breakfast);
        idli.quality(breakfast1);
        idli.quality(dosa);


        System.out.println("*********** 4 ***********");

        Cartoon cartoon = new Cartoon();
        cartoon.display();
        cartoon.entertain();
        cartoon.speak();
        cartoon.run();

        System.out.println();

        System.out.println("**********************");

        Cartoon cartoon1 = new Doremon();
        cartoon1.display();
        cartoon1.entertain();
        cartoon1.speak();
        cartoon1.run();

        System.out.println();

        System.out.println("**********************");

        Doremon doremon = new Doremon();
        doremon.display();
        doremon.entertain();
        doremon.speak();
        doremon.run();

        Barbie barbie = new Barbie();
        barbie.dressUp(cartoon);
        barbie.dressUp(doremon);
        barbie.dressUp(cartoon1);

        System.out.println("-----5-----");
        Vehicle vehicle = new Vehicle();
        vehicle.move();
        vehicle.stop();
        vehicle.fuelUp();
        vehicle.honk();
        vehicle.service();

        System.out.println();

        System.out.println("----------");
        Car car = new Car();
        car.move();
        car.stop();
        car.fuelUp();
        car.honk();
        car.service();

        System.out.println();

        System.out.println("---------");
        Vehicle vehicle1 = new Car();
        vehicle1.move();
        vehicle1.stop();
        vehicle1.fuelUp();
        vehicle1.honk();
        vehicle1.service();

        System.out.println();

        Jeep jeep = new Jeep();
        jeep.start(vehicle);
        jeep.start(vehicle1);
        jeep.start(car);

        System.out.println("***** 6 *****");
        Dress dress = new Dress();
        dress.wear();
        dress.wash();
        dress.fold();
        dress.iron();
        dress.pack();

        System.out.println("**********");
        Jeans jeans = new Jeans();
        jeans.wear();
        jeans.wash();
        jeans.fold();
        jeans.iron();
        jeans.pack();

        System.out.println("**********");
        Dress dress1 = new Jeans();
        dress1.wear();
        dress1.wash();
        dress1.fold();
        dress1.iron();
        dress1.pack();

        Top top = new Top();
        top.design(dress);
        top.design(dress1);
        top.design(jeans);

        System.out.println("**** 7 ******");
        Shampoo shampoo = new Shampoo();
        shampoo.apply();
        shampoo.rinse();
        shampoo.foam();
        shampoo.fragrance();
        shampoo.pack();

        System.out.println("**********");
        BBlunt bblunt = new BBlunt();
        bblunt.apply();
        bblunt.rinse();
        bblunt.foam();
        bblunt.fragrance();
        bblunt.pack();

        System.out.println("**********");
        Shampoo shampoo1 = new BBlunt();
        shampoo1.apply();
        shampoo1.rinse();
        shampoo1.foam();
        shampoo1.fragrance();
        shampoo1.pack();

        Pantene pantene = new Pantene();
        pantene.smell(shampoo);
        pantene.smell(shampoo1);
        pantene.smell(bblunt);


        System.out.println("***** 8 *****");
        Fruit fruit = new Fruit();
        fruit.taste();
        fruit.color();
        fruit.shape();
        fruit.season();
        fruit.benefits();

        System.out.println("**********");
        Grape grape = new Grape();
        grape.taste();
        grape.color();
        grape.shape();
        grape.season();
        grape.benefits();

        System.out.println("**********");
        Fruit fruit1 = new Grape();
        fruit1.taste();
        fruit1.color();
        fruit1.shape();
        fruit1.season();
        fruit1.benefits();

        Rasin rasin = new Rasin();
        rasin.color(fruit);
        rasin.color(fruit1);
        rasin.color(grape);

        System.out.println("**** 9 ******");
        Drink drink = new Drink();
        drink.prepare();
        drink.serve();
        drink.taste();
        drink.temperature();
        drink.pack();

        System.out.println("**********");
        Coffee coffee = new Coffee();
        coffee.prepare();
        coffee.serve();
        coffee.taste();
        coffee.temperature();
        coffee.pack();

        System.out.println("**********");
        Drink drink1 = new Coffee();
        drink1.prepare();
        drink1.serve();
        drink1.taste();
        drink1.temperature();
        drink1.pack();

        Tea tea = new Tea();
        tea.taste(drink1);
        tea.taste(drink);
        tea.taste(coffee);


        System.out.println("***** 10 *****");
        Game game = new Game();
        game.start();
        game.play();
        game.pause();
        game.end();
        game.save();

        System.out.println("**********");
        Chess chess = new Chess();
        chess.start();
        chess.play();
        chess.pause();
        chess.end();
        chess.save();

        System.out.println("**********");
        Game game1 = new Chess();
        game1.start();
        game1.play();
        game1.pause();
        game1.end();
        game1.save();

        Ludo ludo = new Ludo();
        ludo.play(game);
        ludo.play(game1);
        ludo.play(chess);

        System.out.println("***** 11 *****");
        Planet planet = new Planet();
        planet.rotate();
        planet.revolve();
        planet.supportLife();
        planet.temperature();
        planet.atmosphere();

        System.out.println("**********");
        Earth earth = new Earth();
        earth.rotate();
        earth.revolve();
        earth.supportLife();
        earth.temperature();
        earth.atmosphere();

        System.out.println("**********");
        Planet planet1 = new Earth();
        planet1.rotate();
        planet1.revolve();
        planet1.supportLife();
        planet1.temperature();
        planet1.atmosphere();

        Mars mars = new Mars();
        mars.size(planet);
        mars.size(planet1);
        mars.size(earth);

        System.out.println("****** 12 ****");
        Festival festival = new Festival();
        festival.celebrate();
        festival.decorate();
        festival.gather();
        festival.eat();
        festival.enjoy();

        System.out.println("**********");
        Diwali diwali = new Diwali();
        diwali.celebrate();
        diwali.decorate();
        diwali.gather();
        diwali.eat();
        diwali.enjoy();

        System.out.println("**********");
        Festival festival1 = new Diwali();
        festival1.celebrate();
        festival1.decorate();
        festival1.gather();
        festival1.eat();
        festival1.enjoy();

        Onam onam = new Onam();
        onam.eat(festival);
        onam.eat(festival1);
        onam.eat(diwali);

        System.out.println("***** 13 *****");
        Music music = new Music();
        music.play();
        music.pause();
        music.stop();
        music.adjustVolume();
        music.selectTrack();

        System.out.println("**********");
        Classical classical = new Classical();
        classical.play();
        classical.pause();
        classical.stop();
        classical.adjustVolume();
        classical.selectTrack();

        System.out.println("**********");
        Music music1 = new Classical();
        music1.play();
        music1.pause();
        music1.stop();
        music1.adjustVolume();
        music1.selectTrack();

        Western western = new Western();
        western.vibe(music);
        western.vibe(music1);
        western.vibe(classical);

        System.out.println("***** 14 *****");
        Food food = new Food();
        food.prepare();
        food.cook();
        food.serve();
        food.eat();
        food.cleanUp();

        System.out.println("**********");
        Pizza pizza = new Pizza();
        pizza.prepare();
        pizza.cook();
        pizza.serve();
        pizza.eat();
        pizza.cleanUp();

        System.out.println("**********");
        Food food1 = new Pizza();
        food1.prepare();
        food1.cook();
        food1.serve();
        food1.eat();
        food1.cleanUp();

        Burger burger = new Burger();
        burger.price(food);
        burger.price(food1);
        burger.price(pizza);

        System.out.println("***** 15 *****");
        Machine machine = new Machine();
        machine.start();
        machine.stop();
        machine.process();
        machine.status();
        machine.maintain();

        System.out.println("**********");
        Robot robot = new Robot();
        robot.start();
        robot.stop();
        robot.process();
        robot.status();
        robot.maintain();

        System.out.println("**********");
        Machine machine1 = new Robot();
        machine1.start();
        machine1.stop();
        machine1.process();
        machine1.status();
        machine1.maintain();

        Vaccum vaccum = new Vaccum();
        vaccum.clean(machine);
        vaccum.clean(machine1);
        vaccum.clean(robot);

        System.out.println("****** 16 ****");
        Ocean ocean = new Ocean();
        ocean.waves();
        ocean.depth();
        ocean.temperature();
        ocean.biodiversity();
        ocean.currents();

        System.out.println("**********");
        Pacific pacific = new Pacific();
        pacific.waves();
        pacific.depth();
        pacific.temperature();
        pacific.biodiversity();
        pacific.currents();

        System.out.println("**********");
        Ocean ocean1 = new Pacific();
        ocean1.waves();
        ocean1.depth();
        ocean1.temperature();
        ocean1.biodiversity();
        ocean1.currents();

        Arabian arabian = new Arabian();
        arabian.wave(ocean);
        arabian.wave(ocean1);
        arabian.wave(pacific);

        System.out.println("***** 17 *****");
        Art art = new Art();
        art.create();
        art.display();
        art.inspire();
        art.sell();
        art.preserve();

        System.out.println("**********");
        Painting painting = new Painting();
        painting.create();
        painting.display();
        painting.inspire();
        painting.sell();
        painting.preserve();

        System.out.println("**********");
        Art art1 = new Painting();
        art1.create();
        art1.display();
        art1.inspire();
        art1.sell();
        art1.preserve();

        Drawing drawing = new Drawing();
        drawing.draw(painting);
        drawing.draw(art);
        drawing.draw(art1);

        System.out.println("***** 18 *****");
        School school = new School();
        school.open();
        school.teach();
        school.breakTime();
        school.exam();
        school.close();

        System.out.println("**********");
        HighSchool highSchool = new HighSchool();
        highSchool.open();
        highSchool.teach();
        highSchool.breakTime();
        highSchool.exam();
        highSchool.close();

        System.out.println("**********");
        School school1 = new HighSchool();
        school1.open();
        school1.teach();
        school1.breakTime();
        school1.exam();
        school1.close();

        Primary primary = new Primary();
        primary.homework(school);
        primary.homework(school1);
        primary.homework(highSchool);

        System.out.println("****** 19 ****");
        Company company = new Company();
        company.register();
        company.hire();
        company.operate();
        company.grow();
        company.payTaxes();

        System.out.println("**********");
        Startup startup = new Startup();
        startup.register();
        startup.hire();
        startup.operate();
        startup.grow();
        startup.payTaxes();

        System.out.println("**********");
        Company company1 = new Startup();
        company1.register();
        company1.hire();
        company1.operate();
        company1.grow();
        company1.payTaxes();

        Mnc mnc = new Mnc();
        mnc.train(company);
        mnc.train(company1);
        mnc.train(startup);


        System.out.println("**** 20 ******");
        Plant plant = new Plant();
        plant.grow();
        plant.absorbWater();
        plant.photosynthesize();
        plant.reproduce();
        plant.survive();

        System.out.println("**********");
        Sunflower sunflower = new Sunflower();
        sunflower.grow();
        sunflower.absorbWater();
        sunflower.photosynthesize();
        sunflower.reproduce();
        sunflower.survive();

        System.out.println("**********");
        Plant plant1 = new Sunflower();
        plant1.grow();
        plant1.absorbWater();
        plant1.photosynthesize();
        plant1.reproduce();
        plant1.survive();

        Jasmin jasmin = new Jasmin();
        jasmin.smell(plant);
        jasmin.smell(sunflower);
        jasmin.smell(plant1);

        System.out.println("***** 21 *****");
        Device device = new Device();
        device.start();
        device.shutDown();
        device.charge();
        device.performTask();
        device.update();

        System.out.println("**********");
        Laptop laptop = new Laptop();
        laptop.start();
        laptop.shutDown();
        laptop.charge();
        laptop.performTask();
        laptop.update();

        System.out.println("**********");
        Device device1 = new Laptop();
        device1.start();
        device1.shutDown();
        device1.charge();
        device1.performTask();
        device1.update();

        Technician technician = new Technician();
        technician.inspect(device);
        technician.inspect(laptop);
        technician.inspect(device1);

        System.out.println("***** 22 *****");
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        animal.move();
        animal.sound();
        animal.habitat();

        System.out.println("**********");
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sleep();
        tiger.move();
        tiger.sound();
        tiger.habitat();

        System.out.println("**********");
        Animal animal1 = new Tiger();
        animal1.eat();
        animal1.sleep();
        animal1.move();
        animal1.sound();
        animal1.habitat();

        Zookeeper zookeeper = new Zookeeper();
        zookeeper.observe(animal);
        zookeeper.observe(tiger);
        zookeeper.observe(animal1);


        System.out.println("****** 23 ****");
        Galaxy galaxy = new Galaxy();
        galaxy.rotate();
        galaxy.expand();
        galaxy.containStars();
        galaxy.emitLight();
        galaxy.hasBlackHole();

        System.out.println("**********");
        MilkyWay milkyWay = new MilkyWay();
        milkyWay.rotate();
        milkyWay.expand();
        milkyWay.containStars();
        milkyWay.emitLight();
        milkyWay.hasBlackHole();

        System.out.println("**********");
        Galaxy galaxy1 = new MilkyWay();
        galaxy1.rotate();
        galaxy1.expand();
        galaxy1.containStars();
        galaxy1.emitLight();
        galaxy1.hasBlackHole();

        Astronomer astronomer = new Astronomer();
        astronomer.study(galaxy);
        astronomer.study(milkyWay);
        astronomer.study(galaxy1);


        System.out.println("****** 24 ****");
        Bird bird = new Bird();
        bird.fly();
        bird.sing();
        bird.buildNest();
        bird.eat();
        bird.migrate();

        System.out.println("**********");
        Parrot parrot = new Parrot();
        parrot.fly();
        parrot.sing();
        parrot.buildNest();
        parrot.eat();
        parrot.migrate();

        System.out.println("**********");
        Bird bird1 = new Parrot();
        bird1.fly();
        bird1.sing();
        bird1.buildNest();
        bird1.eat();
        bird1.migrate();

        Ornithologist ornithologist = new Ornithologist();
        ornithologist.observe(bird);
        ornithologist.observe(parrot);
        ornithologist.observe(bird1);


        System.out.println("***** 25 *****");
        Flower flower = new Flower();
        flower.bloom();
        flower.smell();
        flower.photosynthesize();
        flower.attractBees();
        flower.wilt();

        System.out.println("**********");
        Rose rose = new Rose();
        rose.bloom();
        rose.smell();
        rose.photosynthesize();
        rose.attractBees();
        rose.wilt();

        System.out.println("**********");
        Flower flower1 = new Rose();
        flower1.bloom();
        flower1.smell();
        flower1.photosynthesize();
        flower1.attractBees();
        flower1.wilt();

        Gardener gardener = new Gardener();
        gardener.care(flower);
        gardener.care(rose);
        gardener.care(flower1);


        System.out.println("****** 26 ****");
        Building building = new Building();
        building.construct();
        building.open();
        building.renovate();
        building.clean();
        building.lock();

        System.out.println("**********");
        Temple temple = new Temple();
        temple.construct();
        temple.open();
        temple.renovate();
        temple.clean();
        temple.lock();

        System.out.println("**********");
        Building building1 = new Temple();
        building1.construct();
        building1.open();
        building1.renovate();
        building1.clean();
        building1.lock();

        Architect architect = new Architect();
        architect.design(building);
        architect.design(temple);
        architect.design(building1);


        System.out.println("***** 27 *****");
        Country country = new Country();
        country.name();
        country.population();
        country.language();
        country.capital();
        country.currency();

        System.out.println("**********");
        India india = new India();
        india.name();
        india.population();
        india.language();
        india.capital();
        india.currency();

        System.out.println("**********");
        Country country1 = new India();
        country1.name();
        country1.population();
        country1.language();
        country1.capital();
        country1.currency();

        Diplomat diplomat = new Diplomat();
        diplomat.visit(country);
        diplomat.visit(india);
        diplomat.visit(country1);

        System.out.println("****** 28 ****");
        Profession profession = new Profession();
        profession.type();
        profession.skill();
        profession.workHours();
        profession.income();
        profession.responsibility();

        System.out.println("**********");
        Engineering engineering = new Engineering();
        engineering.type();
        engineering.skill();
        engineering.workHours();
        engineering.income();
        engineering.responsibility();

        System.out.println("**********");
        Profession profession1 = new Engineering();
        profession1.type();
        profession1.skill();
        profession1.workHours();
        profession1.income();
        profession1.responsibility();

        CareerGuide careerGuide = new CareerGuide();
        careerGuide.advise(profession);
        careerGuide.advise(engineering);
        careerGuide.advise(profession1);


        System.out.println("**** 29 ******");
        Emotion emotion = new Emotion();
        emotion.type();
        emotion.expression();
        emotion.impact();
        emotion.duration();
        emotion.intensity();

        System.out.println("**********");
        Happiness happiness = new Happiness();
        happiness.type();
        happiness.expression();
        happiness.impact();
        happiness.duration();
        happiness.intensity();

        System.out.println("**********");
        Emotion emotion1 = new Happiness();
        emotion1.type();
        emotion1.expression();
        emotion1.impact();
        emotion1.duration();
        emotion1.intensity();

        Therapist therapist = new Therapist();
        therapist.analyze(emotion);
        therapist.analyze(happiness);
        therapist.analyze(emotion1);


        System.out.println("**** 30 ******");
        Language language = new Language();
        language.name();
        language.origin();
        language.script();
        language.speakers();
        language.importance();

        System.out.println("**********");
        Kannada kannada = new Kannada();
        kannada.name();
        kannada.origin();
        kannada.script();
        kannada.speakers();
        kannada.importance();

        System.out.println("**********");
        Language language1 = new Kannada();
        language1.name();
        language1.origin();
        language1.script();
        language1.speakers();
        language1.importance();

        Linguist linguist = new Linguist();
        linguist.research(language);
        linguist.research(kannada);
        linguist.research(language1);

        System.out.println("***** 31 *****");
        Tree tree = new Tree();
        tree.type();
        tree.height();
        tree.leaves();
        tree.benefits();
        tree.lifespan();

        System.out.println("**********");
        Coconut coconut = new Coconut();
        coconut.type();
        coconut.height();
        coconut.leaves();
        coconut.benefits();
        coconut.lifespan();

        System.out.println("**********");
        Tree tree1 = new Coconut();
        tree1.type();
        tree1.height();
        tree1.leaves();
        tree1.benefits();
        tree1.lifespan();

        Botanist botanist = new Botanist();
        botanist.study(tree);
        botanist.study(coconut);
        botanist.study(tree1);


        System.out.println("***** 32 *****");
        River river = new River();
        river.name();
        river.length();
        river.origin();
        river.flowDirection();
        river.importance();

        System.out.println("**********");
        Ganga ganga = new Ganga();
        ganga.name();
        ganga.length();
        ganga.origin();
        ganga.flowDirection();
        ganga.importance();

        System.out.println("**********");
        River river1 = new Ganga();
        river1.name();
        river1.length();
        river1.origin();
        river1.flowDirection();
        river1.importance();

        Hydrologist hydrologist = new Hydrologist();
        hydrologist.research(river);
        hydrologist.research(ganga);
        hydrologist.research(river1);

        System.out.println("***** 33 *****");
        Mountain mountain = new Mountain();
        mountain.name();
        mountain.height();
        mountain.location();
        mountain.climate();
        mountain.importance();

        System.out.println("**********");
        Himalaya himalaya = new Himalaya();
        himalaya.name();
        himalaya.height();
        himalaya.location();
        himalaya.climate();
        himalaya.importance();

        System.out.println("**********");
        Mountain mountain1 = new Himalaya();
        mountain1.name();
        mountain1.height();
        mountain1.location();
        mountain1.climate();
        mountain1.importance();

        Geographer geographer = new Geographer();
        geographer.study(mountain);
        geographer.study(himalaya);
        geographer.study(mountain1);


        System.out.println("***** 34 *****");
        Currency currency = new Currency();
        currency.name();
        currency.symbol();
        currency.country();
        currency.value();
        currency.usage();

        System.out.println("**********");
        Rupee rupee = new Rupee();
        rupee.name();
        rupee.symbol();
        rupee.country();
        rupee.value();
        rupee.usage();

        System.out.println("**********");
        Currency currency1 = new Rupee();
        currency1.name();
        currency1.symbol();
        currency1.country();
        currency1.value();
        currency1.usage();

        Economist economist = new Economist();
        economist.analyze(currency);
        economist.analyze(rupee);
        economist.analyze(currency1);


        System.out.println("***** 35 *****");
        Vegetable vegetable = new Vegetable();
        vegetable.name();
        vegetable.color();
        vegetable.taste();
        vegetable.nutrients();
        vegetable.season();

        System.out.println("**********");
        Onion onion = new Onion();
        onion.name();
        onion.color();
        onion.taste();
        onion.nutrients();
        onion.season();

        System.out.println("**********");
        Vegetable vegetable1 = new Onion();
        vegetable1.name();
        vegetable1.color();
        vegetable1.taste();
        vegetable1.nutrients();
        vegetable1.season();

        Chef chef = new Chef();
        chef.cook(vegetable);
        chef.cook(onion);
        chef.cook(vegetable1);


        System.out.println("**** 36 ******");
        City city = new City();
        city.name();
        city.population();
        city.famousFor();
        city.climate();
        city.transportation();

        System.out.println("**********");
        Bengaluru bengaluru = new Bengaluru();
        bengaluru.name();
        bengaluru.population();
        bengaluru.famousFor();
        bengaluru.climate();
        bengaluru.transportation();

        System.out.println("**********");
        City city1 = new Bengaluru();
        city1.name();
        city1.population();
        city1.famousFor();
        city1.climate();
        city1.transportation();

        Traveler traveler = new Traveler();
        traveler.visit(city);
        traveler.visit(bengaluru);
        traveler.visit(city1);


        System.out.println("**** 37 ******");
        Color color = new Color();
        color.name();
        color.wavelength();
        color.emotion();
        color.usedIn();
        color.combination();

        System.out.println("**********");
        Purple purple = new Purple();
        purple.name();
        purple.wavelength();
        purple.emotion();
        purple.usedIn();
        purple.combination();

        System.out.println("**********");
        Color color1 = new Purple();
        color1.name();
        color1.wavelength();
        color1.emotion();
        color1.usedIn();
        color1.combination();

        Creator creator = new Creator();
        creator.apply(color);
        creator.apply(purple);
        creator.apply(color1);

        System.out.println("***** 38 *****");
        Toy toy = new Toy();
        toy.name();
        toy.material();
        toy.color();
        toy.purpose();
        toy.ageGroup();

        System.out.println("**********");
        Teddy teddy = new Teddy();
        teddy.name();
        teddy.material();
        teddy.color();
        teddy.purpose();
        teddy.ageGroup();

        System.out.println("**********");
        Toy toy1 = new Teddy();
        toy1.name();
        toy1.material();
        toy1.color();
        toy1.purpose();
        toy1.ageGroup();

        Child child = new Child();
        child.play(toy);
        child.play(teddy);
        child.play(toy1);


        System.out.println("***** 39 *****");
        Mobile mobile = new Mobile();
        mobile.brand();
        mobile.features();
        mobile.battery();
        mobile.camera();
        mobile.storage();

        System.out.println("**********");
        Redmi redmi = new Redmi();
        redmi.brand();
        redmi.features();
        redmi.battery();
        redmi.camera();
        redmi.storage();

        System.out.println("**********");
        Mobile mobile1 = new Redmi();
        mobile1.brand();
        mobile1.features();
        mobile1.battery();
        mobile1.camera();
        mobile1.storage();

        Shopkeeper shopkeeper = new Shopkeeper();
        shopkeeper.display(mobile);
        shopkeeper.display(redmi);
        shopkeeper.display(mobile1);


        System.out.println("***** 40 *****");
        Book book = new Book();
        book.title();
        book.author();
        book.genre();
        book.pages();
        book.language();

        System.out.println("**********");
        Novel novel = new Novel();
        novel.title();
        novel.author();
        novel.genre();
        novel.pages();
        novel.language();

        System.out.println("**********");
        Book book1 = new Novel();
        book1.title();
        book1.author();
        book1.genre();
        book1.pages();
        book1.language();

        Librarian librarian = new Librarian();
        librarian.read(book);
        librarian.read(novel);
        librarian.read(book1);


        System.out.println("***** 41 *****");
        Beverage beverage = new Beverage();
        beverage.name();
        beverage.temperature();
        beverage.ingredients();
        beverage.taste();
        beverage.occasion();

        System.out.println("**********");
        BubbleTea bubbleTea = new BubbleTea();
        bubbleTea.name();
        bubbleTea.temperature();
        bubbleTea.ingredients();
        bubbleTea.taste();
        bubbleTea.occasion();

        System.out.println("**********");
        Beverage beverage1 = new BubbleTea();
        beverage1.name();
        beverage1.temperature();
        beverage1.ingredients();
        beverage1.taste();
        beverage1.occasion();

        Cafe cafe = new Cafe();
        cafe.serve(beverage);
        cafe.serve(bubbleTea);
        cafe.serve(beverage1);


        System.out.println("***** 42 *****");
        Ride ride = new Ride();
        ride.name();
        ride.speed();
        ride.duration();
        ride.thrillLevel();
        ride.safety();

        System.out.println("**********");
        RollerCoaster rc = new RollerCoaster();
        rc.name();
        rc.speed();
        rc.duration();
        rc.thrillLevel();
        rc.safety();

        System.out.println("**********");
        Ride ride1 = new RollerCoaster();
        ride1.name();
        ride1.speed();
        ride1.duration();
        ride1.thrillLevel();
        ride1.safety();

        AmusementPark amusementPark = new AmusementPark();
        amusementPark.enjoy(ride);
        amusementPark.enjoy(rc);
        amusementPark.enjoy(ride1);


        System.out.println("***** 43 *****");
        Chaats chaats = new Chaats();
        chaats.name();
        chaats.ingredients();
        chaats.origin();
        chaats.taste();
        chaats.served();

        System.out.println("**********");
        Panipuri pani = new Panipuri();
        pani.name();
        pani.ingredients();
        pani.origin();
        pani.taste();
        pani.served();

        System.out.println("**********");
        Chaats chaats1 = new Panipuri();
        chaats1.name();
        chaats1.ingredients();
        chaats1.origin();
        chaats1.taste();
        chaats1.served();

        FoodStall foodStall = new FoodStall();
        foodStall.serve(chaats);
        foodStall.serve(pani);
        foodStall.serve(chaats1);


        System.out.println("***** 44 *****");
        Snack snack = new Snack();
        snack.name();
        snack.type();
        snack.ingredients();
        snack.served();
        snack.popularity();

        System.out.println("**********");
        Samosa samosa = new Samosa();
        samosa.name();
        samosa.type();
        samosa.ingredients();
        samosa.served();
        samosa.popularity();

        System.out.println("**********");
        Snack snack1 = new Samosa();
        snack1.name();
        snack1.type();
        snack1.ingredients();
        snack1.served();
        snack1.popularity();

        StreetVendor vendor = new StreetVendor();
        vendor.display(snack);
        vendor.display(samosa);
        vendor.display(snack1);


        System.out.println("***** 45 *****");
        Juice juice = new Juice();
        juice.name();
        juice.fruitUsed();
        juice.taste();
        juice.temperature();
        juice.benefit();

        System.out.println("**********");
        Mango mango = new Mango();
        mango.name();
        mango.fruitUsed();
        mango.taste();
        mango.temperature();
        mango.benefit();

        System.out.println("**********");
        Juice juice1 = new Mango();
        juice1.name();
        juice1.fruitUsed();
        juice1.taste();
        juice1.temperature();
        juice1.benefit();

        JuiceBar bar = new JuiceBar();
        bar.serve(juice);
        bar.serve(mango);
        bar.serve(juice1);


        System.out.println("**** 46 ******");
        Bike bike = new Bike();
        bike.brand();
        bike.speed();
        bike.fuelType();
        bike.gearSystem();
        bike.mileage();

        System.out.println("**********");
        Pulser pulser = new Pulser();
        pulser.brand();
        pulser.speed();
        pulser.fuelType();
        pulser.gearSystem();
        pulser.mileage();

        System.out.println("**********");
        Bike bike1 = new Pulser();
        bike1.brand();
        bike1.speed();
        bike1.fuelType();
        bike1.gearSystem();
        bike1.mileage();

        BikeShowroom showroom = new BikeShowroom();
        showroom.display(bike);
        showroom.display(bike1);
        showroom.display(pulser);

        System.out.println("****** 47 ****");
        State state = new State();
        state.name();
        state.language();
        state.capital();
        state.famousFor();
        state.population();

        System.out.println("**********");
        Karnataka kar = new Karnataka();
        kar.name();
        kar.language();
        kar.capital();
        kar.famousFor();
        kar.population();

        System.out.println("**********");
        State state1 = new Karnataka();
        state1.name();
        state1.language();
        state1.capital();
        state1.famousFor();
        state1.population();

        ChiefMinister chiefMinister = new ChiefMinister();
        chiefMinister.manage(state);
        chiefMinister.manage(kar);
        chiefMinister.manage(state1);


        System.out.println("***** 48 *****");
        Browser browser = new Browser();
        browser.name();
        browser.speed();
        browser.security();
        browser.extensions();
        browser.platform();

        System.out.println("**********");
        Chrome chrome = new Chrome();
        chrome.name();
        chrome.speed();
        chrome.security();
        chrome.extensions();
        chrome.platform();

        System.out.println("**********");
        Browser browser1 = new Chrome();
        browser1.name();
        browser1.speed();
        browser1.security();
        browser1.extensions();
        browser1.platform();

        User user = new User();
        user.use(browser);
        user.use(chrome);
        user.use(browser1);


        System.out.println("***** 49 *****");
        Season season = new Season();
        season.name();
        season.duration();
        season.temperature();
        season.activities();
        season.clothing();

        System.out.println("**********");
        Summer summer = new Summer();
        summer.name();
        summer.duration();
        summer.temperature();
        summer.activities();
        summer.clothing();

        System.out.println("**********");
        Season season1 = new Summer();
        season1.name();
        season1.duration();
        season1.temperature();
        season1.activities();
        season1.clothing();

        WeatherMan weatherMan = new WeatherMan();
        weatherMan.report(season);
        weatherMan.report(summer);
        weatherMan.report(season1);


        System.out.println("***** 50 *****");
        Pet pet = new Pet();
        pet.name();
        pet.sound();
        pet.food();
        pet.activity();
        pet.sleep();

        System.out.println("**********");
        Cat cat = new Cat();
        cat.name();
        cat.sound();
        cat.food();
        cat.activity();
        cat.sleep();

        System.out.println("**********");
        Pet pet1 = new Cat();
        pet1.name();
        pet1.sound();
        pet1.food();
        pet1.activity();
        pet1.sleep();

        Owner owner = new Owner();
        owner.care(pet);
        owner.care(cat);
        owner.care(pet1);


        System.out.println("###########################################################################################");




        System.out.println("***** 51 *****");
        Sweet sweet = new Sweet();
        sweet.name();
        sweet.flavor();
        sweet.madeOf();
        sweet.color();
        sweet.occasion();

        System.out.println("**********");
        Chocolate chocolate = new Chocolate();
        chocolate.name();
        chocolate.flavor();
        chocolate.madeOf();
        chocolate.color();
        chocolate.occasion();

        System.out.println("**********");
        Sweet sweet1 = new Chocolate();
        sweet1.name();
        sweet1.flavor();
        sweet1.madeOf();
        sweet1.color();
        sweet1.occasion();

        System.out.println("***** 52 *****");
        Transport transport = new Transport();
        transport.type();
        transport.speed();
        transport.capacity();
        transport.cost();
        transport.environmentImpact();

        System.out.println("**********");
        Metro metro = new Metro();
        metro.type();
        metro.speed();
        metro.capacity();
        metro.cost();
        metro.environmentImpact();

        System.out.println("**********");
        Transport transport1 = new Metro();
        transport1.type();
        transport1.speed();
        transport1.capacity();
        transport1.cost();
        transport1.environmentImpact();

        System.out.println("***** 53 *****");
        Dessert dessert = new Dessert();
        dessert.name();
        dessert.sweetnessLevel();
        dessert.temperature();
        dessert.madeOf();
        dessert.servedOn();

        System.out.println("**********");
        IceCream iceCream = new IceCream();
        iceCream.name();
        iceCream.sweetnessLevel();
        iceCream.temperature();
        iceCream.madeOf();
        iceCream.servedOn();

        System.out.println("**********");
        Dessert dessert1 = new IceCream();
        dessert1.name();
        dessert1.sweetnessLevel();
        dessert1.temperature();
        dessert1.madeOf();
        dessert1.servedOn();

        System.out.println("***** 54 *****");
        Subject subject = new Subject();
        subject.name();
        subject.difficultyLevel();
        subject.topics();
        subject.importance();
        subject.field();

        System.out.println("**********");
        Science science = new Science();
        science.name();
        science.difficultyLevel();
        science.topics();
        science.importance();
        science.field();

        System.out.println("**********");
        Subject subject1 = new Science();
        subject1.name();
        subject1.difficultyLevel();
        subject1.topics();
        subject1.importance();
        subject1.field();

        System.out.println("**** 54 ******");
        Item item = new Item();
        item.type();
        item.material();
        item.usage();
        item.color();
        item.cost();

        System.out.println("**********");
        Ribbon ribbon = new Ribbon();
        ribbon.type();
        ribbon.material();
        ribbon.usage();
        ribbon.color();
        ribbon.cost();

        System.out.println("**********");
        Item item1 = new Ribbon();
        item1.type();
        item1.material();
        item1.usage();
        item1.color();
        item1.cost();

        System.out.println("**** 55 ******");
        Application app = new Application();
        app.name();
        app.platform();
        app.purpose();
        app.userCount();
        app.features();

        System.out.println("**********");
        Instagram insta = new Instagram();
        insta.name();
        insta.platform();
        insta.purpose();
        insta.userCount();
        insta.features();

        System.out.println("**********");
        Application app1 = new Instagram();
        app1.name();
        app1.platform();
        app1.purpose();
        app1.userCount();
        app1.features();

        System.out.println("****** 56 ****");
        Gadget gadget = new Gadget();
        gadget.name();
        gadget.purpose();
        gadget.batteryLife();
        gadget.portability();
        gadget.priceRange();

        System.out.println("**********");
        Smartwatch watch = new Smartwatch();
        watch.name();
        watch.purpose();
        watch.batteryLife();
        watch.portability();
        watch.priceRange();

        System.out.println("**********");
        Gadget gadget1 = new Smartwatch();
        gadget1.name();
        gadget1.purpose();
        gadget1.batteryLife();
        gadget1.portability();
        gadget1.priceRange();

        System.out.println("**** 57 ******");
        Star star = new Star();
        star.name();
        star.temperature();
        star.size();
        star.light();
        star.position();

        System.out.println("**********");
        Sun sun = new Sun();
        sun.name();
        sun.temperature();
        sun.size();
        sun.light();
        sun.position();

        System.out.println("**********");
        Star star1 = new Sun();
        star1.name();
        star1.temperature();
        star1.size();
        star1.light();
        star1.position();

        System.out.println("****** 58 ****");
        Furniture furniture = new Furniture();
        furniture.type();
        furniture.material();
        furniture.usage();
        furniture.weight();
        furniture.price();

        System.out.println("**********");
        Sofa sofa = new Sofa();
        sofa.type();
        sofa.material();
        sofa.usage();
        sofa.weight();
        sofa.price();

        System.out.println("**********");
        Furniture furniture1 = new Sofa();
        furniture1.type();
        furniture1.material();
        furniture1.usage();
        furniture1.weight();
        furniture1.price();

        System.out.println("***** 59 *****");
        Camera camera = new Camera();
        camera.brand();
        camera.resolution();
        camera.lensType();
        camera.storage();
        camera.connectivity();

        System.out.println("**********");
        DSLR dslr = new DSLR();
        dslr.brand();
        dslr.resolution();
        dslr.lensType();
        dslr.storage();
        dslr.connectivity();

        System.out.println("**********");
        Camera camera1 = new DSLR();
        camera1.brand();
        camera1.resolution();
        camera1.lensType();
        camera1.storage();
        camera1.connectivity();

        System.out.println("**** 60 ******");
        Shoe shoe = new Shoe();
        shoe.brand();
        shoe.size();
        shoe.type();
        shoe.material();
        shoe.price();

        System.out.println("**********");
        Puma puma = new Puma();
        puma.brand();
        puma.size();
        puma.type();
        puma.material();
        puma.price();

        System.out.println("**********");
        Shoe shoe1 = new Puma();
        shoe1.brand();
        shoe1.size();
        shoe1.type();
        shoe1.material();
        shoe1.price();

        System.out.println("**** 61 ******");
        TV tv = new TV();
        tv.brand();
        tv.screenType();
        tv.resolution();
        tv.smartFeatures();
        tv.size();

        System.out.println("**********");
        LG lg = new LG();
        lg.brand();
        lg.screenType();
        lg.resolution();
        lg.smartFeatures();
        lg.size();

        System.out.println("**********");
        TV tv1 = new LG();
        tv1.brand();
        tv1.screenType();
        tv1.resolution();
        tv1.smartFeatures();
        tv1.size();

        System.out.println("**** 62 ******");
        Light light = new Light();
        light.type();
        light.powerConsumption();
        light.color();
        light.usage();
        light.lifetime();

        System.out.println("**********");
        LED led = new LED();
        led.type();
        led.powerConsumption();
        led.color();
        led.usage();
        led.lifetime();

        System.out.println("**********");
        Light light1 = new LED();
        light1.type();
        light1.powerConsumption();
        light1.color();
        light1.usage();
        light1.lifetime();

        System.out.println("***** 63 *****");
        Bottle bottle = new Bottle();
        bottle.type();
        bottle.material();
        bottle.capacity();
        bottle.use();
        bottle.color();

        System.out.println("**********");
        Thermos thermos = new Thermos();
        thermos.type();
        thermos.material();
        thermos.capacity();
        thermos.use();
        thermos.color();

        System.out.println("**********");
        Bottle bottle1 = new Thermos();
        bottle1.type();
        bottle1.material();
        bottle1.capacity();
        bottle1.use();
        bottle1.color();

        System.out.println("***** 64 *****");
        Continent continent = new Continent();
        continent.name();
        continent.area();
        continent.population();
        continent.climate();
        continent.countries();

        System.out.println("**********");
        Asia asia = new Asia();
        asia.name();
        asia.area();
        asia.population();
        asia.climate();
        asia.countries();

        System.out.println("**********");
        Continent continent1 = new Asia();
        continent1.name();
        continent1.area();
        continent1.population();
        continent1.climate();
        continent1.countries();

        System.out.println("***** 65 *****");
        Tool tool = new Tool();
        tool.name();
        tool.material();
        tool.use();
        tool.weight();
        tool.maintenance();

        System.out.println("**********");
        Hammer hammer = new Hammer();
        hammer.name();
        hammer.material();
        hammer.use();
        hammer.weight();
        hammer.maintenance();

        System.out.println("**********");
        Tool tool1 = new Hammer();
        tool1.name();
        tool1.material();
        tool1.use();
        tool1.weight();
        tool1.maintenance();

        System.out.println("***** 66 *****");
        Candy candy = new Candy();
        candy.name();
        candy.flavor();
        candy.sweetness();
        candy.color();
        candy.pack();

        System.out.println("**********");
        Lollipop lollipop = new Lollipop();
        lollipop.name();
        lollipop.flavor();
        lollipop.sweetness();
        lollipop.color();
        lollipop.pack();

        System.out.println("**********");
        Candy candy1 = new Lollipop();
        candy1.name();
        candy1.flavor();
        candy1.sweetness();
        candy1.color();
        candy1.pack();

        System.out.println("*** 67 *******");
        Biscuit biscuit = new Biscuit();
        biscuit.name();
        biscuit.taste();
        biscuit.texture();
        biscuit.shape();
        biscuit.serve();

        System.out.println("**********");
        Oreo oreo = new Oreo();
        oreo.name();
        oreo.taste();
        oreo.texture();
        oreo.shape();
        oreo.serve();

        System.out.println("**********");
        Biscuit biscuit1 = new Oreo();
        biscuit1.name();
        biscuit1.taste();
        biscuit1.texture();
        biscuit1.shape();
        biscuit1.serve();

        System.out.println("***** 68 *****");
        Paint paint = new Paint();
        paint.name();
        paint.type();
        paint.use();
        paint.dryTime();
        paint.base();

        System.out.println("**********");
        Watercolor wc = new Watercolor();
        wc.name();
        wc.type();
        wc.use();
        wc.dryTime();
        wc.base();

        System.out.println("**********");
        Paint paint1 = new Watercolor();
        paint1.name();
        paint1.type();
        paint1.use();
        paint1.dryTime();
        paint1.base();

        System.out.println("***** 69 *****");
        AI ai = new AI();
        ai.name();
        ai.purpose();
        ai.learningType();
        ai.field();
        ai.interaction();

        System.out.println("**********");
        ChatGPT gpt = new ChatGPT();
        gpt.name();
        gpt.purpose();
        gpt.learningType();
        gpt.field();
        gpt.interaction();

        System.out.println("**********");
        AI ai1 = new ChatGPT();
        ai1.name();
        ai1.purpose();
        ai1.learningType();
        ai1.field();
        ai1.interaction();

        System.out.println("**** 70 ******");
        Outfit outfit = new Outfit();
        outfit.name();
        outfit.fabric();
        outfit.occasion();
        outfit.comfortLevel();
        outfit.trend();

        System.out.println("**********");
        Kurti kurti = new Kurti();
        kurti.name();
        kurti.fabric();
        kurti.occasion();
        kurti.comfortLevel();
        kurti.trend();

        System.out.println("**********");
        Outfit outfit1 = new Kurti();
        outfit1.name();
        outfit1.fabric();
        outfit1.occasion();
        outfit1.comfortLevel();
        outfit1.trend();

        System.out.println("***** 71 *****");
        Eyewear eyewear = new Eyewear();
        eyewear.type();
        eyewear.purpose();
        eyewear.frameMaterial();
        eyewear.style();
        eyewear.wearTime();

        System.out.println("**********");
        Sunglasses sunglasses = new Sunglasses();
        sunglasses.type();
        sunglasses.purpose();
        sunglasses.frameMaterial();
        sunglasses.style();
        sunglasses.wearTime();

        System.out.println("**********");
        Eyewear eyewear1 = new Sunglasses();
        eyewear1.type();
        eyewear1.purpose();
        eyewear1.frameMaterial();
        eyewear1.style();
        eyewear1.wearTime();

        System.out.println("***** 72 *****");
        Lotion lotion = new Lotion();
        lotion.apply();
        lotion.fragrance();
        lotion.texture();
        lotion.usageTime();
        lotion.packaging();

        System.out.println("**********");
        Moisturizer moisturizer = new Moisturizer();
        moisturizer.apply();
        moisturizer.fragrance();
        moisturizer.texture();
        moisturizer.usageTime();
        moisturizer.packaging();

        System.out.println("**********");
        Lotion lotion1 = new Moisturizer();
        lotion1.apply();
        lotion1.fragrance();
        lotion1.texture();
        lotion1.usageTime();
        lotion1.packaging();

        System.out.println("**** 73 ******");
        Technology tech = new Technology();
        tech.purpose();
        tech.evolve();
        tech.accessibility();
        tech.innovation();
        tech.impact();

        System.out.println("**********");
        VirtualReality vr = new VirtualReality();
        vr.purpose();
        vr.evolve();
        vr.accessibility();
        vr.innovation();
        vr.impact();

        System.out.println("**********");
        Technology tech1 = new VirtualReality();
        tech1.purpose();
        tech1.evolve();
        tech1.accessibility();
        tech1.innovation();
        tech1.impact();

        System.out.println("**** 74 *****");
        Product product = new Product();
        product.name();
        product.price();
        product.manufactureDate();
        product.expiryDate();
        product.use();

        System.out.println("**********");
        Sunscreen sunscreen = new Sunscreen();
        sunscreen.name();
        sunscreen.price();
        sunscreen.manufactureDate();
        sunscreen.expiryDate();
        sunscreen.use();

        System.out.println("**********");
        Product product1 = new Sunscreen();
        product1.name();
        product1.price();
        product1.manufactureDate();
        product1.expiryDate();
        product1.use();

        System.out.println("***** 75 *****");
        Network network = new Network();
        network.type();
        network.speed();
        network.range();
        network.security();
        network.connect();

        System.out.println("**********");
        WiFi wifi = new WiFi();
        wifi.type();
        wifi.speed();
        wifi.range();
        wifi.security();
        wifi.connect();

        System.out.println("**********");
        Network network1 = new WiFi();
        network1.type();
        network1.speed();
        network1.range();
        network1.security();
        network1.connect();

        System.out.println("***** 76 *****");
        Character character = new Character();
        character.name();
        character.role();
        character.origin();
        character.strength();
        character.costume();

        System.out.println("**********");
        Superhero superhero = new Superhero();
        superhero.name();
        superhero.role();
        superhero.origin();
        superhero.strength();
        superhero.costume();

        System.out.println("**********");
        Character character1 = new Superhero();
        character1.name();
        character1.role();
        character1.origin();
        character1.strength();
        character1.costume();

        System.out.println("***** 77 *****");
        Package pkg = new Package();
        pkg.weight();
        pkg.size();
        pkg.content();
        pkg.label();
        pkg.fragile();

        System.out.println("**********");
        Delivery delivery = new Delivery();
        delivery.weight();
        delivery.size();
        delivery.content();
        delivery.label();
        delivery.fragile();

        System.out.println("**********");
        Package pkg1 = new Delivery();
        pkg1.weight();
        pkg1.size();
        pkg1.content();
        pkg1.label();
        pkg1.fragile();

        System.out.println("***** 78 *****");
        Creature creature = new Creature();
        creature.habitat();
        creature.diet();
        creature.sound();
        creature.move();
        creature.defense();

        System.out.println("**********");
        Dragon dragon = new Dragon();
        dragon.habitat();
        dragon.diet();
        dragon.sound();
        dragon.move();
        dragon.defense();

        System.out.println("**********");
        Creature creature1 = new Dragon();
        creature1.habitat();
        creature1.diet();
        creature1.sound();
        creature1.move();
        creature1.defense();

        System.out.println("***** 79 *****");
        Brand brand = new Brand();
        brand.name();
        brand.products();
        brand.targetAudience();
        brand.quality();
        brand.popularity();

        System.out.println("**********");
        Max max = new Max();
        max.name();
        max.products();
        max.targetAudience();
        max.quality();
        max.popularity();

        System.out.println("**********");
        Brand brand1 = new Max();
        brand1.name();
        brand1.products();
        brand1.targetAudience();
        brand1.quality();
        brand1.popularity();

        System.out.println("**** 80 ******");
        Waterbody water = new Waterbody();
        water.name();
        water.size();
        water.contains();
        water.purpose();
        water.beauty();

        System.out.println("**********");
        Pond pond = new Pond();
        pond.name();
        pond.size();
        pond.contains();
        pond.purpose();
        pond.beauty();

        System.out.println("**********");
        Waterbody water1 = new Pond();
        water1.name();
        water1.size();
        water1.contains();
        water1.purpose();
        water1.beauty();

        System.out.println("***** 81 *****");
        Material material = new Material();
        material.name();
        material.source();
        material.property();
        material.use();
        material.recycle();

        System.out.println("**********");
        Rubber rubber = new Rubber();
        rubber.name();
        rubber.source();
        rubber.property();
        rubber.use();
        rubber.recycle();

        System.out.println("**********");
        Material material1 = new Rubber();
        material1.name();
        material1.source();
        material1.property();
        material1.use();
        material1.recycle();

        System.out.println("***** 82 *****");
        Fish fish = new Fish();
        fish.name();
        fish.habitat();
        fish.swim();
        fish.breathe();
        fish.eat();

        System.out.println("**********");
        Shark shark = new Shark();
        shark.name();
        shark.habitat();
        shark.swim();
        shark.breathe();
        shark.eat();

        System.out.println("**********");
        Fish fish1 = new Shark();
        fish1.name();
        fish1.habitat();
        fish1.swim();
        fish1.breathe();
        fish1.eat();

        System.out.println("***** 83 *****");
        Room room = new Room();
        room.type();
        room.furniture();
        room.lighting();
        room.decor();
        room.use();

        System.out.println("**********");
        Studio studio = new Studio();
        studio.type();
        studio.furniture();
        studio.lighting();
        studio.decor();
        studio.use();

        System.out.println("**********");
        Room room1 = new Studio();
        room1.type();
        room1.furniture();
        room1.lighting();
        room1.decor();
        room1.use();

        System.out.println("****** 84 ****");
        Notebook notebook = new Notebook();
        notebook.purpose();
        notebook.size();
        notebook.binding();
        notebook.pages();
        notebook.cover();

        System.out.println("**********");
        Journal journal = new Journal();
        journal.purpose();
        journal.size();
        journal.binding();
        journal.pages();
        journal.cover();

        System.out.println("**********");
        Notebook notebook1 = new Journal();
        notebook1.purpose();
        notebook1.size();
        notebook1.binding();
        notebook1.pages();
        notebook1.cover();

        System.out.println("***** 85 *****");
        Scent scent = new Scent();
        scent.aroma();
        scent.origin();
        scent.strength();
        scent.moodEffect();
        scent.use();

        System.out.println("**********");
        Vanilla vanilla = new Vanilla();
        vanilla.aroma();
        vanilla.origin();
        vanilla.strength();
        vanilla.moodEffect();
        vanilla.use();

        System.out.println("**********");
        Scent scent1 = new Vanilla();
        scent1.aroma();
        scent1.origin();
        scent1.strength();
        scent1.moodEffect();
        scent1.use();

        System.out.println("**** 86 ******");
        Wallpaper wallpaper = new Wallpaper();
        wallpaper.design();
        wallpaper.material();
        wallpaper.purpose();
        wallpaper.durability();
        wallpaper.application();

        System.out.println("**********");
        Pastel pastel = new Pastel();
        pastel.design();
        pastel.material();
        pastel.purpose();
        pastel.durability();
        pastel.application();

        System.out.println("**********");
        Wallpaper wallpaper1 = new Pastel();
        wallpaper1.design();
        wallpaper1.material();
        wallpaper1.purpose();
        wallpaper1.durability();
        wallpaper1.application();

        System.out.println("***** 87 *****");
        Glass glass = new Glass();
        glass.material();
        glass.transparency();
        glass.fragility();
        glass.usage();
        glass.recycling();

        System.out.println("**********");
        Mirror mirror = new Mirror();
        mirror.material();
        mirror.transparency();
        mirror.fragility();
        mirror.usage();
        mirror.recycling();

        System.out.println("**********");
        Glass glass1 = new Mirror();
        glass1.material();
        glass1.transparency();
        glass1.fragility();
        glass1.usage();
        glass1.recycling();

        System.out.println("***** 88 *****");
        Stone stone = new Stone();
        stone.origin();
        stone.weight();
        stone.texture();
        stone.color();
        stone.usage();

        System.out.println("**********");
        Gemstone gem = new Gemstone();
        gem.origin();
        gem.weight();
        gem.texture();
        gem.color();
        gem.usage();

        System.out.println("**********");
        Stone stone1 = new Gemstone();
        stone1.origin();
        stone1.weight();
        stone1.texture();
        stone1.color();
        stone1.usage();

        System.out.println("***** 89 *****");
        Dance dance = new Dance();
        dance.rhythm();
        dance.expression();
        dance.steps();
        dance.music();
        dance.purpose();

        System.out.println("**********");
        Bharatanatyam bharat = new Bharatanatyam();
        bharat.rhythm();
        bharat.expression();
        bharat.steps();
        bharat.music();
        bharat.purpose();

        System.out.println("**********");
        Dance dance1 = new Bharatanatyam();
        dance1.rhythm();
        dance1.expression();
        dance1.steps();
        dance1.music();
        dance1.purpose();

        System.out.println("***** 90 *****");
        MartialArt arts = new MartialArt();
        arts.stance();
        arts.discipline();
        arts.technique();
        arts.training();
        arts.purpose();

        System.out.println("**********");
        Karate karate = new Karate();
        karate.stance();
        karate.discipline();
        karate.technique();
        karate.training();
        karate.purpose();

        System.out.println("**********");
        MartialArt arts1 = new Karate();
        arts1.stance();
        arts1.discipline();
        arts1.technique();
        arts1.training();
        arts1.purpose();

        System.out.println("***** 91 *****");
        Activity activity = new Activity();
        activity.start();
        activity.perform();
        activity.benefit();
        activity.duration();
        activity.end();

        System.out.println("**********");
        Yoga yoga = new Yoga();
        yoga.start();
        yoga.perform();
        yoga.benefit();
        yoga.duration();
        yoga.end();

        System.out.println("**********");
        Activity activity1 = new Yoga();
        activity1.start();
        activity1.perform();
        activity1.benefit();
        activity1.duration();
        activity1.end();

        System.out.println("***** 92 *****");
        Category category = new Category();
        category.mode();
        category.destination();
        category.budget();
        category.duration();
        category.experience();

        System.out.println("**********");
        RoadTrip roadTrip = new RoadTrip();
        roadTrip.mode();
        roadTrip.destination();
        roadTrip.budget();
        roadTrip.duration();
        roadTrip.experience();

        System.out.println("**********");
        Category category1 = new RoadTrip();
        category1.mode();
        category1.destination();
        category1.budget();
        category1.duration();
        category1.experience();

        System.out.println("***** 93 *****");
        Media media = new Media();
        media.type();
        media.play();
        media.pause();
        media.stop();
        media.share();

        System.out.println("**********");
        Song song = new Song();
        song.type();
        song.play();
        song.pause();
        song.stop();
        song.share();

        System.out.println("**********");
        Media media1 = new Song();
        media1.type();
        media1.play();
        media1.pause();
        media1.stop();
        media1.share();

        System.out.println("****** 94 ****");
        Ruler ruler = new Ruler();
        ruler.rule();
        ruler.protect();
        ruler.strategize();
        ruler.lead();
        ruler.legacy();

        System.out.println("**********");
        King king = new King();
        king.rule();
        king.protect();
        king.strategize();
        king.lead();
        king.legacy();

        System.out.println("**********");
        Ruler ruler1 = new King();
        ruler1.rule();
        ruler1.protect();
        ruler1.strategize();
        ruler1.lead();
        ruler1.legacy();

        System.out.println("**** 95 ******");
        Part part = new Part();
        part.manufacture();
        part.test();
        part.ship();
        part.assemble();
        part.label();

        System.out.println("**********");
        Wheel wheel = new Wheel();
        wheel.manufacture();
        wheel.test();
        wheel.ship();
        wheel.assemble();
        wheel.label();

        System.out.println("**********");
        Part part1 = new Wheel();
        part1.manufacture();
        part1.test();
        part1.ship();
        part1.assemble();
        part1.label();

        System.out.println("**** 96 ******");
        Shape shape = new Shape();
        shape.draw();
        shape.rotate();
        shape.scale();
        shape.move();
        shape.erase();

        System.out.println("**********");
        Circle circle = new Circle();
        circle.draw();
        circle.rotate();
        circle.scale();
        circle.move();
        circle.erase();

        System.out.println("**********");
        Shape shape1 = new Circle();
        shape1.draw();
        shape1.rotate();
        shape1.scale();
        shape1.move();
        shape1.erase();

        System.out.println("**** 97 ******");
        Stationery stationery = new Stationery();
        stationery.write();
        stationery.draw();
        stationery.erase();
        stationery.sharpen();
        stationery.store();

        System.out.println("**********");
        Pencil pencil = new Pencil();
        pencil.write();
        pencil.draw();
        pencil.erase();
        pencil.sharpen();
        pencil.store();

        System.out.println("**********");
        Stationery stationery1 = new Pencil();
        stationery1.write();
        stationery1.draw();
        stationery1.erase();
        stationery1.sharpen();
        stationery1.store();

        System.out.println("***** 98 *****");
        Herb herb = new Herb();
        herb.grow();
        herb.smell();
        herb.harvest();
        herb.dry();
        herb.use();

        System.out.println("**********");
        Oregano oregano = new Oregano();
        oregano.grow();
        oregano.smell();
        oregano.harvest();
        oregano.dry();
        oregano.use();

        System.out.println("**********");
        Herb herb1 = new Oregano();
        herb1.grow();
        herb1.smell();
        herb1.harvest();
        herb1.dry();
        herb1.use();

        System.out.println("**** 99 ******");
        OpticalItem opticalItem = new OpticalItem();
        opticalItem.focusLight();
        opticalItem.magnify();
        opticalItem.assistVision();
        opticalItem.material();
        opticalItem.usage();

        System.out.println("**********");
        Lens lens = new Lens();
        lens.focusLight();
        lens.magnify();
        lens.assistVision();
        lens.material();
        lens.usage();

        System.out.println("**********");
        OpticalItem opticalItem1 = new Lens();
        opticalItem1.focusLight();
        opticalItem1.magnify();
        opticalItem1.assistVision();
        opticalItem1.material();
        opticalItem1.usage();

        System.out.println("***** 100 *****");
        Spirit spirit = new Spirit();
        spirit.appear();
        spirit.vanish();
        spirit.haunt();
        spirit.whisper();
        spirit.floatAround();

        System.out.println("**********");
        Ghost ghost = new Ghost();
        ghost.appear();
        ghost.vanish();
        ghost.haunt();
        ghost.whisper();
        ghost.floatAround();

        System.out.println("**********");
        Spirit spirit1 = new Ghost();
        spirit1.appear();
        spirit1.vanish();
        spirit1.haunt();
        spirit1.whisper();
        spirit1.floatAround();
    }
}
