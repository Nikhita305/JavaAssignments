class Nurse {
    public static void assist(String patientName) {
        System.out.println("Assists " + patientName);
    }
}

class Doctor {
    public static void treatment(String patientName, int age) {
        System.out.println("Doctor treats " + patientName + " Age: " + age);
        Nurse.assist(patientName);
    }
}

class Hospital {
    public static void checkup(String patientName, int age, String mobile, String email, String sickness) {
        System.out.println("Hospital check ups " + patientName + "Age: " + age + ", Mobile: " + mobile + ", Email: " + email + ", Sickness: " + sickness );
        Doctor.treatment(patientName, age);
    }
}

class HospitalRunner {
    public static void main(String[] args) {
        Hospital.checkup("Shri", 30, "1234567890", "shri@outlook.com", "Fever");
    }
}
