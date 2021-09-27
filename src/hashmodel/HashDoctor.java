package hashmodel;

import models.Doctor;

import java.util.HashMap;

public class HashDoctor {

    public void demo(){

        HashMap<Integer, Doctor> detail = new HashMap<>();

        Doctor doctor1 = new Doctor("Dr. Kamal Singh Yadav",27,32000.0,"DR.Indrajeet Yadav Clinic",9);
        Doctor doctor2 = new Doctor("Dr. Om Prakash",47,12000.0,"DR.om Prakash Clinic",2);
        Doctor doctor3 = new Doctor("Dr. Sanjeev Jain",57,42000.0,"DR.Sanjeev Jain Clinic",8);
        Doctor doctor4 = new Doctor("Dr. Sanjay Verma",67,62000.0,"DR.Sanjay Verma Clinic",10);

        detail.put(1,doctor1);
        detail.put(2,doctor2);
        detail.put(3,doctor3);
        detail.put(4,doctor4);

        Doctor doctor = detail.get(1);
        System.out.println(doctor.getName());
        System.out.println(doctor.getAge());
        System.out.println(doctor.getSalary());
        System.out.println(doctor.getHospital());
        System.out.println(doctor.getNurse());

        doctor = detail.get(2);
        System.out.println(doctor.getName());
        System.out.println(doctor.getAge());
        System.out.println(doctor.getSalary());
        System.out.println(doctor.getHospital());
        System.out.println(doctor.getNurse());

        doctor = detail.get(3);
        System.out.println(doctor.getName());
        System.out.println(doctor.getAge());
        System.out.println(doctor.getSalary());
        System.out.println(doctor.getHospital());
        System.out.println(doctor.getNurse());

        doctor = detail.get(4);
        System.out.println(doctor.getName());
        System.out.println(doctor.getAge());
        System.out.println(doctor.getSalary());
        System.out.println(doctor.getHospital());
        System.out.println(doctor.getNurse());




    }

    public static void main(String[] args) {
        HashDoctor obj= new HashDoctor();
        obj.demo();
    }

}
