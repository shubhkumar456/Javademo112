package hashmodel;

import models.Vivombl;

import java.util.HashMap;

public class Vivodemo {

    public void demo() {

        HashMap <String,Vivombl> details = new HashMap<>();

        Vivombl vivo1 = new Vivombl("Vivo Z1pro", "Vivo Mobile India", 01, 17599.0);
        Vivombl vivo2 = new Vivombl("Vivo Y55l", "Vivo Mobile India", 02, 12599.0);
        Vivombl vivo3 = new Vivombl("Vivo Y21", "Vivo Mobile India", 03, 15599.0);
        Vivombl vivo4 = new Vivombl("Vivo X60", "Vivo Mobile India", 04, 45599.0);

        details.put("a",vivo1);
        details.put("b",vivo2);
        details.put("c",vivo3);
        details.put("d",vivo4);

        Vivombl vivombl = details.get("a");
        System.out.println(vivombl.getManufacturer());
        System.out.println(vivombl.getBrand());
        System.out.println(vivombl.getPrice());
        System.out.println(vivombl.getUnits());

        vivombl = details.get("b");
        System.out.println(vivombl.getManufacturer());
        System.out.println(vivombl.getBrand());
        System.out.println(vivombl.getPrice());
        System.out.println(vivombl.getUnits());


        vivombl = details.get("c");
        System.out.println(vivombl.getManufacturer());
        System.out.println(vivombl.getBrand());
        System.out.println(vivombl.getPrice());
        System.out.println(vivombl.getUnits());

        vivombl = details.get("d");
        System.out.println(vivombl.getManufacturer());
        System.out.println(vivombl.getBrand());
        System.out.println(vivombl.getPrice());
        System.out.println(vivombl.getUnits());




    }

    public static void main(String[] args) {
        Vivodemo obj = new Vivodemo();
        obj.demo();
    }

}
