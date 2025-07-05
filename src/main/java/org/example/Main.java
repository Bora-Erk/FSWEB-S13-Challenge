package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runApp();
    }

    public static void runApp() {

        Healthplan hp = new Healthplan(1, "Standard Health Plan", Plan.BASIC);
        System.out.println(hp);


        Employee emp = new Employee(101, "Jane Doe", "jane@example.com", "1234", new String[3]);
        emp.addHealthPlan(0, hp.getName());
        emp.addHealthPlan(1, "Extra Vision Plan");
        emp.addHealthPlan(1, "Yine eklemeye çalış");
        emp.addHealthPlan(5, "Hatalı index");
        System.out.println(emp);


        Company company = new Company(555, "Tech Corp", 150000.0, new String[2]);
        company.addEmployee(0, emp.getFullName());
        company.addEmployee(1, "John Smith");
        company.addEmployee(1, "Duplicate");
        company.addEmployee(3, "Invalid");
        System.out.println(company);
    }
}
