package revision;

import java.util.ArrayList;

public class Arraywithgen {

    public void demo(){

        ArrayList <Integer> table = new ArrayList<>();

        table.add(12);
        table.add(14);
        table.add(16);
        table.add(18);
        table.add(20);
        table.add(22);

        for ( Object Var : table){
            System.out.println("Print Some Various table :-"+Var);
        }

        ArrayList <String> names = new ArrayList<>();

        names.add("Aanya Sahil");
        names.add("Guggu");
        names.add("Shinu Sahil");
        names.add("Beena Sahil");
        names.add("Manish Sahil");

        for (Object var : names){
            System.out.println("Print Some Names Of Family Member :-"+var);
        }

        ArrayList <Double> doublevalues = new ArrayList<>();

        doublevalues.add(12.1);
        doublevalues.add(13.3);
        doublevalues.add(14.4);
        doublevalues.add(15.5);
        doublevalues.add(20.1);

        for (Object var : doublevalues){
            System.out.println("Print some double values :-"+var);
        }
    }

    public void mode(){

        ArrayList <String> name = new ArrayList<>();

        name.add("My Name Is Shubendra Kumar");
        name.add("Her Name Is Katherine Brewster");
        name.add("The Boy Who's Name Is CarryMinati");
        name.add("This is the Channel of Tanmay Bhatt");

        for(Object Name : name){
            System.out.println("Printing Some Names :-"+Name);
        }

        ArrayList <Integer> integers = new ArrayList<>();

        integers.add(55);
        integers.add(44);
        integers.add(66);
        integers.add(77);

        for(Object Numbers : integers){
            System.out.println("Printing some numeric numbers :-"+Numbers);
        }

        ArrayList <Double> decimal = new ArrayList<>();

        decimal.add(11.2);
        decimal.add(12.2);
        decimal.add(13.4);
        decimal.add(14.4);

        for(Object Double : decimal){
            System.out.println("Printing some decimal numbers :-"+Double);
        }



    }

    public static void main(String[] args) {
        Arraywithgen obj = new Arraywithgen();
        obj.demo();
        obj.mode();
    }
}
