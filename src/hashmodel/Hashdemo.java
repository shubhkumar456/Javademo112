package hashmodel;

import models.Student;

import java.util.HashMap;

public class Hashdemo {

    public void main(){

        HashMap <Integer, Student> hashstudent = new HashMap<>();


        Student student1 = new Student("Shubendra Kumar",24,"Financial Accounting",10000.0);
        Student student2 = new Student("Subodh Kumar",26,"Polity Science",20000.0);
        Student student3 = new Student("Arun Singh",24,"Busimess Studies",30000.0);
        Student student4 = new Student("ranvijay singha",28,"Economical Science",40000.0);

        hashstudent.put(1,student1);
        hashstudent.put(2,student2);
        hashstudent.put(3,student3);
        hashstudent.put(4,student4);

        Student student = hashstudent.get(1);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getSalary());
        System.out.println(student.getSection());

        student = hashstudent.get(2);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getSalary());
        System.out.println(student.getSection());

        student = hashstudent.get(3);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getSalary());
        System.out.println(student.getSection());

        student = hashstudent.get(4);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getSalary());
        System.out.println(student.getSection());



    }

    public static void main(String[] args) {

        Hashdemo obj = new Hashdemo();
        obj.main();
    }
}
