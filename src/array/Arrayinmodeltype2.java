package array;

import models.Employee;

import java.util.ArrayList;

public class Arrayinmodeltype2 {

    public void demo(){

        ArrayList <Employee> employearray = new ArrayList<>();

        Employee employee1 =new Employee("Subendra Kumar",24,"Samsung","Branch Manager",75000.0);
       employearray.add(employee1);

       Employee employee2 = new Employee("Gulshan Kumar",26,"Apple","Managing Director",75000.0);
       employearray.add(employee2);

       Employee employee3 = new Employee("Golu Singh",23,"Tata Comcultancy","Director",65000.0);
       employearray.add(employee3);

       Employee employee4 =new Employee("Subodh Kumar",26,"Whirpool Agency","Employee",55000.0);
       employearray.add(employee4);

       for (Employee var : employearray){

           System.out.println(var.getName());



       }

    }

    public static void main(String[] args) {

        Arrayinmodeltype2 obj = new Arrayinmodeltype2();
        obj.demo();
    }
}
