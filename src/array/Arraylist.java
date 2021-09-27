package array;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

    public void demo(){

        List list = new ArrayList();

        list.add("Steve Smith");
        list.add("Andrew");
        list.add("Shubendra Kumar");
        list.add("Charles Xavier");


        System.out.println("printing element using get "+list.get(3));
        System.out.println("printing element using get "+list.get(0));
        System.out.println("printing element using get "+list.get(1));
        System.out.println("printing element using get "+list.get(2));



        for( Object var : list){
            System.out.println(var);

        }

        list.remove(3);
        list.remove(2);
        list.remove(0);

        for( Object var : list) {
            System.out.println(" Getting results After remove " + var);

        }
    }

    public static void main(String[] args) {
        Arraylist obj =new Arraylist();
        obj.demo();
    }

}
