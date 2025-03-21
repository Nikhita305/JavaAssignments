class Person {
    public static String isAlive(String name) {
        if (name == "Amit") {
            return "Alive";
        } else if (name == "Neha") {
            return "Alive";
        } else if (name == "Rajesh") {
            return "Dead";
        } else if (name == "Priya") {
            return "Dead";
        } else if (name == "Vikas") {
            return "Alive";
        } else if (name == "Anjali") {
            return "Alive";
        } else if (name == "Ravi") {
            return "Dead";
        } else if (name == "Sneha") {
            return "Alive";
        } else {
            return "No idea";
        }
    }
}

class PersonRunner {
    public static void main(String[] args) {
        String name = "Priya";
        String alive = Person.isAlive(name);
        System.out.println(name + " " + alive);
    }
}
