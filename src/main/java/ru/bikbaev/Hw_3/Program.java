package ru.bikbaev.Hw_3;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Freelancer("Василий", "Петров", 70));
        employeeList.add(new Freelancer("Семен", "Сидоров", 900));
        employeeList.add(new Freelancer("Алексей", "Иванов", 233));
        employeeList.add(new Freelancer("Александр", "Пушкин", 500));
        employeeList.add(new Worker("Vlad", "Gosling", 100_000));
        employeeList.add(new Worker("Sergei", "Allen", 130_000));
        employeeList.add(new Worker("Miha", "Benner", 150_000));

        System.out.println(employeeList);


    }
}
