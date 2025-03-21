class Company {
    public static String getOwner(String company) {
        if (company == "Reliance") {
            return "Mukesh Ambani";
        } else if (company == "Tata") {
            return "Ratan Tata";
        } else if (company == "Infosys") {
            return "Narayana Murthy";
        } else if (company == "Wipro") {
            return "Azim Premji";
        } else if (company == "Adani Group") {
            return "Gautam Adani";
        } else if (company == "HCL") {
            return "Shiv Nadar";
        } else if (company == "Bharti Airtel") {
            return "Sunil Mittal";
        } else if (company == "Mahindra") {
            return "Anand Mahindra";
        } else if (company == "L&T") {
            return "A.M. Naik";
        } else if (company == "Bajaj") {
            return "Rahul Bajaj";
        } else if (company == "Godrej") {
            return "Adi Godrej";
        } else if (company == "Hero Motocorp") {
            return "Pawan Munjal";
        } else {
            return "Unknown";
        }
    }
}

class CompanyRunner {
    public static void main(String[] args) {
        String company = "Reliance";
        String owner = Company.getOwner(company);
        System.out.println("Owner: " + owner);
    }
}
