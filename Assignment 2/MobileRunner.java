class Mobile {
    public static String getNameByMobile(String mobile) {
        if (mobile == "9876543210") {
            return "Rajesh";
        } else if (mobile == "8765432109") {
            return "Suresh";
        } else if (mobile == "7654321098") {
            return "Priya";
        } else if (mobile == "6543210987") {
            return "Anjali";
        } else if (mobile == "5432109876") {
            return "Vikram";
        } else if (mobile == "4321098765") {
            return "Neha";
        } else if (mobile == "3210987654") {
            return "Amit";
        } else if (mobile == "2109876543") {
            return "Ravi";
        } else if (mobile == "1098765432") {
            return "Sunita";
        } else if (mobile == "0987654321") {
            return "Manoj";
        } else if (mobile == "1111111111") {
            return "Kiran";
        } else if (mobile == "2222222222") {
            return "Pooja";
        } else if (mobile == "3333333333") {
            return "Ajay";
        } else if (mobile == "4444444444") {
            return "Sneha";
        } else if (mobile == "5555555555") {
            return "Rahul";
        } else if (mobile == "6666666666") {
            return "Deepak";
        } else if (mobile == "7777777777") {
            return "Swati";
        } else if (mobile == "8888888888") {
            return "Arjun";
        } else if (mobile == "9999999999") {
            return "Meena";
        } else if (mobile == "1010101010") {
            return "Vikas";
        } else if (mobile == "1212121212") {
            return "Kavita";
        } else if (mobile == "1313131313") {
            return "Sanjay";
        } else if (mobile == "1414141414") {
            return "Ritu";
        } else {
            return "Unknown";
        }
    }
}

class MobileRunner {
    public static void main(String[] args) {
        String mobile = "9876543210";
		String Name = Mobile.getNameByMobile(mobile);
        System.out.println("Name: " + Name);
    }
}
