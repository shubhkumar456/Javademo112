package array;

import java.util.ArrayList;

public class Arraylist2 {

    public void demo2(){

        ArrayList Object = new ArrayList();

        Object.add("Java scope");
        Object.add("Core Project");
        Object.add("Core Processor");
        Object.add("Intel Inside");
        Object.add("Lenovo Think pad");

        System.out.println("Inside the get method  "+Object.get(4));
        System.out.println("Inside the get method  "+Object.get(3));
        System.out.println("Inside the get method  "+Object.get(2));
        System.out.println("Inside the get method  "+Object.get(1));
        System.out.println("Inside the get method  "+Object.get(0));

        for ( Object var : Object ) {
            System.out.println(var);
        }

        Object.remove(4);
        for(Object var : Object){
            System.out.println( "After removing the forth text here we get this  "+var);
        }
    }

    public static void main(String[] args) {
        Arraylist2 obj =new Arraylist2();
        obj.demo2();
    }
}
