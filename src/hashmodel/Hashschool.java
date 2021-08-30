package hashmodel;

import models.School;

import java.util.HashMap;

public class Hashschool {

    public void schools(){

        HashMap <Double, School> info = new HashMap<>();


        School school1 = new School("mb public school",400,"Seema madam",8000.0);
        School school2 = new School("bishops convent school",5000,"Payal madam",8500.0);
        School school3 = new School("tiny tots inter college",10000,"Sanjay sharma",10000.0);
        School school4 = new School("ms senior secondary school",9000,"ashok kumar",9500.0);

        info.put(1.0,school1);
        info.put(2.0,school2);
        info.put(3.0,school3);
        info.put(4.0,school4);

        School school = info.get(1.0);
        System.out.println(school.getName());
        System.out.println(school.getStudents());
        System.out.println(school.getTeachers());
        System.out.println(school.getSalary());


        school = info.get(2.0);
        System.out.println(school.getName());
        System.out.println(school.getStudents());
        System.out.println(school.getTeachers());
        System.out.println(school.getSalary());


        school = info.get(3.0);
        System.out.println(school.getName());
        System.out.println(school.getStudents());
        System.out.println(school.getTeachers());
        System.out.println(school.getSalary());

        school = info.get(4.0);
        System.out.println(school.getName());
        System.out.println(school.getStudents());
        System.out.println(school.getTeachers());
        System.out.println(school.getSalary());
    }

    public static void main(String[] args) {
        Hashschool obj = new Hashschool();
        obj.schools();
    }
}
