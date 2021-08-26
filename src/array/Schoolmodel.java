package array;

import models.School;

import java.util.ArrayList;

public class Schoolmodel {

    public void main(){

        ArrayList <School> detail = new ArrayList<>();

        School school1 = new School("MB Public School",400,"Twenty",10000.0);
        detail.add(school1);

        School school2 = new School("Tiny Tots Inter College",6000,"Hundred",20000.0);
        detail.add(school2);

        School school3 = new School("MS Senior Secondary School ",5000,"Forty",15000.0);
        detail.add(school3);

        School school4 = new School("Christ The King Inter College",7400,"Fifty",25000.0);
        detail.add(school4);

        for (School var : detail) {

            System.out.println(var.getName());
            System.out.println(var.getStudents());
            System.out.println(var.getTeachers());
            System.out.println(var.getSalary());

        }
        }

    public static void main(String[] args) {

        Schoolmodel obj = new Schoolmodel();
        obj.main();

    }


    }

