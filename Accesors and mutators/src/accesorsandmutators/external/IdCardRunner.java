package accesorsandmutators.external;

import accesorsandmutators.internal.IdCard;

public class IdCardRunner {
    public static void main(String[] args) {
        IdCard idCard1 = new IdCard("Plastic", new String[]{"Blue", "Red"}, 3, "GH");
        IdCard idCard2 = new IdCard("Paper", new String[]{"Blue", "Yellow"}, 5, "GH");
        IdCard idCard3 = new IdCard("Polythene", new String[]{"Yellow", "Red"}, 5, "GH");

        IdCard[] idCards = {idCard1, idCard2, idCard3};

        Customer customer = new Customer();
        customer.student();
        customer.teacher();
        customer.employee(idCard1);
        customer.lectures(idCards);
    }
}
