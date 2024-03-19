package ru.bikbaev.Hw_4;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("Баланс не может быть меньше 0");
    }
}
