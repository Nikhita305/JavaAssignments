class PostMaster {
    public static void deliver(String name, String address) {
        System.out.println("PostMaster delivers to " + name + " at " + address);
    }
}

class PostHeadMaster {
    public static void deliver(String name, String address) {
        System.out.println("PostHeadMaster processes for " + name);
        PostMaster.deliver(name, address);
    }
}

class RegionalPostOffice {
    public static void deliver(String name, String address) {
        System.out.println("Regional Post Office forwards for " + name);
        PostHeadMaster.deliver(name, address);
    }
}

class SubRegionalPostOffice {
    public static void deliver(String name, String address) {
        System.out.println("Sub-Regional Post Office forwards for " + name);
        RegionalPostOffice.deliver(name, address);
    }
}

class AreaPostOffice {
    public static void deliver(String name, String address) {
        System.out.println("Area Post Office processes for " + name);
        SubRegionalPostOffice.deliver(name, address);
    }
}

class PostRunner {
    public static void main(String[] args) {
        AreaPostOffice.deliver("Joy", "Bnglr");
    }
}
