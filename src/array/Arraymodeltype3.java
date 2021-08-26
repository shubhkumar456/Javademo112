package array;

import models.Employee;

import java.util.ArrayList;

public class Arraymodeltype3 {

    public void demo() {

        ArrayList<Employee> detail = new ArrayList<>();

        Employee employee1 = new Employee("Vikram Batra", 25, "Army Section", "Captain", 40000.0);
        detail.add(employee1);

        Employee employee2 = new Employee("Sukhvir Pal", 27, "company commander", "lieutinent", 30000.0);
        detail.add(employee2);

        Employee employee3 = new Employee("Satveer Singh", 28, "Army Section", "Major", 60000.0);
        detail.add(employee3);

        for (Employee inp : detail) {

            System.out.println(inp.getName());
            System.out.println(inp.getAge());
            System.out.println(inp.getCompany());
            System.out.println(inp.getPosition());
            System.out.println(inp.getIncome());
        }



    }

    public static void main(String[] args) {

        Arraymodeltype3 obj = new Arraymodeltype3();
        obj.demo();
    }
}
