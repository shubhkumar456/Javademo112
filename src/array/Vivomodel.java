package array;

import models.Vivombl;

import java.util.ArrayList;

public class Vivomodel {

    public void main(){

        ArrayList <Vivombl> inbox = new ArrayList<>();

        Vivombl vivo1 =new Vivombl("Vivo z1pro","India",1,17999.0);
        inbox.add(vivo1);

        Vivombl vivo2 =new Vivombl("Vivo y55l","India",3,12999.0);
        inbox.add(vivo2);

        Vivombl vivo3 =new Vivombl("Vivo x20","India",2,47999.0);
        inbox.add(vivo3);

        Vivombl vivo4 =new Vivombl("Vivo y21","India",4,27999.0);
        inbox.add(vivo4);

        for (Vivombl var : inbox){

            System.out.println(var.getBrand());
            System.out.println(var.getManufacturer());
            System.out.println(var.getUnits());
            System.out.println(var.getPrice());

        }

    }


    public static void main(String[] args) {

        Vivomodel obj = new Vivomodel();
        obj.main();
    }
}
