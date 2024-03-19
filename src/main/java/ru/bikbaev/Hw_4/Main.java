package ru.bikbaev.Hw_4;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(100);
        account.depositMoney(200);
        account.depositMoney(-22);
        account.writeOfMoney(200);
        account.writeOfMoney(-22);
        account.writeOfMoney(300);


    }
}
