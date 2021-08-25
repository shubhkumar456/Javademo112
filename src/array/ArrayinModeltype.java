package array;

import models.Student;

import java.util.ArrayList;

public class ArrayinModeltype {

    public void demo(){

        ArrayList<Student> studentsarraylist = new ArrayList<>();

        Student student1 = new Student("Suraj",23,"Commerce",32000.4);
        studentsarraylist.add(student1);

        Student student2 = new Student("Mohit",25,"Science",43000.20);
        studentsarraylist.add(student2);

        Student student3 = new Student("Arun",23,"Commerce",45500.50);
        studentsarraylist.add(student3);

        Student student4 = new Student("Shubendra",24,"Commerce",55000.60);
        studentsarraylist.add(student4);




                for(Student var: studentsarraylist){
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
