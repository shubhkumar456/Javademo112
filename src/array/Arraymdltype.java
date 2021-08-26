package array;

import models.Doctor;

import java.util.ArrayList;

public class Arraymdltype {

    public void demo(){

        ArrayList <Doctor> inf = new ArrayList<>();

         Doctor doctor1 = new Doctor("Dr. Mayank Aggarawal",35,65000.0,"Javitri Devi Hospital Tundla",30);
         inf.add(doctor1);

         Doctor doctor2 = new Doctor("Dr.Indrajit Yadav",32,70000.0,"Indrajit Hospital Tundla",10);
         inf.add(doctor2);

         Doctor doctor3 = new Doctor("Dr.Sanjay Verma",40,80000.0,"Sanjay Verma Hospital Tundla",8);
         inf.add(doctor3);

         Doctor doctor4 =new Doctor("Dr.Sanjeev Jain",45,75000.0,"Sanjeev Jain Hospital Tundla",7);
         inf.add(doctor4);

         for (Doctor output : inf){

             System.out.println(output.getName());

             System.out.println(output.getAge());

             System.out.println(output.getSalary());

             System.out.println(output.getHospital());

             System.out.println(output.getNurse());

         }

    }

    public static void main(String[] args) {

        Arraymdltype obj = new Arraymdltype();
        obj.demo();
    }
}
