package hashmodel;

import models.Doctor;

import java.util.HashMap;

public class Doctorhas {

    public void demo(){

        HashMap <Integer, Doctor> name = new HashMap<>();

        Doctor DR = new Doctor("Dr.Sanjay Verma", 40, 60000.0, "Sanjay Verma Hospital", 10);
        Doctor DR2 = new Doctor("Dr.Sanjeev Jain", 45, 70000.0, "Sanjeev Jain Hospital", 20);
        Doctor DR3 = new Doctor("Dr.Ghosh ", 50, 75000.0, "Ghosh Hospital", 25);
        Doctor DR4 = new Doctor("Dr.Indrajeet", 35, 72000.0, "Indrajeet Yadav Hospital",25);

        name.put(1,DR);
        name.put(2,DR2);
        name.put(3,DR3);
        name.put(4,DR4);

        Doctor doctor =name.get(1);
        System.out.println(doctor.getName());
        System.out.println(doctor.getAge());
        System.out.println(doctor.getHospital());
        System.out.println(doctor.getNurse());
        System.out.println(doctor.getSalary());


        doctor =name.get(2);
        System.out.println(doctor.getName());
        System.out.println(doctor.getAge());
        System.out.println(doctor.getHospital());
        System.out.println(doctor.getNurse());
        System.out.println(doctor.getSalary());


        doctor =name.get(3);
        System.out.println(doctor.getName());
        System.out.println(doctor.getAge());
        System.out.println(doctor.getHospital());
        System.out.println(doctor.getNurse());
        System.out.println(doctor.getSalary());


        doctor =name.get(4);
        System.out.println(doctor.getName());
        System.out.println(doctor.getAge());
        System.out.println(doctor.getHospital());
        System.out.println(doctor.getNurse());
        System.out.println(doctor.getSalary());



    }

    public static void main(String[] args) {
        Doctorhas obj = new Doctorhas();
        obj.demo();
    }
}
