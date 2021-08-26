package array;

import models.Student;

import java.util.ArrayList;

public class Arraywithmodeltype {

    public void demo(){

        ArrayList <Student> Std =new ArrayList();

        Student student1= new Student("Shubendra Kumar",24,"Business Studies",25000.0);
        Std.add(student1);

        Student student2 = new Student("Arun Singh",23,"Statistics",30000.0);
        Std.add(student2);

        Student student3 = new Student("Subodh Kumar",26,"Science",35000.0);
        Std.add(student3);

        Student student4 =new Student("Ravindra Nishad",25,"Polity Science",40000.0);
        Std.add(student4);

        for (Student var : Std){
            System.out.println(var.getName());
            System.out.println(var.getAge());
            System.out.println(var.getSection());
            System.out.println(var.getSalary());

        }

    }

    public static void main(String[] args) {

        ArrayinModeltype obj = new ArrayinModeltype();
        obj.demo();
    }
}
