package model;

import models.Employee;

import java.util.HashSet;

public class Setwithmodel {

    public void demo() {

        HashSet<Employee> details = new HashSet<>();


        Employee employee1 = new Employee("subodh kumar", 26, "wipro", "manager", 43454.0);
        Employee employee2 = new Employee("amit kumar", 27, "ITC", "employer", 53454.0);
        Employee employee3 = new Employee("subodh kumar", 28, "Nivea", "branch officer", 67454.0);
        Employee employee4 = new Employee("subodh kumar", 29, "vivo", "chief executive officer", 230454.0);
        Employee employee5 = new Employee("subodh kumar", 30, "lenovo", "manager", 67454.0);


        details.add(employee1);
        details.add(employee2);
        details.add(employee3);
        details.add(employee4);
        details.add(employee5);

        for (Employee var : details) {
            System.out.println(var.getName());
            System.out.println(var.getAge());
            System.out.println(var.getCompany());
            System.out.println(var.getPosition());
            System.out.println(var.getIncome());


        }


    }

    public static void main(String[] args) {
        Setwithmodel obj = new Setwithmodel();
        obj.demo();
    }




}
