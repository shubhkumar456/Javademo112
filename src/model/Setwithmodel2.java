package model;

import models.Student;

import java.util.HashSet;

public class Setwithmodel2 {

    public void demo(){

        HashSet<Student> name= new HashSet<>();

        Student student1 = new Student("Shubendra Kumar",24,"Financial Accounting",10000.0);
        Student student2 = new Student("Subodh Kumar",26,"Polity Science",20000.0);
        Student student3 = new Student("Arun Singh",24,"Busimess Studies",30000.0);
        Student student4 = new Student("ranvijay singha",28,"Economical Science",40000.0);

        name.add(student1);
        name.add(student2);
        name.add(student3);
        name.add(student4);

        for (Student output : name){
            System.out.println(output.getName());
            System.out.println(output.getAge());
            System.out.println(output.getSection());
            System.out.println(output.getSalary());


        }
    }


    public static void main(String[] args) {
        Setwithmodel2 obj = new Setwithmodel2();
        obj.demo();
    }
}
