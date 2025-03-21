class Bank {
    public static double getBalance(String accountNumber) {
        if (accountNumber == "1001001") {
            return 5000.75;
        } else if (accountNumber == "1001002") {
            return 12000.50;
        } else if (accountNumber == "1001003") {
            return 7500.00;
        } else if (accountNumber == "1001004") {
            return 3000.25;
        } else if (accountNumber == "1001005") {
            return 8900.60;
        } else if (accountNumber == "1001006") {
            return 15000.00;
        } else if (accountNumber == "1001007") {
            return 6200.80;
        } else if (accountNumber == "1001008") {
            return 4300.40;
        } else if (accountNumber == "1001009") {
            return 9800.90;
        } else if (accountNumber == "1001010") {
            return 11000.30;
        } else if (accountNumber == "1001011") {
            return 13500.75;
        } else if (accountNumber == "1001012") {
            return 4700.20;
        } else if (accountNumber == "1001013") {
            return 2500.95;
        } else if (accountNumber == "1001014") {
            return 8700.60;
        } else if (accountNumber == "1001015") {
            return 9200.10;
        } else if (accountNumber == "1001016") {
            return 14000.45;
        } else if (accountNumber == "1001017") {
            return 7800.55;
        } else {
            return -1;
        }
    }
}

class BankRunner {
    public static void main(String[] args) {
        String accountNumber = "1001001";
        double balance = Bank.getBalance(accountNumber);
        System.out.println("Balance: " + balance);
    }
}
