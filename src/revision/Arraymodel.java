package revision;

import models.Boat;
import models.Doctor;
import models.Employee;
import models.Vivombl;

import java.util.ArrayList;

public class Arraymodel {

    public void demo(){

        ArrayList<Boat> quality = new ArrayList<>();

        Boat b1 = new Boat("Boat Earphone",5,"wired",599.0-1500.0);
        Boat b2 = new Boat("Boat ",4,"Wireless Bluetooth ",2099.0-4500.0);
        Boat b3 = new Boat("Boat",6,"Air Dopes or Pods",2599.0-5999.0);
        Boat b4 = new Boat("Boat Avante Bar",3,"Three types of Bar With Different Watts",8999.0-12599.0);

        quality.add(b1);
        quality.add(b2);
        quality.add(b3);
        quality.add(b4);

        for (Boat output : quality){
            System.out.println(output.getBrand());
            System.out.println(output.getVarities());
            System.out.println(output.getTypes());
            System.out.println(output.getPrice());

        }


    }

    public void demo2(){

        ArrayList <Vivombl> specs =  new ArrayList<>();

        Vivombl v1 = new Vivombl("Vivo Y55L","Made In India",2,12999.0);
        Vivombl v2 = new Vivombl("Vivo YZL","Made In India",3,15999.0);
        Vivombl v3 = new Vivombl("Vivo Y51I","Made In India",4,17999.0);
        Vivombl v4 = new Vivombl("Vivo Z1 Pro","Made In India",5,19999.0);

        specs.add(v1);
        specs.add(v2);
        specs.add(v3);
        specs.add(v4);


        for (Vivombl print : specs){
            System.out.println(print.getBrand());
            System.out.println(print.getManufacturer());
            System.out.println(print.getUnits());
            System.out.println(print.getPrice());
        }

    }

    public void demo3(){

        ArrayList <Doctor> speciality = new ArrayList<>();

        Doctor d1 = new Doctor("Sanjeev Jain",34,40000.0,"Dr.Sanjeev Jain Clinic",10);
        Doctor d2 = new Doctor("Sanjay Verma",44,50000.0,"Dr.Sanjay Verma Clinic",20);
        Doctor d3 = new Doctor("Indrajeet Yadav",40,60000.0,"Dr.IndraJeet Yadav Clinic",30);
        Doctor d4 = new Doctor("Manik Chandra",55,70000.0,"Dr.Manik Chandra Clinic",40);

        speciality.add(d1);
        speciality.add(d2);
        speciality.add(d3);
        speciality.add(d4);

        for (Doctor printf : speciality){
            System.out.println(printf.getName());
            System.out.println(printf.getAge());
            System.out.println(printf.getSalary());
            System.out.println(printf.getHospital());
            System.out.println(printf.getNurse());
        }
    }

       public void demo4(){

        ArrayList <Employee> name = new ArrayList<>();

           Employee e1 = new Employee("Arun Singh",24,"Lenovo","Manager",40000.0);
           Employee e2 = new Employee("Ravendra Nishad",23,"Muscle Tech ","Chief executive officer",100000.0);
           Employee e3 = new Employee("Rahul Singh Rathore",27,"Muscle Blaze","Clerk",50000.0);
           Employee e4 = new Employee("Subodh Kumar Singh",26,"Rini Financial Services","Manager",60000.0);

           name.add(e1);
           name.add(e2);
           name.add(e3);
           name.add(e4);

           for (Employee resources : name){
               System.out.println(resources.getName());
               System.out.println(resources.getAge());
               System.out.println(resources.getCompany());
               System.out.println(resources.getPosition());
               System.out.println(resources.getIncome());
           }

       }

    public static void main(String[] args) {
        Arraymodel obj = new Arraymodel();
        obj.demo();
        obj.demo2();
        obj.demo3();
        obj.demo4();
    }
}
