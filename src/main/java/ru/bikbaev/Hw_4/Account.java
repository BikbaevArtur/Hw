package ru.bikbaev.Hw_4;

public class Account {
    private static int idCount = 1;
    private final int id;
    private int balance;


    public Account(int balance) {
        try {
            validate(balance);
            this.balance = balance;
        } catch (IllegalArgumentException e) {
            System.out.println("\n\u001B[31m" + "Баланс не может быть отрицательный" + "\u001B[0m");
        }
        this.id = idCount;
        idCount++;
    }


    public int getId() {
        return id;
    }


    public void printBalance() {
        System.out.printf("Остаток на счету %d рублей", balance);
    }


    public void depositMoney(int money) {
        try {
            validate(money);
            balance = balance + money;
            System.out.println("\u001b[32m" + "Пополнение счета на " + money + " рублей" + "\u001b[0m");
            printBalance();
        } catch (IllegalArgumentException e) {
            System.out.println("\n\u001B[31m" + "Внесение отрицательного баланса невозможет" + "\u001B[0m");
        }
    }


    public void writeOfMoney(int money) {
        try {
            validate(money);
            if (balance < money) {
                throw new InsufficientFundsException();
            }
            System.out.println("\n\u001b[32m" + "Списание с счета  " + money + " рублей" + "\u001b[0m");
            balance = balance - money;
            printBalance();

        } catch (IllegalArgumentException e) {
            System.out.println("\n\u001B[31m" + "Сумма списание не может быть отрицательной" + "\u001B[0m");
        } catch (InsufficientFundsException e) {
            System.out.println("\n\u001B[31m" + "Не хватает денежных средств на счету" + "\u001B[0m");
            printBalance();
        }
    }

    private void validate(int money) {
        if (money < 0) {
            throw new IllegalArgumentException();
        }
    }
}
