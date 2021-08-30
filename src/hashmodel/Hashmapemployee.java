package hashmodel;

import models.Employee;

import java.util.HashMap;

public class Hashmapemployee {

    public void main(){

        HashMap <String, Employee> empinfo = new HashMap<>();

        Employee employee1 = new Employee("shubhendra kumar",24,"wipro","manager",70000.0);
        Employee employee2 = new Employee("Arun singh",25,"ITC","manager",50000.0);
        Employee employee3 = new Employee("rahul singh",26,"Government","Loco pilot",75000.0);
        Employee employee4 = new Employee("Subodh kumar",27,"rini financial company","supervisor",40000.0);

        empinfo.put("A",employee1);
        empinfo.put("B",employee2);
        empinfo.put("C",employee3);
        empinfo.put("D",employee4);

        Employee employee = empinfo.get("A");
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
        System.out.println(employee.getPosition());
        System.out.println(employee.getAge());


        employee = empinfo.get("B");
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
        System.out.println(employee.getPosition());
        System.out.println(employee.getAge());

        employee = empinfo.get("C");
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
        System.out.println(employee.getPosition());
        System.out.println(employee.getAge());

        employee = empinfo.get("D");
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
        System.out.println(employee.getPosition());
        System.out.println(employee.getAge());

    }

    public static void main(String[] args) {


        Hashmapemployee  obj = new  Hashmapemployee();
        obj.main();
    }


}
