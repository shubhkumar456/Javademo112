package model;

import models.Vivombl;

import java.util.HashSet;

public class Setwithmodel3 {

    public void demo(){

        HashSet<Vivombl> specs = new HashSet<>();

        Vivombl vivo1 = new Vivombl("Vivo Z1pro","Vivo Mobile India",01,17599.0);
        Vivombl vivo2 = new Vivombl("Vivo Y55l","Vivo Mobile India",02,12599.0);
        Vivombl vivo3 = new Vivombl("Vivo Y21","Vivo Mobile India",03,15599.0);
        Vivombl vivo4 = new Vivombl("Vivo X60","Vivo Mobile India",04,45599.0);

        specs.add(vivo1);
        specs.add(vivo2);
        specs.add(vivo3);
        specs.add(vivo4);

        for (Vivombl var : specs){
            System.out.println(var.getBrand());
            System.out.println(var.getManufacturer());
            System.out.println(var.getUnits());
            System.out.println(var.getPrice());
        }

    }

    public static void main(String[] args) {
        Setwithmodel3 obj = new Setwithmodel3();
        obj.demo();
    }
}
