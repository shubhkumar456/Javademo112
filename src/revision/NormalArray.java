package revision;

import models.Vivombl;

import java.util.ArrayList;

public class NormalArray {

    public void demo(){

        int[] numarray ={12,13,14,11,15};
        for (int i=0; i< numarray.length; i++){
            System.out.println("Print Numbers :"+numarray[i]);
        }

        int [] nums ={123,234,345,456,567};
        for (int var : nums){
            System.out.println("Print Some Numbers :"+var );
        }

        String [] names ={"shubendra","gulshan","Subodh","Arun","Golu"};
        for(String var : names){
            System.out.println("Printing names :"+var);
        }

        String [] naame ={"Vivo","Oppo","OnePlus","IPhone","Samsung"};
        for(int i=0; i< naame.length; i++){
            System.out.println("Print Mobile Names :"+naame[i]);
        }

        double [] prices = {222.2,333.3,444.4,555.5,666.6};
        for(int i=0; i< prices.length; i++){
            System.out.println("Print Some different Prices :"+prices[i]);
        }

        double [] price = {111.1,212.1,312.2,423.3,432.1};
        for(double val : price){
            System.out.println("Print different Prices :"+val);
        }
    }

    public void demo2(){

        ArrayList <Integer> num = new ArrayList<>();

        num.add(100);
        num.add(200);
        num.add(300);
        num.add(400);

        for (Object val : num){
            System.out.println("Print Some Hundreds :"+val);
        }

        ArrayList <Double> figures = new ArrayList<>();

        figures.add(100.0);
        figures.add(200.0);
        figures.add(300.0);
        figures.add(400.0);

        for(Object var : figures){
            System.out.println("Print Some Hundreds in Double's Figures :"+var);
        }

        ArrayList <String> name = new ArrayList<>();

        name.add("Shubendra Kumar");
        name.add("Parmendra Kumar");
        name.add("Hitendra Kumar");
        name.add("Gulshan Kumar");

        for (Object var : name){
            System.out.println("Print some names :"+var);
        }

    }


    public void mode(){

        ArrayList <Vivombl> varities = new ArrayList<>();

        Vivombl vivo = new Vivombl("Vivo Y55L","Made In India",1,17999.9);
        varities.add(vivo);

        Vivombl vivo2 = new Vivombl("Vivo Y51I","Made In China",2,14000.0);
        varities.add(vivo2);

        Vivombl vivo3 = new Vivombl("Vivo Z1 Pro","Made In America",3,15999.9);
        varities.add(vivo3);

        Vivombl vivo4 = new Vivombl("Vivo Y31M","Made In Ireand",4,16555.5);
        varities.add(vivo4);

        for (Vivombl mbl : varities){
            System.out.println("Print some Mobile names differ prices :"+mbl.getBrand());
            System.out.println("Print some Mobile names differ prices :"+mbl.getManufacturer());
            System.out.println("Print some Mobile names differ prices :"+mbl.getUnits());
            System.out.println("Print some Mobile names differ prices :"+mbl.getPrice());

        }
    }

    public static void main(String[] args) {
        NormalArray obj = new NormalArray();
        obj.demo();
        obj.demo2();
        obj.mode();
    }
}
