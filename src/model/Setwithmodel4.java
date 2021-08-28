package model;

import models.Doctor;

import java.util.HashSet;

public class Setwithmodel4 {

    public void demo() {

        HashSet<Doctor> information = new HashSet<>();

        Doctor DR = new Doctor("Dr.Sanjay Verma", 40, 60000.0, "Sanjay Verma Hospital", 10);
        Doctor DR2 = new Doctor("Dr.Sanjeev Jain", 45, 70000.0, "Sanjeev Jain Hospital", 20);
        Doctor DR3 = new Doctor("Dr.Ghosh ", 50, 75000.0, "Ghosh Hospital", 25);
        Doctor DR4 = new Doctor("Dr.Indrajeet", 35, 72000.0, "Indrajeet Yadav Hospital", 15);

        information.add(DR);
        information.add(DR2);
        information.add(DR3);
        information.add(DR4);

        for (Doctor var : information) {
            System.out.println(var.getName());
            System.out.println(var.getAge());
            System.out.println(var.getSalary());
            System.out.println(var.getHospital());
            System.out.println(var.getNurse());
        }





    }

    public static void main(String[] args) {
        Setwithmodel4 obj = new Setwithmodel4();
        obj.demo();
    }
}


