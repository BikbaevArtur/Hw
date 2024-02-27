package ru.bikbaev.Hw_3;

import java.math.BigDecimal;
import java.sql.Struct;

public class Freelancer extends Employee {

    final private String name;
    final private String lastName;
    private double bid;

    public Freelancer(String name, String lastName, double bid) {
        this.name = name;
        this.lastName = lastName;
        this.bid = bid;
    }

    @Override
    public double averageSalary() {
       return 20.8 * 8 * bid;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "Freelancer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bid=" + bid +
                '}';
    }
}
