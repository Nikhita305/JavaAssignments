package com.xworkz.interfaceC.runner;

import com.xworkz.interfaceC.external.*;
import com.xworkz.interfaceC.internal.*;

public class ConnectorRunner {
    public static void main(String[] args) {
        Connector connector = new ConnectorImp();
        ConnectorUser connectorUser = new ConnectorUser(connector);
        connectorUser.execute();

        Icc icc = new IndianCricketTeamIccImpl();
        BCCI bcci = new BCCI(icc);
        bcci.conductMatch();

        Constitution constitution = new CitizenConstitutionImpl();
        Government government = new Government(constitution);
        government.enforceLaws();

        Laptop laptop = new OperatingSystemImpl();
        OperatingSystem operatingSystem = new OperatingSystem(laptop);
        operatingSystem.startProcessing();

        Chocolate chocolate = new MilkChocolateImpl();
        ChocolateFactory factory = new ChocolateFactory(chocolate);
        factory.makeChocolate();

        Bank bank = new BankImp();
        BankUser bankUser = new BankUser(bank);
        bankUser.execute();

        School school = new SchoolImp();
        SchoolUser schoolUser = new SchoolUser(school);
        schoolUser.execute();

        China china = new ChineseCitizenImpl();
        ChineseGovernment cgovernment = new ChineseGovernment(china);
        cgovernment.implementPolicies();

        SIM sim = new AirtelSIMImpl();
        Mobile mobile = new Mobile(sim);
        mobile.useSIM();

        Money money = new CashMoneyImpl();
        Wallet wallet = new Wallet(money);
        wallet.useMoney();

        Currency currency = new DollarCurrencyImpl();
        ExchangeCenter exchangeCenter = new ExchangeCenter(currency);
        exchangeCenter.performExchange();

        Book book = new NovelBookImpl();
        Reader reader = new Reader(book);
        reader.startReading();

        Network network = new WiFiNetworkImpl();
        Device device = new Device(network);
        device.useNetwork();

        Wire wire = new EthernetWireImpl();
        Gadget gadget = new Gadget(wire);
        gadget.useWire();

        Country country = new IndiaCountryImpl();
        Administration administration = new Administration(country);
        administration.implementLaws();

        Charger charger = new FastChargerImpl();
        Phone phone = new Phone(charger);
        phone.charge();

        Car car = new SportsCarImpl();
        Driver driver = new Driver(car);
        driver.startDriving();

        Frame frame = new PhotoFrameImpl();
        Wall wall = new Wall(frame);
        wall.hangFrame();

        Camera camera = new DslrCameraImpl();
        Photographer photographer = new Photographer(camera);
        photographer.takePicture();

        Satellite satellite = new CommunicationSatelliteImpl();
        GroundStation groundStation = new GroundStation(satellite);
        groundStation.sendSignal();

        Planet planet = new EarthPlanetImpl();
        SolarSystem solarSystem = new SolarSystem(planet);
        solarSystem.spinPlanet();

        Android android = new SamsungAndroidImpl();
        Smartphone smartphone = new Smartphone(android);
        smartphone.runAndroid();

        TV tv = new LedTVImpl();
        Remote remote = new Remote(tv);
        remote.pressPowerButton();

        Fan fan = new CeilingFanImpl();
        Switch fanSwitch = new Switch(fan);
        fanSwitch.turnOn();

        Light light = new TubeLightImpl();
        Button button = new Button(light);
        button.press();

        Speaker speaker = new BluetoothSpeakerImpl();
        MusicPlayer player = new MusicPlayer(speaker);
        player.play();

        Microwave microwave = new ConvectionMicrowaveImpl();
        Kitchen kitchen = new Kitchen(microwave);
        kitchen.startCooking();

        Computer computer = new LaptopImpl();
        Technician technician = new Technician(computer);
        technician.powerUp();

        Drone drone = new QuadcopterDroneImpl();
        Pilot pilot = new Pilot(drone);
        pilot.takeOff();

        WashingMachine washingMachine = new FrontLoadWashingMachineImpl();
        LaundryRoom laundryRoom = new LaundryRoom(washingMachine);
        laundryRoom.startWashing();

        Refrigerator refrigerator = new SideBySideRefrigeratorImpl();
        KitchenAppliance appliance = new KitchenAppliance(refrigerator);
        appliance.startCooling();

        Printer printer = new LaserPrinterImpl();
        ComputerP computerp = new ComputerP(printer);
        computerp.startPrinting();

        AirConditioner ac = new WindowACImpl();
        Hall hall = new Hall(ac);
        hall.startCooling();

        SmartHomeDevice smartHomeDevice = new SmartLightImpl();
        HomeAssistant assistant = new HomeAssistant(smartHomeDevice);
        assistant.controlDevice();

        VirtualAssistant virtualAssistant = new SiriImpl();
        User user = new User(virtualAssistant);
        user.askQuestion();

        AutonomousCar autonomousCar = new TeslaImpl();
        TeslaDriver teslaDriver = new TeslaDriver(autonomousCar);
        teslaDriver.startJourney();

        Candy candy = new ChocolateCandyImpl();
        Person person = new Person(candy);
        person.enjoyCandy();

        Bike bike = new MountainBikeImpl();
        Racer racer = new Racer(bike);
        racer.startRace();

        Sky sky = new ClearSkyImpl();
        WeatherReporter reporter = new WeatherReporter(sky);
        reporter.reportWeather();

        Earth earth = new PlanetEarthImpl();
        Astronomer astronomer = new Astronomer(earth);
        astronomer.observeRotation();

        Ocean ocean = new PacificOceanImpl();
        MarineBiologist biologist = new MarineBiologist(ocean);
        biologist.studyOcean();

        Treasure treasure = new GoldTreasureImpl();
        Explorer explorer = new Explorer(treasure);
        explorer.uncoverTreasure();

        Hotspot hotspot = new WiFiHotspotImpl();
        HotspotUser hotspotUser = new HotspotUser(hotspot);
        hotspotUser.accessInternet();

        Mall mall = new ShoppingMallImpl();
        Customer customer = new Customer(mall);
        customer.shop();

        Brand brand = new NikeBrandImpl();
        Marketer marketer = new Marketer(brand);
        marketer.runAdCampaign();

        Company company = new TechCompanyImpl();
        Employee employee = new Employee(company);
        employee.work();

        Metro metro = new CityMetroImpl();
        Passenger passenger = new Passenger(metro);
        passenger.travel();

        Google google = new GoogleSearchImpl();
        GoogleUser googleUser = new GoogleUser(google);
        googleUser.browse();

        Screen screen = new LEDscreenImpl();
        Viewer viewer = new Viewer(screen);
        viewer.watch();

        Rocket rocket = new SpaceXRocketImpl();
        Astronaut astronaut = new Astronaut(rocket);
        astronaut.startMission();
    }
}