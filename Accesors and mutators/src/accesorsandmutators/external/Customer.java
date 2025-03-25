package accesorsandmutators.external;

import accesorsandmutators.internal.IdCard;

public class Customer {

    public Customer() {
        System.out.println("No-argument constructor running in Customer");
    }

    public void student() {
        System.out.println("Processing student ID card.");
    }

    public void teacher() {
        System.out.println("Processing teacher ID card.");
    }

    public void employee(IdCard idCard) {
        System.out.println("Employee ID Card Details:");
        if (idCard != null) {
            idCard.display();
        }
    }

    public void lectures(IdCard[] idCards) {
        System.out.println("Displaying ID cards for lectures...");
        if (idCards != null) {
            for (IdCard idCard : idCards) {
                idCard.display();
            }
        }
    }
}
